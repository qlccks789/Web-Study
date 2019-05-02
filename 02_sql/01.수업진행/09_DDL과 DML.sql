--------------------------------------------------
DDL 명령어 

create   - 테이블 생성
comment  - 테이블 또는 컬럼에 주석
drop     - 테이블 삭제
truncate - 테이블의 전체 데이터를 자를때(복구 불가능하게 삭제)
rename   - 테이블의 이름을 변경
alter    - 테이블의 컬럼 또는 제약조건을 변경
--------------------------------------------------
--------------------------------------------------
DML 명령어

insert
update
delete
--------------------------------------------------
desc : 테이블의 구조를 확인 할 때




-------------------------------------------
create

- 테이블 생성
- 내부적으로 관리될 때 대문자로 자동 저장됨
- 하나 이상의 컬럼으로 만들어야 한다.
- 데이터 타입을 컬럼에 명시해서 생성한다.
- 자바의 클래스(VO)와 유사하다..

형식

create table 테이블명 (
    컬럼명    타입(크기),
    컬럼명    타입(크기),
    ........
    컬럼명    타입(크기)
);
테이블명 이름 규칙 : t_(테이블명), tb_(테이블명), tbl_(테이블명), _t, _tb, _tbl 
-- tb_(테이블명) 으로 규칙을 정함 !

컬럼명 : 33자 까지 가능, 약어 사용(3자 또는 4자) 

데이터 타입(주로) 
: 문자(char - 고정길이, varchar2- 가변길이)
: 숫자(number)
: 날짜(date)

테이블 생성 - 데이터 타입 유형 이해하기
-------------------------------------------
create table  tb_char (
    id number,     --> id컬럼은 숫자유형의 컬럼이다.. (숫자값만 들어와야한다)
    a char(5),     --> a컬럼은 문자값을 받아들이는데, 5자까지 받을수있다.
    b varchar2(5)  
);

-- 데이터 추가하기 (insert into)
-- char 타입은 고정되어있는 값(주민번호, Y or N) 에 주로 쓰이고 그 외에는 varchar2 를 사용한다..
insert into tb_char(id, a, b) values(1, 'x ', 'x');  -- tb_char(id, a, b)에 (1, 'x ','x')의 값을 넣겠다.
insert into tb_char(id, a, b) values(2, 'x ' ,'x '); -- tb_char(id, a, b)에 (2, 'x ','x ')의 값을 넣겠다.

--  1  5  1
--  2  5  2 
select id, length(a), length(b)
  from tb_char;

-- char 타입의 a는 .. x값이 모두 출역됨
-- 'x ' 도 출력됨
select *
  from tb_char
 where a = 'x';
 
-- varchar2 타입의 b는 'x'값만 출력됨..
-- 'x ' 일 경우에는 'x '만 출력
select *
  from tb_char
 where b = 'x';

-- 숫자 확인
create table tb_num(
     a number(3),  --> 3자리 크기의 숫자값이 들어 갈 수 있다.
     b number(3, 1)  --> 소수점아래 1자리까지 들어갈 수 있다.  정수2자리,소수1자리 까지들어갈수있다. 
);

insert into tb_num(a, b) values(100, 10);

insert into tb_num(a, b) values(100, 0.1);

insert into tb_num(a, b) values(100, 0.5);

-- 소수점 아래 한자리만 가능하기 때문에 0.5로 입력됨 (반올림시킨다)
insert into tb_num(a, b) values(100, 0.51);    --> 100, 0.5입력
-- 0.6 이 들어감.. (반올림)
insert into tb_num(a, b) values(100, 0.56);    --> 100, 0.6입력

insert into tb_num(a, b) values(999, 99);  --> 999, 99

insert into tb_num(a, b) values(999, 100);  --> b의값이 에러발생..

insert into tb_num(a, b) values(999, 99.9);  --> 999, 99.9

insert into tb_num(a, b) values(999, 99.91);  --> 999. 99.9

insert into tb_num(a, b) values(999, 99.95);  --> b의값이 에러발생 : 반올림하면 100이됨


---------------------------------------------------
테이블 제약조건과 관련된 용어들...

1.primary key : 기본키(PK)
    - 테이블에 하나만 설정 가능(여러개 설정 불가)
    - 여러개의 컬럼을 조합해서 사용 할 수 있음.
    - 데이터 행을 구분하는 역할 
    - 인조키(대체키) : 시스템에서 만들어서 사용하는 것, 오라클은 시퀀스를 주로 활용
    - 다른 제약조건 2가지의 의미를 포함
       : UNIQUE(유일해야 한다.), 
       : NOT NULL(값이 무조건 입력되어야 한다.)

2. NOT NULL
   - 널을 허용하지 않는다.
   - 값을 반드시 입력해야 한다.
   
3. UNIQUE 
   - 입력되는 값이 고유해야 한다.(같은 값의 입력을 허용하지 않는다.)
   - 널값은 허용된다.
   
4. CHECK 
   - 입력되는 값을 체크한다.
   
5. FOREIGN KEY 
   - 다른 테이블의 컬럼의 값을 참조
   - 같은 테이블의 다른 컬럼의 값을 참조
   - 참조되는 쪽의 컬럼은 PK 또는 UK(UNIQUE) 해야 한다.

default
  - 값이 입력되지 않은 경우 기본적으로 제공할 값을 설정
---------------------------------------------------

-- 컬럼레벨 설정 : 컬럼 이름 옆에 제약조건 설정
create table tb_book(
          id		number(5)		primary key,
          name		varchar2(30)	not null,
          price		number(8)		check (price > 0),
          isbn		varchar2(14)	unique,
          pub_date	date			default sysdate
);

-- 테이블 레벨 제약조건 설정 : not null 제약조건은 컬럼레벨 설정만 가능
create table tb_book(
          id		number(5),
          name		varchar2(30) not null,
          price		number(8),
          isbn		varchar2(14),
          pub_date	date default sysdate,
          primary key(id),
          check (price > 0),
          unique(isbn)
);


---------------------------------------------------
테이블 삭제하기
 - drop table 테이블명
 
휴지통에 있는 테이블 삭제하기
 - purge recyclebin;

휴지통으로 보내지 않고 완전 삭제하기
 - drop table 테이블명 purge;
---------------------------------------------------
   
drop table tb_book;

drop table tb_book purge;
   


--------------------------------------
제약조건을 확인하자
--------------------------------------
-- 테이블, 컬럼이름은 대문자로 관리
-- 결과 0건 
select constraint_name, 
       constraint_type, 
       table_name, 
       search_condition
  from user_constraints
 where table_name = 'tb_book';   
-- 대문자로 바꿔주자
select constraint_name, 
       constraint_type, 
       table_name, 
       search_condition
  from user_constraints
 where table_name = 'TB_BOOK';   
   
 
-- 제약조건 설정 시 별도의 잉ㄹ므을 사용자가 설정하지 않은 경우
-- 자동으로 시스템에서 이름을 설정(SYS_C숫자)
   
   
 git 에서 받기........
 
 
 
 
 
 
 
----------------------------------------------
제약조건 이름을 직접 설정하자...   
constraint
컬럼이름 타입(크기) constraint 제약조건명 제약조건
----------------------------------------------


create table tb_book(
          id		number(5)		constraint book_id_pk		primary key,
          name		varchar2(30)	constraint book_name_nn		not null,
          price		number(8)		constraint book_price_ck	check (price > 0),
          isbn		varchar2(14)	constraint book_isbn_uk		unique,
          pub_date	date			default sysdate
);
   

----------------------------------------
생성된 제약조건 값을 입력하고 확인하기..   
----------------------------------------
insert into tb_book(id, name, price, isbn, pub_date) 
values(1, 'SQL 연습', 20000, '15-222-2222', to_date('2019-02-08', 'yyyy-mm-dd'));
   
-- pub_date 가 실시간 날짜로 default 되어서 들어간다.
insert into tb_book(id, name, price, isbn) 
values(2, 'JAVA JDBC', 50000, '22-222-2222');


-----------------------------------------
제약조건 체크하기..   
-----------------------------------------

--pk 제약조건 에러 발생 : 같은 값 등록 불가능(id(pk))
insert into tb_book(id, name, price, isbn) 
values(1, 'MyBatis', 50000, '33-222-2222');
   
-- id를 뺏을때..
-- pk 제약조건 에러 발생 : 널값 입력 불가능(id(pk))
insert into tb_book(name, price, isbn) 
values('MyBatis', 50000, '33-222-2222');
   
-- name 컬럼에 NOT NULL 제약조건이기때문에 null 이 들어갈수없음.
-- not null 제약조건 에러 발생 : 널값 입력 불가능(name)
insert into tb_book(id, name, price, isbn) 
values(3, null, 50000, '33-222-2222');
   
-- check 제약조건 에러 발생 : price > 0 조건을 줬기 때문에.
insert into tb_book(id, name, price, isbn) 
values(3, 'MyBatis', -1000, '33-222-2222');
   
-- unique 제약조건 에러 발생 : isbn 의 유니크값이 고유해야하기 때문에..(위에이미존재)
insert into tb_book(id, name, price, isbn) 
values(3, 'MyBatis', 10000, '22-222-2222');


   

-------------------------------------------------
Foreign key : 외래키
-------------------------------------------------
-- 게시판의 vo 클래스
create table tb_board(
    no number(7) constraint board_no_pk primary key,
    writer varchar2(30) constraint board_writer_nn not null,
    title varchar2(200) constraint board_title_nn not null,
    content varchar2(4000),    --> varchar2 가 가질수 있는 최대크기 4000
    view_cnt number(6) default 0,
    reg_date date default sysdate
);

-- 댓글 테이블 생성하기..
create table tb_comment (
    comment_no number(6) constraint comment_no_pk primary key,
    no number(7) constraint comment_no_fk references tb_board(no) --> references 참조한다 tb_board(no) : tb_board(no)를 참조한다.
    writer varchar2(30) constraint comment_writer_nn not null,
    content varchar2(500) constraint comment_content_nn not null,
    reg_date date default sysdate
);
-- 에러발생 : tb_comment 테이블에서 foreign key(fk)로 참조하고 있어서 삭제가 불가능.
drop table tb_board purge;

-- 확인하기
select a.constraint_name, a.constraint_type, a.table_name,
       b.column_name, a.search_condition
  from user_constraints a
 inner join user_cons_columns b
    on a.constraint_name = b.constraint_name
 where a.table_name = 'TB_COMMENT';
   
-- 테이블을 제거하려하는데 참조하는 테이블이 있어서 삭제가 안될때..
-- 참조하는 제약조건을 같이 삭제하기 (cascade constraints)
drop table tb_board cascade constraints purge;
drop table TB_COMMENT purge;

-- tb_board, tb_comment 테이블 다시 생성 후 아래 진행..
-- 에러발생 : board(no) 컬럼의 값이 없으므로 에러가 발생한다. board에 값을 먼저 넣어줘야함 -> comment가 board 를 참조하고있기때문에
insert into tb_comment(comment_no, no, writer, content)
values (1, 1, 'aaa', 'bbb');

-- comment테이블이 board 테이블을 참조하고있기 때문에 board테이블의 no가 값이 우선 있어야 한다.
insert into tb_board(no, writer, title, content)
values(1, 1, 'aaa', 'bbb');

-- tb_board 의 게시물 번호가 1번인 것을 삭제하겠다.
-- 에러발생 : tb_comment 에서 참조하는 값이 있어서 삭제가 불가능..
-- 참조하고있는 자식(tb_comment)부터 삭제해야함..   
delete 
  from tb_board
 where no = 1;

-- 자식(tb_comment)을 먼저 삭제.
delete
  from tb_comment
 where no = 1;
-- 그후 부모 삭제
delete
  from tb_board
 where no = 1;

-- 부모키가 삭제되면 자식을 같이 삭제하는 방법 (이방법을하지않으면 하나씩 따로 삭제해줘야함)
-- references(참조) 하는 컬럼 뒤에   on delete cascade 를 붙여준다.
create table tb_comment (
    comment_no number(6) constraint comment_no_pk primary key,
    no number(7) constraint comment_no_fk references tb_board(no) on delete cascade, --> references 참조한다 tb_board(no) : tb_board(no)를 참조한다.
    writer varchar2(30) constraint comment_writer_nn not null,
    content varchar2(500) constraint comment_content_nn not null,
    reg_date date default sysdate
);

-- 다시 생성 후 삭제해보기..
delete
  from tb_board
 where no = 1; 
-- > 결과 : tb_board 만 삭제했는데 tb_comment 도 같이 삭제됨.
-- > on delete cascade를 해줬기 때문에..



 
-- 게시물 추천 테이블
-- 한 사용자는 하나의 게시물을 여러번 추천할 수 없다.
create table tb_recom (
    id varchar2(20),
    no number(7),
    reg_date date default sysdate,
    constraint recom_id_no-Pk primary key(id, no)
    constraint recom_no_fk foreign key (no) references tb_board(no) on delete txable;
    
);



------------------------------------------
서브쿼리를 이용한 테이블 생성하기 
------------------------------------------
create table employees_copy
as 
select * form emplooyes;

--삭제
drop table employees_copy purge;

-- 구조만 복사할때
create table employees_copy
as
select * from employees
where 1! =1; 
 

---------------------------------------------
rename

rename A to B;
---------------------------------------------
rename tb_board to ttt_board;
 
 
 
 
---------------------------------------------
truncate : 테이블의 데이터를 복원 불가능 상태로 삭제

truncate : table 테이블명;
---------------------------------------------

delete - 데이터만 삭제, 구조는 남아있다. -> 데이터 복원 가능
truncate - 데이터만 삭제, 구조는 남아있다., 데이터 복원이불가능 
drop   - 구조와 데이터 모두 삭제



---------------------------------------------
comment : 테이블 또는 
---------------------------------------------

-- 테이블 주석 달기
comment on table tb_board is '게시판';

-- 컬럼에 주석 달기
comment on column tb_board.no is '게시물 번호';

comment on column tb_board.writer is '작성자';

comment on column tb_board.title is '제목';

comment on column tb_board.content is '내용';

comment on column tb_board.view_cnt is '조회수';

comment on column tb_board.reg_date is '등록일';


------------------------------------------
설정된 주석 내용 확인하기
------------------------------------------
select * from user_tab_comments where table_name = 'TB_BOARD';

select * from user_col_comments where table_name = 'TB_BOARD';
 


--------------------------------------------
alter 
 - 테이블 변경
 - 컬럼 추가, 컬럼 삭제, 컬럼 이름변경
 - 컬럼 변경(타입, 크기, default, not null)
 - 제약조건 추가, 삭제
--------------------------------------------

alter table 테이블명
add (컬럼);      -- 추가

alter table 테이블명
drop (컬럼);     -- 삭제
 
alter table 테이블명
modify (컬럼);   -- 수정
 
alter table 테이블명
rename column a to b;  -- 컬럼 이름 변경
 
alter table 테이블명
add constraint 제약조건명 제약조건타입(컬럼명);  --> 컬럼에 제약조건  추가
 
alter table 테이블명
drop constraint 제약조건명;   --> 제약 조건을 삭제

------- alter 이해하기
create table tb_alter (
    name varchar2(10),
    age varchar2(3)
);

-- 이메일 컬럼 추가 하기
alter table tb_alter
add (email varchar2(20));
 
-- email 컬럼의 값이 중복되지 않도록..(unique 제약조건 추가)
-- table 레벨 제약조건 설정과 동일한 형태이다..
alter table tb_alter
add constraint alter_email_uk unique(email);
 
-- name 컬럼의 이름을 user_name 으로 변경해보기..
alter table tb_alter
rename column name to user_name;

-- age 에 대한 타입을 varchar2 에서 number로 변경해보기
-- 이미 데이터 값이 들어가있으면 그 데이터를 삭제하고 바꿔줘야한다..
alter table tb_alter
modify (age number(3));

-- email 컬럼에 설정된 제약조건을 삭제해보기..
-- 제약조건을 삭제하기위해서는 어떤 제약조건이 설정되어있는지 알아야 한다.
-- email 에 설정된 제약조건은 alter_email_uk
alter table tb_alter
drop constraint alter_email_uk;

-- email 컬럼 삭제 해보기
alter table tb_alter
drop (email);

-- table 삭제 하기 (tb_alter)
drop table tb_alter purge;
 

-------------------------------------------------
insert
delete
update
-------------------------------------------------

-- 테이블에 존재하는 모든 컬럼에 값을 입력(권장하지 않는다.)
insert into 테이블명
values(값1, ...);

insert into 테이블명(컬럼명 , ...)
values(값1, ...);

-- 권장 하지 않음
insert into tb_board
values(1, 'hong', '내용', '제목', 0, sysdate);

insert into tb_board(no, writer, content, title, view_cnt, reg_date)
values(1, 'hong', '내용', '제목', 0, sysdate);

-- 가독성이 좋게 코드를 짠다.
insert into tb_board(
    no, 
    writer, 
    content, 
    title, 
    view_cnt, 
    reg_date
)
values(
    1, 
    'hong', 
    '내용', 
    '제목', 
    0, 
    sysdate
);

--서브쿼리를 이용한 데이터 입력
-- employees 테이블에있는 내용(데이터)들을 employee_copy에 복사
insert into employee_copy
select * 
  from employees;

-- 테이블 구조 복사본 만들기
create table employee_copy
as
select * from employees where 1 != 1;


insert into tb_board(
    no, 
    title, 
    writer, 
    content
)
values(
     (select nvl(max(no), 0)+1
        from tb_board), 
     't', 
     'w', 
     'c'
);


-----------------------------------------
수정 : update
-----------------------------------------
형태 : 
update 테이블명
   set 컬럼 = 변경할값,
       컬럼 = 변경할값, 
       ....
       컬럼 = 변경할값
 where 조건절;
       
-- 3번 게시물의 제목을 '수정된 제목' 내용을 '수정된 내용'으로 바꿔보기..
update tb_board
   set title = '수정된 제목',
       content = '수정된 내용'
 where no = 3;



----------------------------------------
delete : 삭제
----------------------------------------
delete 
  from 테이블명  
 where 조건절;
 
-- 2번과 3번 게시물을 삭제하시오..
delete
  from tb_board
 where no in (2,3);





       
       
       











