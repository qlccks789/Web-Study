create table tb_board_file (
	file_no number(6) primary key,
	no number(6) references tb_board(no) on delete cascade,
	org_name varchar2(100) not null,
	system_name varchar2(100) not null,
	file_path varchar2(50) not null,
	file_size number not null
);

create sequence s_board_file_no;