package src;

/* 2025 - 09 - 22
 * 개발자 : 최상철
 * 
 * 객체 직렬화 장점)
 * 1. 복잡한 객체를 한 번에 처리 가능.
 * 2. 객체 전체를 파일 또는 네트워크로 쉽게 전송하거나 저장할 수 있음.
 * 3. 코드가 간결해지고, 버그 발생 가능성이 줄어듬.
 * 4. 일관성 있고 편리한 데이터 전송 방식 제공
 * 
 * 객체 직렬화를 통해서 데이터를 전송한다고 해서 항상 전송 속도가 빠른 것은 아님.
 * 
 * 객체 직렬화를 사용할 때.
 * 1. 복잡한 구조 객체를 다룰 때.
 * 2. 객체를 일일히 분해하지 않고 자동으로 처리할 때.
 * 3. 개발 시간을 줄이고, 안정적인 전송이 필요할 때.
 * 
 * 
 * 
 */


import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Customer implements Externalizable { //객체 직렬화를 위한 클래스 설계
	
	int id;
	String name;
	int age;
	double height;
	
	public Customer() {} //전달인자가 없는 기본 생성자
	
	public Customer( int id, String name, int age, double height ) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.height = height;
		
	} //생성자 오버로딩

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(id); // 기본타입이 레퍼 참조타입으로 자동 형변환(자바 5버전에서 추가된 오토박싱)하고 부모타입으로 업캐스팅해서 저장
		out.writeObject(name); // 업캐스팅 하면서 저장
		out.writeObject(age); // 오토박싱 + 업캐스팅 
		out.writeObject(height); //오토박싱 + 업캐스팅
		
	}//객체 단위로 쓰기

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		
		id = (Integer)in.readObject(); //명시적인 다운캐스팅 + 오토언박싱(자바 5버전에서 추가된 것으로 래퍼참조타입이 기본타입으로 형변환 하는 것을 말함..
		name = (String)in.readObject();
		age = (Integer)in.readObject();
		height = (Double)in.readObject();
	}//객체 단위로 읽기
	
	@Override
	public String toString() {
		return "id="+id+", name= "+name+", age= "+age+", height="+height;
	}

}
