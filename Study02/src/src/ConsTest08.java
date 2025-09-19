package src;

import java.util.ArrayList;
import java.util.List;

class List08{
	
	int sum = 0;
	
	List08(List<Integer> li){
		for(int i=0; i<li.size();i++) {
			sum += li.get(i);
		}
	}//생성자 오버로딩  
	
	void printList(List<Integer> li) {
		for(int k:li) {
			System.out.println(" "+k);
		}
		System.out.println("\n ==================== \n");
		System.out.printf("컬렉션원소 총합=%d\n", sum);
		double average=sum/(double)li.size();
		System.out.println("평균="+average);
	}	
}


public class ConsTest08 {

	public static void main(String[] args) {
		
		List<Integer> li02=new ArrayList<>();//정수 숫자만 저장 가능한 컬렉션 제네릭 li02를 생성
		
		for(int k=0; k<7; k++) {
			li02.add(k+1); //1부터 7까지 컬렉션 원소값 저장
		}
		
		List08 li08 = new List08(li02); //전달인자 1개짜리 오버로딩 된 생성자 호출
		li08.printList(li02);

	}

}
