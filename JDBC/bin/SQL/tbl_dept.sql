--tbl_dept 부서테이블 생성

create table tbl_dept(
	deptno number(38) primary key
	, dname varchar2(100)
	, LOC varchar2(200)
);

insert into tbl_dept values(11, '개발부', '대전광역시');

insert into tbl_dept values(12, '데이터베이스부', '경기도 판교');

select * from TBL_DEPT order by deptno asc;
commit

