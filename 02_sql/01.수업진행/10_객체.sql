-------------------------------------------------------
Object - 객체

- 테이블(table) : 행과 열의 조합.  데이터 저장 기본 단위
- 시퀀스(sequence) : 자동으로 고유한 숫자 값을 생성, 주로 기본키의 값으로 사용됨
- 뷰(view) : 하나 또는 그 이상의 테이블로부터 논리적으로 데이터를 추출한 부분 집합
            가상의 테이블로 사용함(쿼리)
- 인덱스(index) : 쿼리의 속도를 향상
-------------------------------------------------------

--------------
시퀀스 객체
- 고유번호 생성기
--------------
select nvl(max(no) + 1, 1) from tb_board;

insert into tb_board(
    no, title, writer, content
) values (
    (select nvl(max(no) + 1, 1) from tb_board),
    'aaa', 'w111', 'c111'
);    

select * from tb_board;

-- 시퀀스 생성
-- 옵션 : increment by(증가치), start with(시작값)
--      minvalue(최소값), maxvalue(최대값), cache(미리번호발번),
--      cycle(재사용), order
-- 규칙 : s_ , seq_ , s_테이블명_컬럼 (ex> s_board_no) board테이블의 no컬럼이 시퀀스를 사용하겠다.
create sequence 이름
옵션...;

create sequence s_board_no;
-- 시퀀스 값 추출
시퀀스이름.nextval

s_board_no.nextval

-- 값 확인
select s_board_no.nextval
  from dual;
  
-- 현재 생성된 시퀀스 확인
select *
  from user_sequences;
 where sequence_name = 'S_BOARD_NO';
  
-- 시퀀스 삭제
drop sequence 시퀀스이름;
drop sequence s_board_no;



--------------------------------
뷰(view) 객체

- 실제적으로 쿼리 문장을 가진다.
- 자체의 데이터는 없지만 테이블의 데이터를 볼 수 있는 창과 같다.
- 뷰는 alter 명령이 없다. 뷰를 수정하기 위해서는 생성시 or replace 를 활용

장점
- 복잡한 쿼리의 결과를 통해 얻을 수 있는 결과를 간단한 현태의 쿼리를 써서 구한다.

생성
create [or replace] view 뷰이름  -- [] 생략가능
as
쿼리문;

삭제 
drop view 뷰이름;
--------------------------------

create view emp110_view
as
select e.employee_id, e.last_name, e.salary, e.department_id, d.department_name
  from employees e
 inner join departments d
    on e.department_id = d.department_id
 where e.department_id = 110
 order by e.salary desc;

-- 뷰의 내용을 변경해야 한다면 or replace 붙여서 사용한다.
create or replace view emp110_view
as
select e.employee_id, e.last_name, e.salary, e.department_id, d.department_name
  from employees e
 inner join departments d
    on e.department_id = d.department_id
 where e.department_id = 110
 order by e.salary desc;

-- 생성된 뷰를 확인하기
select *
  from user_views;

-- 뷰 삭제하기
drop view 뷰이름

drop view emp110_view;


------------------------------------------------
인덱스(index) 객체

- 데이터를 빠르게 검색하기 위한 객체
- B*트리 검색방식으로 디스크 입출력 횟수를 줄인다.
- 인덱스는 논리적, 물리적으로 테이블과 별도의 공간을 가진다.
- 수정, 삭제가 빈번한 컬럼은 적합하지 않다.
- 인덱스는 사용자가 필요에 의해서 만들수도 있고, 
  자동으로 생성될 수도 있다.
- 자동으로 만들어지는 경우 : primary key, unique 키로 설정된 컬럼
  Unique Index 

create index 이름
on 테이블명(컬럼명, ...);
------------------------------------------------

-- 인덱스 생성하기
create index temp_player_position_ind
on player_t(position);

-- 생성된 인덱스 확인하기
select *
  from user_indexes;
  
-- 인덱스 삭제하기
drop index 이름;
drop index temp_player_position_ind;




























