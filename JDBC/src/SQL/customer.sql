--오라클 한줄 주석문 기호 
/*
 오라클 한줄 이상 주석문 기호

*/

CREATE TABLE customer(
 cus_no number(38) primary key -- 고객번호, cus_no은 컬럼명 즉 필드명. 이 컬럼명에 최종 자료가 저장됨.
 --컬럼에 저장된 한 행의 자료 집합을 레코드(record)라고 함.
 , cus_name varchar2(50) not null --고객 이름
 , cus_phone varchar2(30) not null  --고객 폰번호
 , cus_email varchar2(100) not null --고객 이메일
 , cus_date date default sysdate --고객 등록 날짜, default sysdate 제약조건을 주면 cus_date 컬럼에 굳이 레코드 저장시 등록날짜를 
                                                      -- insert 하지 않아도 기본 날짜값이 저장된다.
);

/*
 오라클의 자료형 종류)
 1. number(38) : 최대자리수 38까지 정수 숫자값을 저장되게 하는 정수 숫자 타입.
 2. varchar2는 가변 문자 타입
 3. date는 날짜 타입
 
 제약조건이란 테이블 컬럼에 레코드 저장시 어떤 제한을 가하는 것을 말함.
 
 제약조건 종류)
 1. primary key(기본키 제약조건) : 이 제약조건은 중복 레코드 저장 금지, null 저장 금지.
 2. not null : null 저장금지, 중복 레코드는 저장할 수 있음.
 
 
*/

-- 생성된 customer 테이블 컬럼명 확인

select * FROM CUSTOMER; -- 테이블의 모든 컬럼(*) 레코드 데이터를 확인하는 쿼리문. *는 모든 컬럼을 선택.


/*
 *  레코드 저장문인 insert문 형식)
 * insert into 테이블명 (컬럼목록) values(값);
 * 테이블의 모든 컬럼에 레코드 저장시에는 컬럼목록을 생략해도 된다.
 * 하지만 원하는 컬럼에만 레코드를 저장할 때는 컬럼목록을 명시해야 한다.
 * 컬럼목록 순서와 values(값) 순서목록이 일치해야 한다.
 * 문자열 레코드 젖아시에는 ''(작은따옴표)로 감싸야 한다.
 * 
 * sql문은 영문대소문자를 구별하지 않는다. 하지만 컬럼에 저장되는 영문 레코드는 대소문자를 구분한다.
 * 
 * 시퀀스란?
 * 번호 발생기. 주로 고객번호나 게시판 번호 등 정수숫자 번호값 발생용도(순차적 증가)로 사용함.
 * 
 * 시퀀스 특징)
 * 1. 시퀀스 번호는 중복 번호가 없고, NULL이 없다. 그러므로 primary key(기본키) 제약 조건으로 설정되고, 정수숫자 타입으로 지정된
 * 컬럼 레코드값 저장용도로 사용해야 한다.
 * 
 * 시퀀스 생성문법 형식)
 *  create sequence 시퀀스명
 * start with 1 : 1부터 시작. 기본값이라 생략 가능
 * increment by 1 : 1씩 증가. 기본값이라 생략 가능.
 * nocache : 임시메모리를 사용하지 않음. 생략하면 기본값은 cache 20.
 * 이것의 의미는 시퀀스 번호를 미리 20개까지 메모리에 올려놓겠다는 것. 마지막으로 발급된 시퀀스 번호가 100이라면, 캐시에서 101~120까지
 * 메모리에 있고, 다음 시퀀스 번호값은 121부터 시작.  오늘 db가 재시작하면 캐시값은 초기화 됨.
 * 
 * nocycle : 시퀀스 최대값 또는 최소값에 도달하면 다시 처음부터 시퀀스 번호값을 반복하지 않겠다는 의미. 기본값이라 생략 가능.
 * 
 */

--cus_no 시퀀스 생성

create sequence cus_seq
start with 1
increment by 1
nocache
nocycle;

--cus_seq 다음 시퀀스 번호값 확인 -> 시퀀스이름.nextval
select cus_seq.nextval as "다음 시퀀스 번호" from dual;

--sysdate 는 오라클의 날짜 함수. 오늘 날짜 시간값 확인
select sysdate as "오늘 날짜 시간값 " from dual;

--2개 레코드 저장
INSERT INTO customer (cus_no, cus_name, cus_phone, cus_email)
VALUES (cus_seq.nextval, '홍길동', '010-9999-9999', 'hong@naver.com');

INSERT INTO customer (cus_no, cus_name, cus_phone, cus_email)
VALUES (cus_seq.nextval, '이순신', '010-777-7777', 'lee@gamil.com');

/*
 * 	레코드 검색 쿼리문 문법형식)
 * 	select 컬럼목록(전체컬럼은 *) from 테이블명 where  조건식 order by 기준컬럼 desc(asc);
 * 
 *  order by는 정렬문.
 * 	1.desc : 내림차순
 * 2. 내림차순(asc) 정렬 규칙)
 * 	  한글은 가나다 역순, 영어는 알파벳 역순, 숫자는 큰 숫자부터 정렬.
 * 
 * 오름차순 정렬문은 asc문이다. 기본값으로 생략 가능. 오름차순 정렬은 내림차순 정렬의 역순이다.
 */


--고객번호를 기준으로 내림차순 정렬
select * from customer order by cus_no desc;

/*
 * 레코드 수정 문법
 * 
 * update 테이블명
 * set 컬럼명=수정할 값, 컬럼명=수정할 값,...
 * where 조건식;
 * 
 */

--3번 레코드 고객이름을 '수정이순신', 메일주소를 'editlee@gamil.com'으로 수정

update customer set cus_name='수정이순신', cus_email='editlee@gmail.com' where cus_no=3;

select cus_no, cus_name, cus_email from customer where cus_no=3;


--삭제할 레코드 하나 저장
insert into CUSTOMER (cus_no,cus_name,cus_phone,cus_email) values(cus_seq.nextval, '삭제할이름','010-5555-5555',
'del@nate.com');

/* 레코드 삭제 sql문인 delete문 문법 형식)
 * delete from 테이블명 where 조건식;
 * 
 */
  
delete from CUSTOMER where cus_no=6;

commit



