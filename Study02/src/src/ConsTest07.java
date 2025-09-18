package src;

import java.util.ArrayList;
import java.util.List;

//컬렉션 List 인터페이스를 구현 상속한 컬렉션 클래스 ArrayList에 제네릭을 설정해서 사용하기.

class List07 {
	
	List<String> cityList=new ArrayList<>(); //문자열만 저장 가능한 컬렉션 제네릭 객체 cityList생성
	
	public List07() {
		cityList.add("서울시");
		cityList.add("부산시");
		cityList.add("청주시");
	}
	
	public void printList(){
		System.out.print("도시 이름 : [");
	for(String cityName:cityList) {
		System.out.println(" "+cityName);
	}
	System.out.println("]");
	}
}


public class ConsTest07 {
	public static void main(String[] args) {
		
		List07 list = new List07();
		list.printList();
	}
}