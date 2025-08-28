/* 2025년 8월 28일
 * 개발자 : 최상철 
 * 
 * 생성자의 특징)
 * 1.생성자는 메서드의 일종이기 때문에 오버로딩이 가능하다. 
 */

class Choi{
	private String mem_id; //회원 아이디
	private String mem_name; // 회원 이름
	private String mem_add; //회원 주소
	
	public Choi() {//전달인자가 없는 기본 생성자. 생성자가 오버로딩 되면 자바 컴파일러는 더 이상 매개변수가 없는 기본생성자를 묵시적으로 제공함.
		mem_id="cc01";
		mem_name="최상철";
		mem_add="대전 용두동";//생성자의 주된 기능은 클래스 소속 멤버변수 중 인스턴스 변수 초기화
	}
	
	
	public Choi(String new_id, String new_name, String new_add) {
		mem_id=new_id;
		mem_name = new_name;
		mem_add = new_add;
		
	}//전달인자 개수가 다른 생성자 오버로딩
	
	public void pr() {
		System.out.println("회원 아이디 : "+mem_id+", 회원 이름 : "+mem_name+", 회원 주소 : "+mem_add);
	}
	
	
	
}




public class ClassEx04 {

	public static void main(String[] args) {
		
		Choi member = new Choi(); // new Choi에 의해서 기본 생성자 호출
		member.pr();

		Choi member02 = new Choi("cc02","최원효","대전 용두동"); //전달인자 3개짜리 오버로딩된 생성자 호출
		member02.pr();
	}

}
