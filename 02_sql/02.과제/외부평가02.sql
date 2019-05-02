create table groupcode(
    gcode char(3) constraint groupcode_gcode_pk primary key,
    gname varchar2(20) constraint groupcode_gname_nn not null
);

insert into groupcode(gcode, gname) values('A', '컴퓨터');

insert into groupcode(gcode, gname) values('B', '냉장고');

insert into groupcode(gcode, gname) values('C', '냉장소모품');

select*
  from groupcode;


create table product(
    code char(3),
    pname varchar2(20) constraint product_pname_nn not null,
    cost number,
    pnum number,
    jnum number,
    sale number,
    gcode char(3),
    constraint product_code_pk primary key(code, gcode),
    constraint product_gcode_fk foreign key(gcode) 
                                references groupcode(gcode) on delete cascade
);

insert into product(code, pname, cost, pnum, jnum, sale, gcode)
values('A01', '컴퓨터DVD', 1500, 300, 50, 2000, 'A');

insert into product(code, pname, cost, pnum, jnum, sale, gcode)
values('A02', '컴퓨터COROM', 1200, 500, 100, 1500, 'A');

insert into product(code, pname, cost, pnum, jnum, sale, gcode)
values('A03', '컴퓨터모니터', 50000, 400, 50, 55000, 'A');

insert into product(code, pname, cost, pnum, jnum, sale, gcode)
values('A04', '컴퓨터프린터', 20000, 400, 100, 23000, 'A');

insert into product(code, pname, cost, pnum, jnum, sale, gcode)
values('B01', '모바일케이스', 1000, 500, 1200, 900, 'B');

alter table product
modify (pname varchar2(21));

insert into product(code, pname, cost, pnum, jnum, sale, gcode)
values('B02', '모바일액정필름', 500, 1000, 2000, 400, 'B');

insert into product(code, pname, cost, pnum, jnum, sale, gcode)
values('C01', '냉장고손잡이', 300, 1000, 300, 1500, 'C');

insert into product(code, pname, cost, pnum, jnum, sale, gcode)
values('C02', '냉장고도어', 40000, 300, 50, 47000, 'C');

insert into product(code, pname, cost, pnum, jnum, sale, gcode)
values('C03', '냉장고냉장박스', 3000, 200, 20, 3500, 'C');

insert into product(code, pname, cost, pnum, jnum, sale, gcode)
values('C04', '냉장고냉동박스', 3500, 300, 80, 4000, 'C');

select *
  from product;



select p.code 제품코드,
       p.pname 제품이름,
       p.cost 제품원가,
       p.pnum 목표수량,
       p.jnum 재고수량,
       p.sale 출고가,
       g.gname 그룹이름
  from product p
 inner join groupcode g
    on p.gcode = g. gcode;
    

select code 제품코드,
       pname 제품이름,
       cost 제품원가,
       pnum 목표수량,
       jnum 재고수량,
       sale 출고가 
  from product
 where gcode = '제품코드?';


update product
   set gcode = '제품코드?'
 where gcode = '제품코드';
 

delete 
  from product
 where gcode = '제품코드 입력';
 
   
   