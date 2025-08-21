package DDIT;

public class ArrayEx12 {

	public static void main(String[] args) {
		
		// String 문자열 배열에 관한 소스) 
		
		String[] names = {"Kim", "Na", "Park", "Yi",};
				
				//일반 for 반복문으로 names[] 문자열 배열 원소값 출력
				
				for(int i=0; i < names.length; i++) {
					System.out.println("names["+i+"] : " + names[i]);
				}
				System.out.println("\n ============= \n");
				
				//향상된 확장 for 반복문으로 names배열원소값 출력
				
				for(String name:names) {
					System.out.print(" " + name);
				}
				System.out.println("\n =============== \n");
				
				String tmp = names[3];
				System.out.printf("tmp = %s \n",tmp); // %s는 문자열 출력형태 지시자
				
				names[0] = "Choe"; // 배열 속 첫번재(0) 값 변경(수정)
				
				for(String editName:names) {
					System.out.println(editName+"\t"); // \t 는 탭키만큼 공백넣기
				}
		
	}

}
