package 람다식과스트림;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

//숫자 범위로부터 스트림을 얻어서 1부터 100까지 누적합 구하기.

public class FromIntRangeExample {
	
	static int sum;
	
	public static void main(String[] args) {
		
		
		IntStream stream = IntStream.rangeClosed(1, 100); //1부터 100까지 순차적으로 제공하는 자연수.
		stream.forEach(number -> sum += number);
		System.out.println("누적합 : "+sum);
		
		sum = 0;
		
		List<Integer> numList = new ArrayList<>();
						
		/* 야간 복습 보강 문제
		 * 일반 for 반복문을 사용해서 1부터 10사이의 임의의 정수 숫자 난수를 발생한다음 이것을 numlist 컬렉션에 저장하고
		 * 출력하는 자바 코드 만들기. (반복 횟수 : 10)
		 *
		 */
		
		for(int i=0; i<10; i++) {
			numList.add((int)(Math.random()*10)+1);
			System.out.println(" "+numList.get(i));
		}
		System.out.println();//개행
		
		/* 야간 복습 보강 문제2
		 * 향상된 확장 for반복문을 사용해서 컬렉션 numList원소값의 누적합을 구한 다음 출력해본다.
		 */
		
		sum = 0;
		for(int a : numList) {
			sum += a;
		}
		System.out.println(sum);
		
		
		
		
	}

}
