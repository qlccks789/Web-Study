
/*
기본 SELECT
- SQL 문장은 한 줄로 입력하거나 여러 줄로 보기 좋게 나누어 입력한다.
- 권장은 절별로 줄을 나누어서 작성..
- SQL 문장은 대소문자를 가리지 않는다.(Case insensitive)
  select *   	==>    SELECT *
  	FROM Tab;	(같음)	 from TAB;
- Data 값은 대소문자를 가린다.(Case sensitive)
  select *				  ==>					select *
  	from tab			(다름)	 				  from tab
  where tname = 'Abc';	(값부분의 대소문자가 달라서..)	where tname = 'ABC';

**/
-- SELECT는 6개의 기본 절이 존재함.
SELECT		-> 화면에 보이는 것들에 대한 작업
FROM		-> 데이터 집합체(테이블, 뷰)
WHERE		-> 조건 : 범위를 줄인다.
GROUP BY	-> 데이터를 특정 기준에 맞추어 소그룹으로 묶는다.
HAVING		-> 그룹에 대한 제약을 준다.
ORDER BY	-> 정렬, 원하는 순서로 데이터를 정제한다.

-- SELECT 절과 FROM 절 이해하기

-- 현재 접속한 사용자가 가지고 있는 테이블 또는 뷰의 목록을 보여준다.
select *
	from tab;
  
-- employees 테이블의 모든 정보를 출력하세요
-- * : 모든 컬럼 조회하라..
select *
	from emloyees;
	
-- HR 사용자의 부서 테이블(departments)의 모든 컬럼에 저장된 데이터를 화면에 출력하시오
select * 
    from departments;
    
-- 특정 컬럼만 가져오기
select 컬럼명[, 컬럼명...]  --> 대괄호는 생략가능하다, 컬럼명이 여러개나오면 쉼표로 구분..
	from 테이블명
	
-- 사원 테이블에서 사원의 이름(last_name), 급여, 이메일 컬럼의 데이터를 출력하시오
select last_name, salary, email
	from employees;
	
-- 부서 테이블에서 부서번호와 부서이름을 출력하시오.
select department_id, department_name
    from departments;
    
-- 만약, 테이블의 구조를 보고 싶다면?? 컬럼이 어떤게 있지 ??
desc 테이블명;

-- SELECT 절의 기능 이해하기..
-- 산술 연산이 가능하다.

-- 사원의 이름, 급여, 이메일을 출력
select last_name, salary, email
	from employees;

-- 사원의 이름, 급여, 연봉(급여 * 15), 이메일을 출력
select last_name, salary, salary*15, email
	from employees;
	
-- 조회되는 컬럼의 이름을 변경하자 : 별칭(Alias)
-- as를 붙여도 되고 안붙여도 된다.. 붙이는거 권장 (표시하기 위해)
-- select 컬럼명 as 별칭
-- select 컬럼명 별칭
-- 사원의 정보를 출력합니다. (이름과 연봉(급여*15))
-- 단, 조회되는 컬럼의 이름으로 "이름", "연봉" 으로 표시하시오.
select last_name as 이름, salary*15 as 연봉
    from employees;
    
-- Alias에 특수문자 또는 대소문자 구분이나 공백등을 표시하려면 ""으로 묶어준다.
select last_name as "이   름", salary*15 as 연봉
    from employees;
    
-- 합성연산자 : 출력되는 데이터의 결과를 조합하자...
-- 컬럼 + 컬럼 , 컬럼 + 문자 , 컬럼 + 숫자 , 숫자 + 숫자
-- 자바의 "+" 연산자와 유사하다.
-- "||" 
-- sql 의 문자열은 싱클쿼티션으로 묶어줘야한다.
last_name || '의 연봉' || salary*15 || '원'
    
King의 연봉 360000원
Kochhar의 연봉 255000원

select last_name || '의 연봉' || salary*15 || '원'
	from employees;
	
-- 컬럼의 이름을 "사원연봉" 으로 표시하시오.
select last_name || '의 연봉' || salary*15 || '원' as 사원연봉
	from employees;
	
-- 아래와 같이 출력되도록 SQL 작성하시오. 단, 컬럼의 이름을 "사원정보"로 변경한다.
-- 100번 사원의 이름은 King이고 급여는 24000원 입니다.
select employee_id || '번 사원의 이름은 ' || last_name || '이고 급여는 ' || salary || '입니다' as 사원연봉
    from employees;
    
-- distinct : 중복된 결과행을 하나만 남기고 제거

-- 출력되는 결과는 테이블의 행의 수 만큼 출력된다.
select department_id
	from employees;
-- 결과데이터중에서 중복된 것은 제거된다. distinct
select distinct department_id
	from employees;

select distinct department_id, last_name
	from employees;
	
-----------------------------------------------------------------------
WHERE 절
전체 데이터에서 원하는 부분위 데이터만 가져오기(범위를 줄여준다.)
연산자 : 논리연산자(참,거짓), 비교연산자(>, <), SQL 연산자
-----------------------------------------------------------------------

-- 사원 중에서 급여가 10000 이상인 사원의 정보(이름, 급여)를 출력하시오.
select : 사원의 정보(이름, 급여) 
  from : 사원 중에서
 where : 급여가 1000 이상인

select last_name, salary
  from employees
 where salary >= 10000;
 
-- 100번 부서에 소속되어 있는 사원들의 정보를 출력하시오.
select *
  from employees
 where department_id = 100;
    
-- 사원 중에서 100번 부서에서 근무하지 않는 사원의 정보를 출력하시오.
select *
  from employees
 where department_id <> 100;
--  where department_id != 100;  같은 의미..
    
-- 사원의 부서가 100번 이면서 급여가 10000 이상인 사원의 정보를 출력하시오.
-- and
select *
  from employees
 where department_id >= 100 
   and salary >= 10000 ;
 
-- 사원의 부서가 100번 이거나 또는 110번에 속하는 사원의 정보를 출력하시오.
select *
  from employees
 where department_id = 100 
    or department_id = 110 ;
    
select *
  from employees
 where department_id = 90 
    or department_id = 100 
   and salary >= 10000;
-- 사원의 부서가 90번 또는 100번에 소속된 사원 중에서 급여가 10000 이상인 사원들의 정보를 출력하라
-- and를 먼저 수행하고 or를 수행한다..
-- department_id = 100 and salary >= 10000; 을 먼저 수행하고 department_id = 90 을 수행해서 90번의 부서 사원은 salary >=10000 조건을 안받는다..
-- 이걸 방지하기 위해 () 소괄호로 묶어준다..   
select *
  from employees
 where (department_id = 100 
    or department_id = 90) 
   and salary >= 10000;
   
-- SQL 연산자 이해하기..

-- 특정 범위내의 값을 선택 :  컬럼 between 작은값 and 큰값

-- 사원의 급여가 10000부터 15000 사이인 사원의 정보를 출력
select *
  from employees
 where salary >= 10000 
   and salary =< 15000;
-- 사원의 급여가 10000부터 15000 사이인 사원의 정보를 출력
-- between 사용
select *
  from employees
 where salary between 10000 and 15000;

-- in 연산자
-- 컬럼 in (값, ...);  컬럼의 값이 값들 중의 하나와 일치하면 참을 반환
-- in 연산자 사용하면 or나 and의 우선순위에 대한 문제를 신경쓰지 않아도 된다.
-- salary in (1000, 2000, 3000)
-- 같은 의미 .. (salary = 1000 or salary = 2000 or salary = 3000)

-- 사원의 부서가 90번 또는 100번에 소속된 사원 중에서 급여가 10000 이상인 사원들의 정보를 출력하라
-- in 연산자 사용하기
-- in 연산자 사용하면 or나 and의 우선순위에 대한 문제를 신경쓰지 않아도 된다.
select *
  from employees
 where department_id in (90, 100)
   and salary >= 10000;
 
-- like 연산자 
-- : 특정 형태의 값들을 조회한다.
-- 컬럼 like '패턴문자..값'
-- 패턴문자 : "_" -> 한 문자, "%" -> 0개 이상의 문자
-- col like '_a'  -> col 컬럼의 값이 2자이고 마지막 글자가 "a"인 것
-- col like 'a_'  -> col 컬럼의 값이 2자이고 첫 글자가 "a"인 것
-- name like '_b_' : name 컬럼의 값이 3자이고 두번째글자가 "b"인 것
-- name like '_a%' : name 컬럼의 값이 2글자 이상이고 2번째 글자가 "a"인 것

-- 사원의 이름이 "L"로 시작하는 사원 정보를 출력
select *
  from employees
 where last_name like 'L%';

-- 사원의 이메일이 5자인 사원의 정보를 출력
select *
  from employees
 where email like '_____';
   
-- 사원의 이메일 첫글자가 "D"이고 마지막 글자가 "T"인 사원의 정보를 출력
select *
  from employees
 where email like 'D%T';
   
-- 사원의 이메일에 "E" 글자가 포함된 사원의 정보를 출력
select *
  from employees
 where email like '%E%';

-- 사원의 이름이 "King" 인 사원의 정보를 출력
-- like 연산자는 패턴 문자가 필요할 때 사용하자
select *
  from employees
 where last_name like 'King';
-- 같은 의미
select *
  from employees
 where last_name = 'King';
   
 
-- Null 이란 ??
-- 아직 데이터가 입력되지 않은 상태
-- Null 은 미정인 값이다..   
-- Null 과의 비교연산은 false
-- Null 과의 산술연산은 Null 
 
-- salary + salary * commission_pct
-- 위의 식에서  commission_pct 가 null 이라면 식의 결과는 null이 된다.. -> null과의 산술연산은 null이기 때문에
select last_name,
       salary,
       commission_pct,
       salary + salary * commission_pct
  from employees
 
-- 커미션을 받지 않는 사원의 정보를 출력하시오
select *
  from employees
 where commission_pct = null;

-- 컬럼 is null : null인 값을 찾기 위한 연산자
select *
  from employees
 where commission_pct is null;

-- 커미션을 받는 사원이 정보를 출력하시오. 
select *
  from employees
 where commission_pct is not null;
 
-- 사원의 부서가 10 ~ 100 번 사이이면서 급여가 10000 이상인 사원의 정보를 출력
select *
  from employees
 where department_id between 10 and 100
   and salary >= 10000;
 

----------------------------------------------------------------
정렬 : ORDER BY

SELECT 절에서 가장 마지막에 위치한다.
오름차순(ASC)  : 값이 갈수록 커지는 것 
             : 숫자(1 .. 100), 문자(a .. z, 가 .. 힝)
             : 날짜(어제 .. 내일)
내림차순(DESC) : 값이 갈수록 작아지는 것
             : 숫자(100 .. 1), 문자(z .. a, 힝 .. 가)
             : 날짜(내일 .. 어제)

order by 컬럼명 -> 오름차순 (정렬을 표시하지않으면 디폴트가 오름차순임)
order by 컬럼명 ASC -> 오름차순
order by 컬럼명 DESC -> 내림차순
----------------------------------------------------------------

-- 사원의 정보를 출력합니다.
-- 단, 사원의 급여가 높은 사원부터 출력하시오.
select *
  from employees
 order by salary DESC;

-- 사원의 입사일이 오래된 사원부터 사원의 정보를 출력하시오.
select *
  from employees
 order by hire_date ASC;

-- 부서번호 순으로 사원들의 정보를 출력하시오
select department_id, last_name, salary
  from employees
 order by department_id ASC;
-- 부서번호 순으로 사원들의 정보를 출력하시오. 부서번호가 같은 사원들은 이름순으로 정렬하시오.
select department_id, last_name, salary
  from employees
 order by department_id ASC , last_name ASC;


-- 절의 실행 순서
-- ( from -> where -> select -> order by )
select last_name, salary * 15 연봉
  from employees
 order by salary * 15 desc;
-- select 보다 뒤에 실행되는 order by 는 salary * 15 가 연봉이라는 이름으로 바뀐걸(Alias) 알기 때문에 order by 에서 연봉으로 쓸 수 있다.
select last_name, salary * 15 연봉
  from employees
 order by 연봉 desc;

 
--------------------------------------------------------
GROUP BY 절
 - 데이터들을 소그룹으로 묶는다.
 - ~별 이란 용어가 나오면 그룹핑을 생각한다.
 - 통계, 그룹함수(집계함수)와 같이 사용한다.
 - 그룹 함수란??
   : 여러개의 데이터를 받아서 하나의 결과를 반환하는 함수
   : SUM, MAX, MIN, AVG, COUNT
   : null 값은 제외된다.
---------------------------------------------------------
-- 사원의 수와 최대급여, 최소급여, 평균을 출력하시오
select count(*), 
       max(salary), 
       min(salary), 
       avg(salary)
  from employees;
  
-- 100번 부서에 속한 사원의 수와 최대급여, 최소급여, 평균을 출력하시오
select count(*), 
       max(salary), 
       min(salary), 
       avg(salary)
  from employees;
 where department_id = 100;

-- 에러발생 : department_id는 그룹이 적용되지 않았기 때문에 여러개의 값을 출력하려 한다.
-- 나머지 그룹함수는 한개만 출력하기 때문에 같이 사용이 불가능하다ㅓ,
-- 해결하기 위해서는 department_id 컬럼의 값을 그룹핑 적용한다.
select department_id,
       count(commission_pct), 
       max(salary), 
       min(salary), 
       avg(salary)
  from employees;
 where department_id = 100;
----- 그룹핑 적용   
----- department_id를 max 함수를 이용해서 그룹화 시킨다.
select max(department_id),
       count(commission_pct), 
       max(salary), 
       min(salary), 
       avg(salary)
  from employees;
 where department_id = 100;
 
select department_id, count(*), max(salary), min(salary)
  from employees
 group by department_id
 order by department_id;

 --각 부서별, 직무별, 최대급여와, 최소급여, 사원수를 출력하시오..
 select department_id, job_id, max(salary), min(salary), count(*)
  from employees
 group by department_id, job_id
 order by department_id, job_id;
 

-- 각 부서별 최대급여를 출력합니다. 단, 최대급여가 높은 부서부터 출력
select  : 최대급여
  from  : 사원
  where : 없음
  group by : 각 부서별
  order by : 최대급여가 높은 부서부터

select department_id, 
       max(salary) as max_sal
  from employees
  group by department_id
  order by max_sal DESC;
 
-- 각 부서별 최대급여를 출력합니다.
-- 최대급여가 10000 이상인 부서를 대상으로
-- 단, 최대급여가 높은 부서부터 출력
select  : 최대급여
  from  : 사원
  where : 최대급여가 10000 이상인 부서를 대상으로
  group by : 각 부서별
  order by : 최대급여가 높은 부서부터

-----------------------------------------------------
HAVING
그룹에 대한 제약
-----------------------------------------------------
  
select department_id, 
       max(salary) as max_sal
  from employees
  where max(salary) >= 10000      // 그룹 함수는 where 에서 사용불가 .. 에러
  group by department_id
  order by max_sal DESC;
---- HAVING 사용..
select department_id, 
       max(salary) as max_sal
  from employees
  HAVING max(salary) >= 10000      
  group by department_id
  order by max_sal DESC;
 
-- 각 부서별 최대급여를 출력합니다.
-- 사원의 이름이 'k'로 시작하는 사원들을 대상으로 합니다.
-- 최대급여가 10000 이상인 부서를 대상으로
-- 단, 최대급여가 높은 부서부터 출력
select department_id, 
       max(salary) as max_sal
  from employees
  where last_name like 'K%'
  HAVING max(salary) >= 10000
  group by department_id
  order by max_sal DESC;
  
  
  
         -- 6가지 절의 순서
FROM -> WHERE -> GROUP BY -> HAVING -> SELECT -> ORDER BY 
 
    
   
   
   
   
   
   
   