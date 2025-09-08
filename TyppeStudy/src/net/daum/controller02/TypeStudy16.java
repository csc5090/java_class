package net.daum.controller02;

import net.daum.controller01.ObjectEx16;

public class TypeStudy16 {

	public static void main(String[] args) {
		ObjectEx16 obj16 = new ObjectEx16(new int[] {100,100,100,100,100}); //오버로딩 된 생성자 호출
		obj16.setArr();
		System.out.printf("배열 원소 총합 = %d\n", obj16.getScore());
	}

}
