--------------------------------------------------------
-- 프로그램유닛 : 함수(function), 프로시져(procedure), 트리거(trigger), 패키지(package), ...
--------------------------------------------------------
PLSQL
- "에이다" 라는 객체지향 언어의 모양을 본따 만들어짐..
- SQL + 절차지향 언어(Procedural Language)

특정
- 블럭 구조로 되어있어 기능별 모듈화 가능
- 변수, 조건, 반복 사용이 가능함
- 변수에 값을 대입할 때는 ":="을 사용한다.
- 오라클 정의 에러나 사용자 정의 에러를 정의하여 사용 가능

- 기본 PL/SQL 블럭 구조

DECLARE(생략가능) 
	변수 및 인수에 대한 정의
BEGIN
	개발자가 처리할 SQL과 로직 작성
EXCEPTION(생략가능)
	SQL 발생 예외 처리
END 

---------------------------------------------
함수(function)

- 하나의 값을 반드시 돌려줘야 한다.
- 함수 정의시 헤더에 return 될 데이터 타입을 선언하고
  PL/SQL 블럭에서 return문을 이용해서 돌려줄 값을 정의

형태
create [or replace] function 이름[(파라미터명 타입(IN) 데이터타입, ..)]
	return 돌려줄데이터타입
is
	변수 선언(declare 생략)
begin
	....
	return 돌려줄값;
exception	
end;

삭제
drop function 이름;

-- 년도를 반환하는 함수 작성..
create or replace function today_year
return char
is 
	v_year char(4) := '0'; 
begin
	select to_char(sysdate, 'yyyy') into v_year
	  from dual;
	return v_year;
end;
/

-- 함수를 오라클 데이터베이스에 등록하기(컴파일)
-- 토드에서 위에 작성된 함수를 실행

-- 절대값 반환하는 함수 작성하자...
select my_abs(-199)
  from dual;

create or replace function my_abs(num in number)
	return number
is
	v_num number := num;
begin
	if (v_num < 0) then v_num := v_num * -1;  
	end if;
	return v_num;
end;
/

select my_abs(-199), my_abs(122) from dual;

-- HR 계정에서 실행
-- 문제 : 부서번호를 입력받아 입력부서에서 가장 많은 급여가 얼마인지 반환하는 함수작성
-- 함수명(dept_max_salary)로 작성
create or replace function dept_max_salary(deptId in number)
	return number
is
	vMaxSal number := 0;
begin
	select max(salary) into vMaxSal
	  from employees
	 where department_id = deptId; 
	return vMaxSal;
end;
/

----------------------------------
프로시져(procedure)
- 처리할 일들을 정의
----------------------------------
형태
create [or replace] procedure 이름[(파라미터명 타입(IN, OUT, INOUT) 파라미터타입)]
is

begin
exception		
end;

삭제
drop procedure 이름;

-----------------------------------------------
create table temp_board(
	no number,
	title varchar2(200),
	writer varchar2(30)
);

create sequence s_temp_board_no;

insert into temp_board(no, title, writer)
values(s_temp_board_no.nextval, 't1', 'w1');

commit;

select * from temp_board;

-- temp_board 데이터 등록 프로시저
create or replace procedure insert_board
(v_title in varchar2, v_writer in varchar2)
is
begin
	insert into temp_board(no, title, writer)
	values(s_temp_board_no.nextval, v_title, v_writer);		
	commit;
end;
/

-- temp_board에 데이터를 수정하는 프로시져 작성
-- 제목을 수정
-- 작성할 프로시저이름 : update_board
create or replace procedure update_board
(v_no in number, v_title in varchar2)
is
begin
	update temp_board
	   set title = v_title
	 where no = v_no;
	commit; 
end;
/

create or replace procedure delete_board
(v_no in number)
is
begin
	delete
	  from temp_board
	 where no = v_no;
	commit; 
end;
/

execute insert_board('연습중', '홍길동');
select * from temp_board;

execute update_board(2, '프로시저에서 변경함');
select * from temp_board;

execute delete_board(2);
select * from temp_board;
