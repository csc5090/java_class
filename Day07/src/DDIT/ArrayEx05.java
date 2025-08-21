package DDIT;

public class ArrayEx05 {

	public static void main(String[] args) {
		
		int[] score = new int[5]; //배열 크기가 5인 일차원 배열 score 생성
	      int k = 1;
	      
	      score[0] = 100;
	      score[1] = 90;
	      score[k+1] = 95;
	      score[3] = 99;
	      score[4] = 100;
	      
	      int tmp = score[k+2]+score[4];
	      System.out.printf("tmp = %d \n", tmp);
	      
	      
	      //일반 for 반복문으로 score 일차원 배열 원소값 일괄적 출력
	      
	      for(int i = 0; i < score.length; i++) {
	         System.out.printf("score[%d] : %d \n", i,score[i]);
	      }
	      
	      System.out.printf("score[%d] : %d \n", 7, score[7]); //배열 주소 인덱스 번호 범위를 벗어나서 예외 오류가 발생

	}

}
