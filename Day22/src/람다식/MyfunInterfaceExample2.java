package 람다식;

//함수형 인터페이스를 활용하여 람다식을 작성한 소스예

public class MyfunInterfaceExample2 {

	public static void main(String[] args) {

		Myfuninterface2 fi;

		fi = (x) -> {
			int result = x * 7;
			System.out.println("7*7=" + result);
		};
		fi.method(7);

		fi = (a) -> {
			System.out.println(a + "*5=" + (a * 5));
		};
		fi.method(5);

		fi = a -> System.out.println("7*7=" + (a + 7)); // ()와 {};가 생략됨.
		fi.method(7);

	}

}
