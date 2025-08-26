package src;

/* 참조변수만 선언하고 객체주소를 대입 안 한 상태에서 해당 클래스 소속 멤버변수(인스턴스 변수 : 객체 생성해서 접근하는 변수->속성)
 * 
 * 
 * 
 */

class Member05 {
	String id;
	String name;
	String phone;
}



public class MethodEx05 {

	public static void main(String[] args) {
		
		Member05 m; // 레퍼런스 변수만 선언(객체주소가 저장 안 됨)
		System.out.println("회원 아이디 : "+m.id+", 회원 이름: "m.name+", 폰번호 : "+m.phone);
		
		m=new Member05();//객체주소가 저장된 참조변수 m->객체
		System.out.println("회원 아이디 : "+m.id+", 회원 이름: "m.name+", 폰번호 : "+m.phone);

	}

}
