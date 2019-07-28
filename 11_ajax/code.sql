create table tb_code(
	code   varchar2(8),
	name   varchar2(20), 
	lev    number(3) ,
	group_code varchar2(8)
);

insert into tb_code
   (code, name, lev)
 values
   ('0001', '서울시', 1);
insert into tb_code
   (code, name, lev)
 values
   ('0002', '경기도', 1);
insert into tb_code
   (code, name, lev)
 values
   ('0003', '인천시', 1);
insert into tb_code
   (code, name, lev, group_code)
 values
   ('0004', '강남구', 2, '0001');
insert into tb_code
   (code, name, lev, group_code)
 values
   ('0005', '강서구', 2, '0001');
insert into tb_code
   (code, name, lev, group_code)
 values
   ('0006', '용산구', 2, '0001');
insert into tb_code
   (code, name, lev, group_code)
 values
   ('0007', '포천시', 2, '0002');
insert into tb_code
   (code, name, lev, group_code)
 values
   ('0008', '부천시', 2, '0002');
insert into tb_code
   (code, name, lev, group_code)
 values
   ('0009', '남구', 2, '0003');
insert into tb_code
   (code, name, lev, group_code)
 values
   ('0010', '중구', 2, '0003');
insert into tb_code
   (code, name, lev, group_code)
 values
   ('0011', '남동구', 2, '0003');
insert into tb_code
   (code, name, lev, group_code)
 values
   ('0012', '개포동', 3, '0004');
insert into tb_code
   (code, name, lev, group_code)
 values
   ('0013', '논현동', 3, '0004');
insert into tb_code
   (code, name, lev, group_code)
 values
   ('0014', '대치동', 3, '0004');
insert into tb_code
   (code, name, lev, group_code)
 values
   ('0015', '삼성동', 3, '0004');
insert into tb_code
   (code, name, lev, group_code)
 values
   ('0016', '가양동', 3, '0005');
insert into tb_code
   (code, name, lev, group_code)
 values
   ('0017', '개화동', 3, '0005');
insert into tb_code
   (code, name, lev, group_code)
 values
   ('0018', '공항동', 3, '0005');
insert into tb_code
   (code, name, lev, group_code)
 values
   ('0019', '등촌동', 3, '0005');
insert into tb_code
   (code, name, lev, group_code)
 values
   ('0020', '갈월동', 3, '0006');
insert into tb_code
   (code, name, lev, group_code)
 values
   ('0021', '남영동', 3, '0006');
insert into tb_code
   (code, name, lev, group_code)
 values
   ('0022', '도원동', 3, '0006');
insert into tb_code
   (code, name, lev, group_code)
 values
   ('0023', '동빙고동', 3, '0006');
insert into tb_code
   (code, name, lev, group_code)
 values
   ('0024', '동교동', 3, '0007');
insert into tb_code
   (code, name, lev, group_code)
 values
   ('0025', '선단동', 3, '0007');
insert into tb_code
   (code, name, lev, group_code)
 values
   ('0026', '설운동', 3, '0007');
insert into tb_code
   (code, name, lev, group_code)
 values
   ('0027', '신읍동', 3, '0007');
insert into tb_code
   (code, name, lev, group_code)
 values
   ('0028', '소사구', 3, '0008');
insert into tb_code
   (code, name, lev, group_code)
 values
   ('0029', '오정구', 3, '0008');
insert into tb_code
   (code, name, lev, group_code)
 values
   ('0030', '원미구', 3, '0008');
insert into tb_code
   (code, name, lev, group_code)
 values
   ('0031', '관교동', 3, '0009');
insert into tb_code
   (code, name, lev, group_code)
 values
   ('0032', '도화동', 3, '0009');
insert into tb_code
   (code, name, lev, group_code)
 values
   ('0033', '숭의동', 3, '0009');
insert into tb_code
   (code, name, lev, group_code)
 values
   ('0034', '경동', 3, '0010');
insert into tb_code
   (code, name, lev, group_code)
 values
   ('0035', '관동', 3, '0010');
insert into tb_code
   (code, name, lev, group_code)
 values
   ('0036', '내동', 3, '0010');
insert into tb_code
   (code, name, lev, group_code)
 values
   ('0037', '간석동', 3, '0011');
insert into tb_code
   (code, name, lev, group_code)
 values
   ('0038', '고잔동', 3, '0011');
insert into tb_code
   (code, name, lev, group_code)
 values
   ('0039', '구월동', 3, '0011');
commit;


