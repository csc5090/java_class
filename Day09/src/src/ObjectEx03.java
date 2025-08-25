package src;

// Animal02 클래스 소속 멤버 변수인 속성을 정의할 때. private으로 정의하면 외부 클래스에서 접근 할 수 없음.
// 이런 경우 어떻게 처리하는지에 대한 코드.


class Animal03{
	String name;
	private int age; // age 멤버변수 즉 속성을 private으로 정의하면 Animal03 클래스 외부에서 접근 못 한다. (자바의 데이터 보안성)
					 // 이런 경우 값을 저장할 때는 setter()메서드를 호출해서 사용하고, 값을 반환할 때는 getter()메서드를 호출해서 사용한다.
	
	
	public void setAge(int new_age) {
		/* set+속성명(멤버변수명으로 가고 첫글자는 영문 대문자로 한다.) -> 값 저장 메서드이다. setter() 메서드라고 함.
		 * 
		 */
		
		age = new_age;
	}//setAge()
	
	public int getAge() { // get+속성명(멤버변수명으로 가고 첫글자는 영문 대문자로 한다.) -> 값 반환 메서드이다.
		return age;
	}
} // Animal03 class


public class ObjectEx03 {

	public static void main(String[] args) {
		
		Animal03 a; // 객체 주소가 아직 저장 안된 참조 변수.
		a = new Animal03(); // 객체 주소가 저장된 참조 변수 a -> 이 a를 객체명 
		
		a.name = "홍길동";
		// a.age = 26;   age 멤버변수가 private으로 정의되어 있기 때문에 외부 클래스에서 접근할 수 없음.
		a.setAge(26); // 세터 메서드를 호출해서 저장하면 됨.
		
		System.out.println("이름 : " +a.name+"\n나이 : "+a.getAge());
		
		
		

	}

}
