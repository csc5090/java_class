create table member(
 mem_id varchar2(50) primary key --회원아이디
 ,mem_pwd varchar2(200) not null --회원 비밀번호
 ,mem_name varchar2(50) not null --회원 이름
 ,mem_zip varchar2(10) not null --우편번호
 ,mem_zip2 varchar2(10) not null --우편번호
 ,mem_addr varchar2(200) not null --주소
 ,mem_addr2 varchar2(100) not null --나머지 주소
 ,mem_phone01 varchar2(10) --폰번호 첫번째
 ,mem_phone02 varchar2(10) --두번째 
 ,mem_phone03 varchar2(10) --세번째
 ,mail_id varchar2(100) --메일 아이디
 ,mail_domain varchar2(100) --메일 도메인
 ,mem_date date --가입날짜
 ,mem_state number(38) --가입 회원1, 탈퇴 회원이면 2
 ,mem_delcont varchar2(4000) --탈퇴사유
 ,mem_deldate date -- 탈퇴날짜
);

select * from member order by mem_id asc;

-- 회원가입폼에서 아이디 중복 체크를 위한 샘플 회원 저장

insert into member (mem_id,mem_pwd,mem_name,mem_zip,mem_zip2,mem_addr,mem_addr2
					,mem_phone01,mem_phone02,mem_phone03,mail_id,mail_domain,mem_date
					,mem_state) values('kkkkk','77777','홍길동',
					'123','789','대전시 중구 계룡로 846','00빌딩 402호','010',
					'9999','9999','kkkkk','gmail.com',sysdate,1);
					
					
					
--우편 주소 zipcode 테이블 생성(설계)
create table zipcode(
 no number(38) primary key
 ,zipcode varchar2(20) --우편번호
 ,sido varchar2(50) --시, 도
 ,gugun varchar2(50) --구
 ,dong varchar2(100) --읍면동, 길주소
 ,bunji varchar2(50) --나머지 주소					
 );
 
 select * from zipcode;
 
 --샘플 우편 주소 저장
 insert into zipcode values(1,'123-456','대전시','중구','오류동','00빌딩');
 select * from zipcode;
 
 select * from zipcode where dong like '%오류동%';
 commit;