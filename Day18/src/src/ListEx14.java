package src;

import java.util.ArrayList;

/* 2025 - 09 - 11
 * 개발자 : 최상철
 * 
 *  제네릭 타입 간의 레퍼런스 형변환은 제네릭 와일드 카드 문법을 사용하면 제한적으로 허용된다.
 * 
 */


public class ListEx14 {

	public static void main(String[] args) {
		
		
		ArrayList<String> cityList = new ArrayList<>();
		
		cityList.add("seoul");
		cityList.add("busan");
		cityList.add("daejeon");
		
		ArrayList<? extends Object> objlist;
		/* <? extends Object> 제네릭 타입간의 형변환 와일드 카드 문법 특징)
		 * Object를 상속한 자손은 제네릭 타입 간의 형변환을 제한적으로 허용한다.(상한 제한 와일드카드)		 
		 */
		
		objlist = cityList;
		
		for(Object obj:objlist) {
			System.out.println(obj);
		}
	}

}
