-----------------------------------
내장함수 :
 - 그룹함수 : sum, max, min, avg...
     - 여러개의 데이터들이 한개의 결과로 나오는것..
 
 - 단일행 함수(데이터타입과 관련..)
   : 문자함수
   : 숫자함수
   : 날짜함수
   
 - 변환형 함수 
   : 문자 -> 날짜 (to_date)
   : 문자 -> 숫자 (to_number)
   : 날짜,숫자 -> 문자 (to_char)
   
 - 기타 함수 : nvl, decode, case
 
 - 그룹핑 함수 : group by 절과 같이 사용
    : rollup, grouping
    
 - 분석 함수 : rank, dense_rank, row_number
-----------------------------------

 
 
 
-----------------------------------
문자형 함수
-----------------------------------
select upper('hello')   -- 대문자로 바꿔주는 함수
   from employees;
-- 오라클에서 데이터를 확인하기 쉽게 제공하는 더미테이블
-- 데이터가 하나만 입력되어 있는 테이블
select upper('hello')
   from dual;   
   
-- upper 대문자로바꿔줌, lower 소문자로바꿔줌, concat 문자를이어줌 (hellohong), length 문자의길이(7), lengthb 문자의길이를 바이트크기로(13)
select upper('hello'), lower('HELLO'), concat('hello', 'hong'),
       length('홍길동hong'), lengthb('홍길동hong')
  from dual;
   
--문자열 추출
--substr('문자열', 시작위치(1부터 시작), 크기지정)  --> 시작위치부터 크기만큼 문자열 추출
--substr('문자열', 시작위치(1부터 시작))  --> 처음부터 끝까지 문자열추출
select substr('hello', 1, 2), substr('hello', 3)
  from dual;
  
-- 문자열 찾기
select instr('hello', 'l'),  --> 'l' 을 찾아서 위치값을 반환
       instr('hello', 'l', 4),
       instr('hello', 'a')   --> 찾지못하면 0을 반환한다.
  from dual;
   
--'test' 란 문자를 10이란 공간에 넣고 남는공간에 *을 출력하겠다..
-- lpad -> left  
-- rpad -> right
select lpad('test', 10, '*'), rpad('test', 10, '*')
  from dual;
-- 사원테이블에 사원의 이름을 10이란 공간에넣고 남는공간에 *을 왼쪽에 넣겠다..
select lpad(last_name, 10, '*')
  from employees;
  
select 'hi hello sql',
        translate('hi hello sql', 'el', 'am'),  -- -> translate : e -> a , l->m 으로 다 바꿔라 (문자 하나하나)
        replace('hi hello sql', 'el', 'am')     -- -> replace : el -> am 으로 바꿔라 
  from dual;
  
--사원의 이름의 길이가 5자 미만인 사원의 정보를 출력
select *
  from employees
 where length(last_name) < 5;

 
 
---------------------------------------------------------------
숫자형 함수
----------------------------------------------------------------
-- abs() -> 절대값
-- mod() -> 나머지구하기 (자바의 %)
select abs(100), abs(-100), mod(3, 1), mod(3, 2), mod(3, 3)
  from dual;
   
-- ceil(숫자)  : 입력된 숫자보다 크거나 같으면서 가장 작은 정수 반환
-- floor(숫자) : 입력된 숫자보다 작거나 같으면서 가장 큰 정수 반환
--         2         1           1        1
select ceil(1.1), ceil(1), floor(1.1), floor(1)
  from dual;
   
-- sign(숫자) : 숫자가 양수, 0, 음수 인지 판단.. 결과값으로 -> 양수일때 1, 0, 음수일때 -1 
--         -1        0          1
select sign(-100), sign(0), sign(100)
  from dual;
  
-- round(반올림), trunc(버림) 

select round(73), trunc(73),  --> 73, 73
       round(73.7), trunc(73.7) --> 74, 73
  from dual;
   
select round(73.727, 1), round(73.727, 2), --> 73.7  / 73.73  -> 소수점 1까지 / 소수점 2까지 
       trunc(73.727, 1), trunc(73.727, 2) --> 73.7 / 73.72   -> 소수점 1까지 / 소수점 2까지
  from dual;
   
select round(73.727, -1), round(73.727, -2), --> 70 / 100  -> 소수점 -1까지 : 10의자리 : 70 / 소수점 -2까지 : 백의자리 : 반올림해서 100
       trunc(73.727, -1), trunc(73.727, -2)  --> 70 / 0    -> 소수점 01까지 : 10의자리 : 70 / 소수점 -2까지 : 백의자리 : 버림해서 0
  from dual;
  

  
------------------------------------------------------
날짜형 함수   
------------------------------------------------------

-- 현재 시간 정보를 가져오기 : sysdate
select sysdate
  from dual;

-- add_months(날짜, 숫자) 
-- 날짜 기준으로 숫자만큼 개월수가 더해지거나 빼진다..
select sysdate, add_months(sysdate, 1), add_months(sysdate, -1)
  from dual;
   
-- 각 사원의 입사일로부터 1년 뒤의 날짜를 출력
select hire_date, add_months(hire_date, 12)
  from employees;
  
-- months_between(날짜1, 날짜2)
-- 두 날짜간의 개월 차를 구한다.. 
-- 소수점이 나올 수 있다

--각 사원의 근무개월을 출력하라.. (현재날짜에서 입사일을 뺀 값)
select last_name, months_between(sysdate, hire_date )
  from employees;
-- 소수점 버리기.. 
select last_name, trunc(months_between(sysdate, hire_date ))
  from employees;
 
-- last_day(날짜) : 해당 월의 마지막 날짜를 반환
select sysdate, last_day(sysdate)
  from dual;
  
-- 날짜  + 숫자 = 날짜 
-- 날짜  + 10 = 10일이 더해진 날짜
-- 날짜 - 10 = 10일이 빼진 날짜
select sysdate, sysdate+7, sysdate-7
  from dual;

-- 날짜 - 날짜 = 숫자(일수)
select sysdate - hire_date
  from employees;
  
-- 날짜 + 숫자/24 = 시간을 더한 날짜
-- 날짜 - 숫자/24 = 시간을 뺀 날짜  
select sysdate, sysdate+ 7/24, sysdate-7/24
  from dual;
  
-- 15년 이상 근무한 사원들은 장기 휴가를 보내려고 합니다.
-- 대상 사원들이 이떤 사원인지 정보를 출력하시오.
-- 출력 시 사원의 이름은 소문자로 출력하고 , 근무기간은 소수점 이하는 버림
-- 근무기간이 긴 사원부터 출력합니다.
  


-----------------------------------------------------
변환형 함수   
-----------------------------------------------------
-- to_char(날짜, '패턴') : 날짜 정보를 지정된 패턴 형태의 문자로 변경
SimpleDateFormat sdf = new SimpleDateFormat(
	"yyyy-mm-dd HH:mm:ss"
)
String str = sdf.format(new Date());

-- to_char(숫자, '패턴') : 숫자를 지정된 패턴 형태의 문자로 변경
select sysdate,
       to_char(sysdate, 'yyyy'),
       to_char(sysdate, 'yyyy-mm-dd'),
       to_char(sysdate, 'hh24-mi-ss'),      
       to_char(sysdate, 'yyyy-mm-dd hh24-mi-ss')      
  from dual;

-- '9999999999' : 숫자를 문자로 바꿔 쓸수 있는것 (자리수만큼)
select 8971927883, 
       to_char(8971927883),
       to_char(8971927883, '9,999,999,999')
  from dual;
  
-- to_date(문자, '패턴') : 날짜 형태의 문자를 받아서 패턴을 활용해서 문자로 변경  
Date d = sdf.parse("2019-02-07 11:43:11")

-- 날짜에 맞는 패턴을 넣어주면 된다. 
select '2019-01-11', to_date('2019-01-11', 'yyyy-mm-dd')
  from dual;
  
-- to_number(문자, '패턴') : 문자를 숫자로 변경 
select '7,900', to_number('7,900', '9,999')
  from dual;
  
select '7,900', 
       to_number('7900'),
       to_number('7900', '9999'),
       to_number('7,900','9,999')
  from dual;
  
-- 사원중에서 5월에 입사한 사원들의 정보를 출력하시오.
select *
  from employees
 where to_char(hire_date, 'mm') = '05';
 
-- 현재 월과 동일한 월에 입사한 사원들의 정보를 출력
select *
  from employees
 where to_char(hire_date, 'mm') = to_char(sysdate, 'mm');
  
-- 2005년 1월부터 6월 사이에 입사한 사원들의 정보를 출력하시오
-- 6월의 마지막날짜 마지막시간까지 써줘야한다..
select *
  from employees
 where hire_date between to_date('2005-01-01', 'yyyy-mm-dd') 
   and to_date('2005-06-30 23:59:59', 'yyyy-mm-dd hh24:mi:ss');
  
-- 직원의 년도별 입사자수를 출력하시오
select to_char(hire_date, 'yyyy') 입사년도, 
       count(*) 입사자수
  from employees
 group by to_char(hire_date, 'yyyy')
 order by 입사년도;
 
문 -> 숫 to_number
문 -> 날 to_date(문자, 패턴)
숫 -> 문 to_char(숫자, 패턴)
날 -> 문 to_char(날짜, 패턴)



-----------------------------------------------------
기타 함수 : nvl, coalesce, decode, case
-----------------------------------------------------

nvl(컬럼 | 표현식, 값)

select last_name, salary, commission_pct,
       salary + salary * commission_pct,
       salary + nvl(salary * commision_pct, 0),
       salary + salary * nvl(commission_pct, 0)
  from employees;
  
coalesce(컬럼1, 컬럼2, ...) 
  : 인수중에서 첫번째 널이 아닌 컬럼의 값을 반환
-- commission_pct 가 null 이라면 salary값을 선택하고
-- 만약 salary 가 null이라면 1000을 반환한다.
-- 순서대로 진행 commission_pct -> salary -> 1000
select coalesce(commission_pct, salary, 1000)
  from employees;

--ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
-- decode : 자바의 switch문 같은 용도
--ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
switch (job_id){
	case "IT_PROG":
		~~~~~
	case "......":
		~~~~~
	default:
		~~~~~
	}
-- job_id 가 'IT_PROG' 이면 결과값으로 '개발자'가 반환된다
decode (job_id, 'IT_PROG', '개발자')

decode (job_id, 'IT_PROG', '개발자',
                'SA_MAN', '세일즈',
                '그냥 직원')  -- -> '그냥 직원' : default 개념

-- job_id 가 'IT_PROG' 인 사원은 '개발자'이고 
-- job_id 가 'SA_MAN' 인 사원은 '세일즈'이고
-- 이 둘이 아니면(default) '그냥 직원' 이다
select last_name,
       decode (job_id, 'IT_PROG', '개발자',
                'SA_MAN', '세일즈',
                '그냥 직원') as job_type
  from employees;


--ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
--case : decode에서 확장되었음
case 컬럼 when 값1 then 결과값1
         when 값2 then 결과값2
         else 기본값
 end
--ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
case job_id when 'IT_PROG' then '개발자'
            when 'SA_MAN' then '세일즈'
            else '그냥 직원') 
 end

case when job_id = 'IT_PROG' then '개발자'
     when job_id = 'SA_MAN' then '세일즈'
     else '그냥 직원'
     
select last_name,
       case when job_id = 'IT_PROG' then '개발자'
            when job_id = 'SA_MAN' then '세일즈' 
       else '그냥 직원'
       end as job_type
  from employees;

-- 사원의 급여에 따라서 다음과 같이 출력한다.
-- 급여가 15000 이상이라면 '고급'
--		10000 ~ 14999 '중급'
-- 		10000 미만일경우  '초급'
select last_name, salary,
       case when salary >= 15000 then '고급'
            when salary between 10000 and 14999 then '중급'
            when salary < 10000 then '초급'
            end as sal_type
  from employees;


  
-------------------------------------------------
데이터 그룹 생성 : rollup, cube, grouping(컬럼)
-------------------------------------------------
rollup : group by 절의 그룹 조건에 따라 전체행을 그룹화하고 
		 각 그룹에 대해 부분합을 구하는 연산자이다.
group by rollup(컬럼)

-- rollup() : 토탈 합계를 출력해준다.. 
select department_id, count(*), sum(salary)
  from employees
 where department_id is not null
 group by rollup(department_id); 

-- 총계 출력
select nvl(to_char(department_id), '총계') as title,
       count(*) cnt,
       sum(salary) tot
  from employees
 where department_id is not null
 group by rollup(department_id);

-- grouping(컬럼) : 해당 컬럼이 사용되었으면 0, 사용되지 않으면 1
select department_id,
       grouping(department_id),
       count(*) cnt,
       sum(salary) tot
  from employees
 where department_id is not null
 group by rollup(department_id);
-- case로
select case when grouping(department_id) = 1 then '총계'
       else to_char(department_id)
       end department_id,
       grouping(department_id),
       count(*) cnt,
       sum(salary) tot
  from employees
 where department_id is not null
 group by rollup(department_id);



--------------------------------------------------
분석함수 : rank, dense_rank, row_number
--------------------------------------------------

select b.employee_id, b.last_name, b.salary, b.department_id, a.cnt
  from (select department_id, count(*) cnt)
          from employees
         group by department_id) a, 
         employees b
 where  a.department_id = b.department_id;
 

select employee_id, last_name, salary, department_id,
       count(*) over (partition by department_id) cnt
  from employees;

-- rank (순위를 매긴다)
select employee_id, last_name, salary, department_id,
       rank() over (order by salary) num1
  from employees;

-- dense_rank (순위를 매기는데, 순차적으로..)
select employee_id, last_name, salary, department_id,
       dense_rank() over (order by salary) num1
  from employees;

-- 
select employee_id, last_name, salary, department_id,
       dense_rank() over (partition by department_id order by salary desc) num1
  from employees;
  
  
select *
  from (select rownum as rnum, a.last_name, a.salary
          from (select *
                  from employees
                 order by salary desc) a
       )
 where rnum between 5 and 10;
 
-- row_number() 을 이용하기  : 1부터 순차적으로 넘버링해주는 것
select row_number() over(order by salary desc) as rnum,
       a.*
  from employees a