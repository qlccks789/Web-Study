-------------------------------------------
SET 연산자
  : 여러개의 select 절을 연결해서 사용한다.
  : 집합 개념으로 이해하자...(합집합, 교집합, 차집합)
  : 합집합 - A + B union(공통된 값은 한번만나온다, 정렬해준다.), union all (중복,정렬 무시하고 다보여줌)
  : 교집합 - A와 B의 공통부분  intersect
  : 차집합 - A에서 B를 뺀 나머지  minus
  : order by 는 제일 마지막에 한번만 사용이 가능하다.
 형태 (select 와 select 사이)
  : select
    set 연산자
    select
첫번째 셀렉 절의 컬럼명이 실행 결과의 컬럼명으로 나온다.
-------------------------------------------
create table tb_seta ( 
    no number,
    data varchar2(2)
);

create table tb_setb ( 
    no number,
    data varchar2(2)
);
  
insert into tb_seta values(1, 'a');
insert into tb_seta values(2, 'b');
insert into tb_seta values(3, 'c');
insert into tb_seta values(4, 'd');
  
insert into tb_setb values(5, 'e');
insert into tb_setb values(6, 'f');
insert into tb_setb values(3, 'c');
insert into tb_setb values(4, 'd');
  
commit;  
  
--합집합 : union, union all
-- union (중복 제거, 정렬해줌)
select *
  from tb_seta
 union
select *
  from tb_setb;
-- union all (중복되는 것 까지 전부 보여줌)  
select *
  from tb_seta
 union all 
select *
  from tb_setb;
  
-- 교집합 : intersect  
select *
  from tb_seta
intersect
select *
  from tb_setb;
  
-- 차집합 : minus 
select *
  from tb_seta
 minus
select *
  from tb_setb;
  

select last_name
  from employees
 union all
select department_name
  from departments;
-- 주의 사항
-- salary를 추가했을때..
-- [Error] Execution (1: 1): ORA-01789: query block has incorrect number of result columns
-- 1. 컬럼의 수가 동일해야 한다.
select last_name, salary
  from employees
 union all
select department_name
  from departments;

-- [Error] Execution (1: 8): ORA-01790: expression must have same datatype as corresponding expression
-- 2. 대응되는 컬럼의 데이터타입은 동일해야 한다. (숫자 =숫자, 문자=문자)
select last_name, salary
  from employees
 union all
select department_id, department_name
  from departments;

-- [Error] Execution (4: 2): ORA-00933: SQL command not properly ended
-- 3. order by 절은 맨 마지막에 와야한다.
select last_name, salary
  from employees
 order by salary
 union all
select department_name, department_id
  from departments;
  
-- 정상실행
-- 4. 첫번째 select 절의 걸럼명으로 set 연산자의 실행 결과 컬럼이 된다.
select last_name, salary
  from employees
 union all
select department_name, department_id
  from departments
 order by salary;
 
 
-- 다음과 같이 출력하는 프로그램 작성
100 king 24000
101 Lee  10000
102 Kim   4000
총합      38000
select employee_id || '', last_name, salary
  from employees
 union all
select '총합','',sum(salary)
  from employees;
  
  
  
  
  
  
  
 
 
 
 
 
 
 
 
 
 