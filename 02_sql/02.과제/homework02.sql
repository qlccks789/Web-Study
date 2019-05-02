문제. 1 
담당업무별 최대 급여와 최소 급여를 출력하시오. 단, 담당업무는 영업 부서로 제한. (영업부서 - 영업대표(SA_REP), 영업관리자(SA_MAN) 

select e.job_id, MAX(salary), MIN(salary)
  from employees e
 where e.job_id in ('SA_MAN', 'SA_REP')
 group by job_id;

문제. 2 
담당업무별로 최대 급여가 얼마인지 출력하시오(급여가 높은 순 출력) 
결과행 : 19행 

select e.job_id, MAX(salary) as MAX_SAL
  from employees e
 group by job_id
 order by max_sal desc;

문제. 3 
사원의 월급이 Programmer 업무에 해당하는 연봉의 상한과 하한에 포함되는 사원의 정보를 출력 하시오. – 연봉의 상한과 하한은 JOBS 테이블 참고 
결과행 : 50행 

select e.employee_id, e.first_name, e.salary
  from employees e
 where e.salary <= (select MAX_SALARY
                    from jobs
                   where job_title = 'Programmer')
   and e.salary >= (select MIN_SALARY
                    from jobs
                   where job_title = 'Programmer');

문제. 4 
업무명(job_title)이 ‘Sales Representative’인 직원 중에서 연봉(salary)이 9,000 이상, 10,000 이하인 직원들의 이름(first_name), 성(last_name)과 연봉(salary)을 출력하시오. 

select first_name 이름, last_name 성, salary 연봉
  from employees e, jobs j
 where e.job_id = j.job_id
   and j.job_title = 'Sales Representative'
   and e.salary between 9000 and 10000
 order by 이름;

문제. 5 
각 사원(employee)에 대해서 사번(employee_id), 이름(first_name), 업무명(job_title), 부서명 (department_name)를 조회하시오. 단 도시명(city)이 ‘Seattle’인 지역(location)의 부서 (department)에 근무하는 직원만 출력하시오. 
결과행 : 18행 

select e.employee_id 사번, e.first_name 이름, j.job_title 업무명, d.department_name 부서명
  from employees e, departments d, locations l, jobs j
 where e.job_id = j.job_id
   and d.location_id = l.location_id
   and e.department_id = d.department_id
   and l.city = 'Seattle';

문제. 6 
각 업무(job) 별로 연봉(salary)의 총합을 구하고자 한다. 연봉 총합이 가장 높은 업무부터 업무 
명(job_title)과 연봉 총합을 조회하시오. 단 연봉총합이 30,000보다 큰 업무만 출력합니다. 

select job_title 업무명, sum(salary) 연봉
  from employees e, jobs j
 where e.job_id = j.job_id
 group by j.job_title
having sum(salary) > 30000
 order by 연봉 desc;

문제. 7 
자신의 매니저보다 연봉(salary)을 많이 받는 직원들의 성(last_name)과 연봉(salary)을 출력하 시오. 

select last_name 이름, salary 연봉
  from employees e
 where salary > (select salary 
                   from employees m
                  where e.manager_id = m.employee_id);

문제. 8 
각 사원(employee)에 대해서 사번(employee_id), 이름(first_name), 부서명(department_name), 매니저(manager)의 이름(first_name)을 조회하시오. 
결과행 : 106행 

select e.employee_id 사번, e.first_name 이름, d.department_name 부서명, m.first_name
  from employees e, employees m, departments d
 where e.manager_id = m.employee_id
   and e.department_id = d.department_id
 order by 사번;

문제. 9 
특정 사원의 사원 번호(employee_id)가 다른 사원의 관리자 번호(manager_id)에 있는 사원인 경 우, 이 사원을 관리자라고 가정합니다. 이름(FIRST_NAME)에 "v"(소문자)가 들어간 사원들에 대해 사원 번호(EMPLOYEE_ID), 이름(FIRST_NAME), 관리자 이름(관리자의 FIRST_NAME)을 조회하고 관리 자가 없는 경우에는 관리자 이름에 "관리자 없음"라고 출력하도록 SQL 쿼리를 작성하세요.

select e.employee_id 사번, 
       e.first_name 이름, 
       nvl(m.first_name, '관리자 없음') "관리자 이름"
  from employees e, employees m
 where e.manager_id = m.employee_id(+)
   and e.first_name like '%v%'
 order by 사번 ;

문제. 10 
자신의 매니저보다 채용일(hire_date)이 빠른 사원의 사번(employee_id), 성(last_name)과 채용 일(hire_date)을 조회하라. 단, 사원입사일 순으로 출력한다. 
* 결과집합 : 37행 

select e.employee_id 사번, 
       e.last_name 이름, 
       e.hire_date 사원입사일, 
       m.hire_date 매니저입사일
  from employees e, employees m
 where e.manager_id = m.employee_id
   and e.hire_date < (select hire_date
                        from employees m
                       where e.manager_id = m.employee_id)
 order by e.hire_date;

문제. 11 
자신을 관리자 ID(manager_id)로 지정하고 있는 직원수(직속부하직원수)를 다음과 같이 출력 되 도록 쿼리문을 작성하시오. 단 직속부하직원 수가 8이상인 경우만 출력하도록 하고, 직속부하직 원수 순으로 내림차순 정렬한다. 

select e.employee_id 사번, 
       e.last_name 이름,
      (select count(m.manager_id)
         from employees m
        where m.manager_id = e.employee_id) 직속부하직원수
  from employees e
 where  (select count(m.manager_id)
         from employees m
        where m.manager_id = e.employee_id)>= 8
 order by 직속부하직원수 desc;

문제. 12 
자신의 부서 평균 급여보다 연봉이 많은 사원의 사번(employee_id), 성(last_name)과 연봉 (salary)을 조회하라. 
* 결과집합 : 38행 

select e.employee_id 사번,
       e.last_name 이름,
       e.salary 급여,
       e.department_id 부서번호,
       (select avg(m.salary)
          from employees m
         where m.department_id = e.department_id) 부서평균급여
  from employees e
 where e.salary >(select avg(m.salary)
          from employees m
         where m.department_id = e.department_id);

문제. 13 
‘Sales’부서에 속한 직원의 이름(first_name), 급여(salary) 을 조회하시오. 단, 급여는 100번 
부서의 평균보다 적게 받는 직원 정보만 출력되어야 합니다. 
* 결과집합 : 15행 

select e.first_name 이름, 
       e.salary 급여,
       d.department_name 부서명
  from employees e, departments d
 where e.department_id = d.department_id
   and d.department_name = 'Sales'
   and e.salary < (select avg(m.salary)
                     from employees m
                    where m.department_id = 100)
 order by 이름;

문제. 14 
각 도시(city)에 있는 모든 부서 직원들의 평균급여를 조회하고자 한다. 평균급여가 가장 낮은 도시부터 도시명(city)과 평균연봉을 출력하시오. 단, 도시에 근무하는 직원이 10명 이하인 곳은 제외하고 조회한다. 

select l.city 도시,
       avg(e.salary) 급여,
       count (e.employee_id) 근무인원수
  from employees e, locations l, departments d
 where e.department_id = d.department_id
   and d.location_id = l.location_id
 group by l.city
having count(e.employee_id) >= 10
 order by 급여 ;

문제. 15 
각 부서(department_id)별로 최고 연봉(salary)를 받는 사원의 사번(employee_id), 성 (last_name)과 연봉(salary)을 조회하시오. 단 조회결과는 연봉의 내림차순으로 정렬되어 나타나 야 합니다. 
* 결과집합 : 11행 

select e.employee_id,
       e.last_name,
       e.salary
  from employees e
 where e.salary = (select MAX(salary)
                     from employees m
                    where m.department_id = e.department_id)
 order by e.salary desc;

문제. 16 
각 업무(job) 별로 연봉(salary)의 총합을 구하고자 한다. 연봉 총합이 가장 높은 업무부터 업무 명(job_title)과 연봉 총합을 조회하시오. 
* 결과집합 : 19행 

select j.job_title,
       sum(salary)
  from employees e, jobs j
 where e.job_id = j.job_id
 group by j.job_title
 order by sum(salary) desc;

문제. 17 
각 업무(job_title)가 어느 부서(department_name)에서 수행되는지 조회하는 SQL 쿼리문을 작성 하세요. 화면 출력은 JOB_TITLE 순으로 출력합니다(단, 수행하지 않는 업무는 표시하지 않고 중 복되는 정보는 하나만 표시합니다.) 
* 결과집합 : 19행 

select distinct j.job_title, d.department_name
  from employees e, jobs j, departments d
 where e.job_id = j.job_id
   and e.department_id = d.department_id
 order by j.job_title;

문제. 18 
부서 이름(department_name) 별 직원들의 평균연봉(salary) 을 조회하시오. 
단, ‘30번’ 부서의 직원 평균 연봉보다 평균 연봉이 이하인 부서 정보만 출력되어야 합니다. 

select d.department_name 부서명,
       avg(e.salary) 평균연봉
  from employees e, departments d
 where e.department_id = d.department_id
 group by d.department_name
having avg(e.salary) <= (select avg(m.salary)
                           from employees m
                          where m.department_id = 30)
 order by 평균연봉;

문제. 19 
2007년 입사한(hire_date) 직원들의 사번(employee_id), 이름(first_name), 성 
(last_name), 부서명(department_name)을 조회합니다. 이때, 부서에 배치되지 않은 직원의 
경우, ‘<NOT ASSIGNED>’로 보여줍니다. 
* 결과집합 : 19행 

select e.employee_id,
       e.first_name,
       e.last_name,
       nvl(d.department_name, '<NOT ASSIGNED>')
  from employees e, departments d
 where e.department_id = d.department_id(+)
   and e.hire_date between TO_DATE('2007/01/01', 'YYYY_MM_DD') 
   and TO_DATE('2007/12/31', 'YYYY/MM/DD')
 order by e.employee_id;

문제. 20 
특정 사원의 사원 번호(employee_id)가 다른 사원의 관리자 번호(manager_id)에 있는 사원인 경 우, 이 사원을 관리자라고 가정합니다. 관리자가 있는 국가(country_name)와 해당 국가에 있는 관리자 수를 국가 이름 순으로 조회하세요. 

select * from countries;

select * from locations;

select * from departments;

select c.country_name, count(m.manager_id) CNT
  from (select manager_id
          from employees
         group by manager_id) m,
       employees e, 
       departments d, 
       locations l, 
       countries c
 where e.department_id = d.department_id
   and m.manager_id = e.employee_id
   and d.location_id = l.location_id
   and l.country_id = c.country_id
 group by c.country_name
 order by c.country_name;

문제. 21 
도시명(city)이 'Southlake'인 지역에 근무하는 직원 중에 연봉을 가장 많이 받는 직원의 사번 
(employee_id), 이름(first_name), 연봉(salary)을 출력하시오. 

select e.employee_id,
       e.first_name,
       e.salary
  from employees e, departments d, locations l
 where e.department_id = d.department_id
   and d.location_id = l.location_id
   and l.city = 'Southlake'
   and rownum = 1
 order by e.salary desc;
