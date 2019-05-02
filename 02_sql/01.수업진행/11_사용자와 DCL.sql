--------------------------------------
사용자 추가   -- 미니 프로젝트 할 때 사용자 새로 만들어서 하기..

create user 사용자명 identified by 패스워드;

create user mini1 identified by mini1;

--순서 : 
-- 토드에서 DBA 접속하기
-- 콘솔창 : conn system/admin
-- create user mini1 identified by mini1;
-- mini1 사용자로 접속시도 .. -> 권한 에러 발생함 : create session 

-- 권한 부여하기 : 관리자 계정으로
grant 권한종류 to 사용자;
grant create session to mini1;

-- mini1 사용자로 접속시도
-- 접속 성공

-- mini1 사용자 접속상태에서 테이블 생성하기
create table aaa(
   id number(3)
);  -- 테이블 생성시 권한 에러 발생함..


-- DBA 사용자 계정에서 mini1 사용자에게 테이블 생성할 수 있는 권한 부여해야함
-- system 계정에서 진행함
grant create table, unlimited tablespace, create view, create sequence to mini1

-- mini1 계정에서 다시 아래를 진행하면
create table aaa(
   id number(3)
);  -- 테이블 생성 성공


-- 롤(role)의 생성 : 반복적으로 사용되는 권한들의 묶음
-- 롤 생성하기
create role 롤이름;
create role user_basic;

-- 롤에 권한 부여하기
grant create session, create table, unlimited tablespace, create view, create sequence to user_basic;


사용자 삭제하기
-- system 에서 수행
-- mini 사용자의 연결 끊기
drop user 사용자명;
drop user mini1 cascade;



사용자 다시 생성하기
create user mini1 identified by mini1;
이미 생성되어 있는 롤(role)을 이용하여 권한 부여하기(오라클 기본 제공 : connect, resource)
grant connect, resource to mini1;



-- 권한을 해제하고 싶다면..
revoke 권한명, ... from 사용자명;
revoke connect, resource from mini1;
--------------------------------------









































