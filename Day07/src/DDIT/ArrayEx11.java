package DDIT;

import java.util.Arrays;

public class ArrayEx11 {

	public static void main(String[] args) {
		
		int[] score = {-4,-1,3,5,11};
		int[] arr = new int[10];
		
		for(int i=0; i < arr.length; i++) {
			int tmp = (int)(Math.random() * score.length); // random() 메서드는 0.0이상 1.0미만 사이의 실수 숫자 난수 발생 ->
														   // score.length는 배열크기 5 반환, * 5 하면 0.0이상 5.0미만 사이의 실수 숫자 난수 ->(int)형변환. 즉 0이상 5미만 정수가 됨.
														   // 0부터 4사이 임의의 정수 숫자 난수가 발생하게 됨.
			
			
			arr[i] = score[tmp];
		} // for end
		
		
		// 내장 api로 배열원소값 출력
		
		System.out.println(Arrays.toString(arr)); // arr 배열 원소값을 문자열로 변환
		
		// 일반 for반복문으로 arr배열원소값 출력
		for(int i=0; i < arr.length; i++) {
			System.out.println("arr["+i+"] : "+arr[i]);
			
		}//for
		
		System.out.println("\n ========= \n");
		
		//향상된 확장 for 반복문으로 출력
		
		for(int b:arr) {
			System.out.print(" " + b);
		}
		
		
		

	}

}
