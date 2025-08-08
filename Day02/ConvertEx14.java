package Day02;

public class ConvertEx14 {

	public static void main(String[] args) {
		
		char a = 'a'; //'a'는 십진수 정수 97
		char d = 'd'; //'d'는 십진수 정수 100
		char zero = '0'; //'0'은 십진수 정수 48
		char two = '2'; //'2'는 십진수 정수 50
		
		System.out.printf("'%c' = '%c' = %d \n", d,a,d-a); //%c는 단일문자형태. %d는 십진수 정수 출력형태.
		System.out.printf("'%c' - '%c' = %d \n", two,zero, two-zero); //50-48=2
		System.out.printf("'%c' = %d \n", a, (int)a);
		System.out.printf("'%c' = %d %n", d, (int)d);
		System.out.printf("'%c' = %d %n", zero , (int)zero);
		System.out.printf("'%c' = %d \n", two, (int)two);
		
		

	}

}
