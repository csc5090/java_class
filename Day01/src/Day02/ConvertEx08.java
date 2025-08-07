package Day02;

public class ConvertEx08 {

	public static void main(String[] args) {
		
		/*
		 * 확장된 복합 대입 연산자 특징
		 * a+=10 은 a=a+10과 같은 의미.
		 * a 두번 쓰기 귀찮아서 넘긴듯?
		 */
		
		int a=10;
		a=a+10;
		System.out.println("a="+a); //20
		
		a=a-2;
		System.out.println("a="+a); //18
		
		a+=2;
		System.out.printf("a=%d \n", a); //20
		
		a-=7;
		System.out.printf("a=%d \n", a); //13
		
		
		
		

	}

}
