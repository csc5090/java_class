package 람다식과스트림;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/* 스트림과 람다식을 활용해서 컬렉션 원소값을 쉽게 읽어오는 예제 */

public class LamdaStreamExample {

	public static void main(String[] args) {
		
		List<Student> studentList = Arrays.asList(new Student("홍길동",100), new Student("신사임당",99));
		
		
		Stream<Student> stream = studentList.stream(); // 스트림생성
		
		
		stream.forEach(s->{
			String name = s.getName();//학생명
			int score = s.getScore(); //점수
			System.out.println("학생명 : "+name+",점수 = "+score);
			
			
		});
		
	}

}
