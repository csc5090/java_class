package 람다식;

public class MyFunInterfaceExample {

	public static void main(String[] args) {

		MyFunInterface fi;
		fi = () -> {
			String result = "method() 호출 01";
			System.out.println(result);
		};
		fi.method();

		fi = () -> {System.out.println("method 호출02");};
		fi.method();

		fi = () -> System.out.println("method() 호출03");
		fi.method();

	}

}