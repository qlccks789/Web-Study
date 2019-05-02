-------------------------------------
Subquery
쿼리문안에 쿼리가 들어간 형태 
쿼리문
SELECT
  FROM 테이블
 WHERE 컬럼 = (쿼리문);
-------------------------------------
-- Chen 사원의 부서번호를 출력
-- 결과  : 100
select department_id
  from employees
 where last_name = 'Chen';

-- Single Row Subquery : 서브쿼리의 실행된 결과행이 1개인 것
-- Chen 사원과 같은 부서에서 일하는 사원의 정보를 출력
select *
  from employees
 where department_id = (Chen의 부서번호);
 
select *
  from employees
 where department_id = (select department_id
                          from employees
                         where last_name = 'Chen');
 
-- Chen 사원의 직무와 같은 직무를 가지는 사원들의 정보를 출력
select job_id
  from employees
 where last_name = 'Chen';
 
select *
  from employees
 where job_id = (select job_id
                   from employees
                  where last_name = 'Chen');
  
-- Chen 사원의 직무와 같은 직무를 가지는 사원들의 정보를 출력
-- 단, Chen 은 제외하고 출력
select *
  from employees
 where job_id = (select job_id
                   from employees
                  where last_name = 'Chen')
  and last_name <> 'Chen';
  
-- King 사원과 같은 부서에 근무하는 사원의 정보를 출력
-- [Error] : single-row subquery returns more than one row

select *
  from employees
 where department_id = (select department_id
                          from employees
                         where last_name = 'King');

-- Multi-Row Subquery : 서브쿼리의 결과행이 2개 이상인 경우
-- IN,  >ALL, >ANY,  <ALL, <ANY
-- IN  ( 같다 (=) 의 조건이 2가지 이상일 때 )
select *
  from employees
 where department_id = (80, 90);
->
select *
  from employees
 where department_id in (80, 90);
->
select *
  from employees
 where department_id in (select department_id
                          from employees
                         where last_name = 'King');

-- 30번 부서의 사원들이 받는 급여보다 급여를 많이 받는 사원의 정보를 출력
-- ALL (조건을 다 포함하여 맞는 값)  
-- ANY (조건 중 하나라도 넘기면 됨)  
-- max 와 min 으로도 사용할수있다.  

-- ALL은 11000 보다 높은 애들만 출력
select *
  from employees
 where salary >ALL (11000, 3100, 2900, 2800, 2600, 2500);
-- ANY 는 조건중 하나만이라도 높은애들 다 출력
select *
  from employees
 where salary >ANY (11000, 3100, 2900, 2800, 2600, 2500);
                          
select *
  from employees
 where salary >ALL (select salary
                   from employees
                  where department_id = 30);
                  
-- Multi Column Subquery
-- 각 부서에서 최소급여를 받는 사원의 정보를 출력하시오
-- 버그 발생함 : 내 급여가 모든 부서들의 최소급여와 같은 경우 출력
select *
  from employees
 where salary in (select min(salary)
                    from employees
                   group by department_id);

select *
  from employees
 where (department_id, salary) in (select department_id, min(salary)
                    from employees
                   group by department_id);


-- 서브쿼리의 사용 위치..
-- SELECT, FROM, WHERE
select e.last_name, e.department_id, d.department_name
  from employees e
inner join departments d
    on e.department_id = d.department_id;
-- 위와 아래는 같은 코드
select e.last_name, e.department_id, d.department_name
  from employees e, departments d
 where e.department_id = d.department_id;

-- subquery로 변경하기
select e.last_name, e.department_id, 
       d.department_name
  from employees e;

select department_name
  from departments
 where department_id = 90
 
-- select 절의 subquery
select e.last_name, e.department_id,
       (select department_name
         from departments
        where department_id = e.department_id)
  from employees e;

-- FROM 절에 사용하는 서브쿼리 : INLINE VIEW
select *
  from (select employee_id, salary
          from employees
         order by salary desc);
         
-- 10명의 사원만 화면에 출력하시오.
-- rownum의 활용 : 화면에 출력되는 데이터에 숫자값을 고유하게 붙여준다.(1부터)
select rownum, last_name, salary
  from employees;
  
select rownum, last_name, salary
  from employees
 where rownum < 11;
  
-- Top-N Subquery 
-- 사원중에서 가장 많은 급여를 받는 10명을 화면에 출력하시오
-- from 절 부터 수행되기때문에 from 에서 서브쿼리로 정렬을 먼저 해주고 where을 수행하도록한다.
select rownum, last_name, salary
  from (select * 
          from employees
         order by salary desc)
 where rownum < 11;

-- rownum 의 성격
select * from employees where rownum = 1; (O)
select * from employees where rownum = 2; (X)
select * from employees where rownum = 3; (X)
select * from employees where rownum = 4; (X)
select * from employees where rownum < 5; (O)

select *
  from (select *
          from employees
         order by salary desc)
 where rownum between 1 and 3;  -> (O)
 where rownum between 4 and 6;  -> (X)
 where rownum between 7 and 9;  -> (X)
-- 같은 의미
select *
  from ( select rownum as rnum, a.*
  from (select *
          from employees
         order by salary desc) a)
  where rnum between 4 and 6;
 