package Day3;

public class TextBlockExample {

	public static void main(String[] args) {
		
		/* 문자열 안에서 탭키만큼 수평으로 띄우기, 줄바꿈, 특정 문자 입력을 위해 이스케이프 문자를 사용했다.
		 * 그러나 이스케이프 문자 사용시 코드가 매우 복잡해지고, 가독성이 떨어졌다.
		 * 그래서 자바 13버전부터는 텍스트 블록이 추가되었는데, 덕분에 이스케이프 문자를 사용하지 않게 되었다.
		 * 
		 * 텍스트 블록의 문법.
		 * String asd = """
		 * 	...
		 * 	""";
		 * 큰따옴표 3개로 감싸면 그 안에 작성된 문자열은 그대로 변수에 저장된다.
		 */
		
		String asd = """
				{
				"id" : "java",
				"name" : "자바"
				}
				""";
		
		System.out.println(asd);
		
		/* 텍스트 블록에서 줄바꿈은 이스케이프 문자 \n에 해당한다.
		 * 만약 줄바꿈을 하지 않고 한 줄에 연 이어서 작성하고 싶다면
		 * 맨 끝에 \를 붙여주면 된다. 이 기능은 자바 14부터 사용할 수 있다.
		 */
		
		asd = """
				나는 자바를 \
				학습합니다.
				뜌 땨 뜌 땨 
				자바 고수가 될거야
				""";
		
		System.out.printf("asd = %s \n", asd);
		System.out.println(asd);
		
	}

}
