create table DM_TBL(
    dmno number(8) constraint DM_dmno_pk primary key,
    custid varchar2(10),
    maildate date,
    contents varchar2(13),
    dept char(2),
    grade char(1),
    campain char(2)
);

create table bookinfo_tbl(
    custid varchar2(10) constraint bookinfo_custid_pk primary key,
    author varchar2(20),
    goods char(2),
    phone varchar2(13),
    email varchar2(20),
    area varchar2(20)
);

alter table DM_TBL
modify (contents varchar(16));

insert into DM_TBL(dmno, custid, maildate, contents, dept, grade, campain)
values(1, 'aaa', to_date('20171201','yyyymmdd'), '안녕하세요?', '10', '1', 'C1');

insert into DM_TBL(dmno, custid, maildate, contents, dept, grade, campain)
values(2, 'bbb', to_date('20171201','yyyymmdd'), '안녕하세요?', '10', '2', 'C1');

insert into DM_TBL(dmno, custid, maildate, contents, dept, grade, campain)
values(3, 'ccc', to_date('20171201','yyyymmdd'), '안녕하세요?', '10', '3', 'C1');

insert into DM_TBL(dmno, custid, maildate, contents, dept, grade, campain)
values(4, 'ddd', to_date('20171224','yyyymmdd'), '안녕하세요?', '20', 'V', 'C2');

alter table DM_TBL
modify (grade char(2));

insert into DM_TBL(dmno, custid, maildate, contents, dept, grade, campain)
values(5, 'eee', to_date('20171224','yyyymmdd'), '안녕하세요?', '20', 'VV', 'C2');

insert into DM_TBL(dmno, custid, maildate, contents, dept, grade, campain)
values(6, 'fff', to_date('20171224','yyyymmdd'), '안녕하세요?', '30', '1', 'C3');

select *
  from DM_TBL;
  
  
alter table bookinfo_tbl
modify (goods char(6));

insert into bookinfo_tbl(custid, author, goods, phone, email, area)
values('aaa', '김고객', '의류', '010-1111-1111', 'aaa@korea.com', '서울');

insert into bookinfo_tbl(custid, author, goods, phone, email, area)
values('bbb', '이고객', '의류', '010-1111-1112', 'bbb@korea.com', '서울');

alter table bookinfo_tbl
modify (goods char(9));

insert into bookinfo_tbl(custid, author, goods, phone, email, area)
values('ccc', '박고객', '식료품', '010-1111-1113', 'ccc@korea.com', '경기');

insert into bookinfo_tbl(custid, author, goods, phone, email, area)
values('ddd', '홍고객', '공산품', '010-1111-1114', 'ddd@korea.com', '대전');

insert into bookinfo_tbl(custid, author, goods, phone, email, area)
values('eee', '조고객', '컴퓨터', '010-1111-1115', 'eee@korea.com', '대전');

insert into bookinfo_tbl(custid, author, goods, phone, email, area)
values('fff', '백고객', '관광', '010-1111-1116', 'fff@korea.com', '울산');

select *
  from bookinfo_tbl;


select d.dmno,
       b.custid,
       b.author,
       to_char(d.MAILDATE, 'yyyy-mm-dd'),
       d.contents,
       d.CAMPAIN
  from bookinfo_tbl b
 inner join DM_TBL d
    on b.custid = d.custid;

insert into bookinfo_tbl(custid, author, goods, phone, email, area)
values('고객아이디', '성명','관심상품','전화번호','이메일','거주지역');

select b.area, count(*)
  from DM_TBL d
 inner join bookinfo_tbl b
    on d.custid = b.custid
 group by b.area;