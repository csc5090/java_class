create or replace procedure customer_pro
-- or replace옵션은 재생성

(
    cusname out customer.cus_name%type, --cusname 변수는 customer테이블의 cus_name컬럼 타입으로 지정됨.
    --out 모드 매개변수는 컬럼에 저장된 레코드값을 되돌려 받을 때 사용
    
    cusphone out customer.cus_phone%type,
    cusemail out customer.cus_email%type,
    cusno in customer.cus_no%type
)

is
begin
    select cus_name, cus_phone, cus_email into cusname, cusphone, cusemail
    from customer where cus_no=cusno;
    --입력받은 고객번호를 기준으로 오라를 해당테이블로 고객이름, 폰번호, 이메일을 검색해서
    -- cusname, cusphone, cusemail 각 변수에 저장함.
end;


commit