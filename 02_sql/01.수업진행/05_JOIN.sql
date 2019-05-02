-------------------------------------------------------------
JOIN :
- 논리적으로 2개 이상의 테이블을 연결해서 정보를 가져오는 것
- from A, B ...
-------------------------------------------------------------

-- 카테시안 프로덕트(Cartesian Product)
-- 여러개의 테이블을 조인 할 때 증거조건(두개의 테이블을 연결하는 조건)이 명시되지 않아 
-- M(행의 수) * N(행의 수)의 결과를 반환하는 조인
select employee_id, last_name, department_name
  from employees, departments

-- Equi 조인
-- 증거조건의 연산자가 "=" 인 경우 
select employee_id, last_name, department_name
  from employees, departments
 where employees.department_id = departments.department_id;  
 
-- 조인시에는 테이블 Alias 사용하자..( 테이블이름은 as 사용 안됨 / 공백으로주기) (복잡해보이기때문에) 
select employee_id, last_name, department_name
  from employees e, departments d
 where e.department_id = d.department_id;  
 
-- 양쪽 테이블에 같은 이름의 컬럼이 있는 경우 필수로 컬림이름 앞에 테이블명을 적어야 한다.
select employee_id, last_name, department_name
  from employees e, departments d
 where e.department_id = d.department_id;  
-- 컬럼이름앞에 테이블명을 명시해줘야한다..
select e.employee_id, e.last_name, e.department_id, d.department_name
  from employees e, departments d
 where e.department_id = d.department_id;
 
-- 각 사원의 직무에 따른 최소 금여와 최대 급여를 화면에 출력하시오.
-- 사원명, 직무명, 최소급여, 최대급여를 출력.
-- jobs 테이블 참조
select e.last_name,
       j.job_title,
       j.min_salary,
       j.max_salary
  from jobs j, employees e
 where j.job_id = e.job_id; 
 
-- Canada 에 근무하는 사원의 도시명, 부서명, 사원명 출력하시오
select e.last_name, d.department_name, l.city  
  from employees e, 
       departments d, 
       locations l, 
       countries c
 where e.department_id = d.department_id
   and d.location_id = l.location_id
   and l.country_id = c.country_id
   and c.country_name = 'Canada';   
 
-- NonEqui 조인
-- 증거조건의 연산자가 "=" 아닌 경우
select e.last_name,
       s.grade,
       e.salary
  from tb_salgrade s, employees e
 where e.salary between s.min_sal and s.max_sal;
 
 
-- self join
--   : 물리적으로 하나의 테이블이나 논리적으로 2개 이상으로 사용

-- 사원을 관리하고 있는 매니저의 이름과 번호를 출력하는
select e.employee_id "사원 사번",
       e.last_name "사원 이름",
       m.last_name "관리자 이름",
       m.employee_id "관리자 사번"
  from employees e, 
       employees m
 where e.manager_id = m.employee_id 
order by e.employee_id ;
 

-- outer join
-- 조인결과를 만족하지 않더라도 결과에 포함
-- (+) 결과가 모자른 쪽에 붙인다.
-- 양쪽에 붙일 수 없다.
-- 모자른 컬럼 옆에 (+) 를 붙인다.
select e.employee_id "사원 사번",
       e.last_name "사원 이름",
       m.employee_id "관리자 사번"
       m.last_name "관리자 이름",
  from employees e, 
       employees m
 where e.manager_id = m.employee_id(+)
order by e.employee_id ;

-- 관리자가 없는 경우에 관리자이름 대신에 "관리자 없음" 이라고 출력
select e.employee_id "사원 사번",
       e.last_name "사원 이름",
       nvl(m.last_name, '관리자 없음') "관리자 이름",
       m.employee_id "관리자 사번"
  from employees e, 
       employees m
 where e.manager_id = m.employee_id(+)
order by e.employee_id ;
 
-- 숫자값이 들어갈 자리에 문자열이 들어가려면 타입이 맞아야함..
-- || 이용하여 타입을 맞춰준다 (자바의 + 연산과 비슷)
select e.employee_id "사원 사번",
       e.last_name "사원 이름",
       nvl(m.last_name, '관리자 없음') "관리자 이름",
       nvl(m.employee_id || '','관리자 없음') "관리자 사번"
  from employees e, 
       employees m
 where e.manager_id = m.employee_id(+)
order by e.employee_id ;
 


---------------------------------------------------------------------------


-- Ansi Join 방식으로 변경(표준)

-- cross join
select employee_id, last_name, department_name
  from employees 
 cross join departments;

-- inner join ~ on 증거조건 : Equi, Non Equi, self 조인
select e.employee_id, e.last_name, e.department_id, d.department_name
  from employees e
 inner join departments d
    on e.department_id = d.department_id;
 
-- 각 사원의 직무에 따른 최소 금여와 최대 급여를 화면에 출력하시오.
-- 사원명, 직무명, 최소급여, 최대급여를 출력.
-- jobs 테이블 참조
select e.last_name,
       j.job_title,
       j.min_salary,
       j.max_salary
  from jobs j 
 inner join employees e
    on j.job_id = e.job_id; 
 
-- Canada 에 근무하는 사원의 도시명, 부서명, 사원명 출력하시오
select e.last_name, d.department_name, l.city  
  from employees e 
 inner join departments d 
    on e.department_id = d.department_id
 inner join locations l
    on d.location_id = l.location_id
 inner join countries c
    on l.country_id = c.country_id
 where c.country_name = 'Canada';   
 
-- NonEqui 조인
-- 증거조건의 연산자가 "=" 아닌 경우
select e.last_name,
       s.grade,
       e.salary
  from tb_salgrade s
 inner join employees e
    on e.salary between s.min_sal and s.max_sal;
 
 
-- self join
--   : 물리적으로 하나의 테이블이나 논리적으로 2개 이상으로 사용

-- 사원을 관리하고 있는 매니저의 이름과 번호를 출력하는
select e.employee_id "사원 사번",
       e.last_name "사원 이름",
       m.last_name "관리자 이름",
       m.employee_id "관리자 사번"
  from employees e 
 inner join employees m
    on e.manager_id = m.employee_id 
order by e.employee_id ;
 

-- outer join
-- (left | right | full) outer join
select e.employee_id "사원 사번",
       e.last_name "사원 이름",
       m.employee_id "관리자 사번",
       m.last_name "관리자 이름"
  from employees e
left outer join employees m
    on e.manager_id = m.employee_id(+)
order by e.employee_id ;

-- 관리자가 없는 경우에 관리자이름 대신에 "관리자 없음" 이라고 출력
select e.employee_id "사원 사번",
       e.last_name "사원 이름",
       nvl(m.last_name, '관리자 없음') "관리자 이름",
       m.employee_id "관리자 사번"
  from employees e
left outer join employees m
    on e.manager_id = m.employee_id(+)
order by e.employee_id ;
 
-- 숫자값이 들어갈 자리에 문자열이 들어가려면 타입이 맞아야함..
-- || 이용하여 타입을 맞춰준다 (자바의 + 연산과 비슷)
select e.employee_id "사원 사번",
       e.last_name "사원 이름",
       nvl(m.last_name, '관리자 없음') "관리자 이름",
       nvl(m.employee_id || '','관리자 없음') "관리자 사번"
  from employees e 
left outer join employees m
    on e.manager_id = m.employee_id(+)
order by e.employee_id ;
 
 
 
 
 