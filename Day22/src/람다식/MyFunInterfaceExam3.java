package 람다식;

public class MyFunInterfaceExam3 {

	public static void main(String[] args) {
		
		MyFunInterface3 fi;
		
		fi = (a,b) -> {
			int result = a+b;
			return result;
		};
		System.out.println("100+100="+fi.method(100, 100));
		
		fi = (a,b) -> a - b; // {};; 과 return 생략
		System.out.println("10-3="+fi.method(10,3));
		
		fi = (a,b) -> sum(a,b);
		System.out.println("50+50="+fi.method(50, 50));

	}

	
	public static int sum(int a,int b) {
		return a+b;
	}
}
