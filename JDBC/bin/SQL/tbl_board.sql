-- tbl_board 테이블 생성 설계

create table tbl_board(
 bno number(38) primary key --게시판 번호
 ,bname varchar2(200) not null --게시판 글쓴이
 ,btitle varchar2(200) not null -- 글 제목
 ,bcont varchar2(4000) not null -- 글내용
 ,bdate date -- 등록날짜
);

select * from tbl_board order by bno desc; -- 게시판 번호를 기준으로 내림차순 정렬

--bno_seq 시퀀스 생성

create sequence bno_seq
start with 1 -- 1번부터 시작, 기본값이라 생략 가능
increment by 1 -- 1씩 증가, 기본값이라 생략가능.
nocache -- 임시메모리 사용안함
nocycle; -- 시퀀스 최대값 또는 최소값 도달시 다시 처음부터 반복안함. 기본값이라 생략 가능.

-- bno_seq 시퀀스 다음 번호값 확인
select bno_seq.nextval as "bno_seq다음시퀀스번호" from dual;

commit