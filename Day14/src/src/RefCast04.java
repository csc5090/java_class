package src;

/*
 * 레퍼런스 간의 형변환 중 다운 캐스팅을 할 때 사전에 업캐스팅을 해야 하는 데 이것을 하지 않고 명시적인 다운캐스팅을 해서 컴파일 된 바이트 코드 클래스 파일이 실행시 캐스팅 연산 예외 오류를 발생 시킨다.
 */
class Mother04{
    void m04() {
        System.out.println("부모클래스 m04() 메서드");
    }
}

class Son04 extends Mother04{

    void s04() {
        System.out.println("자손클래스 s04() 메서드");
    }
}

class Son05 extends Mother04{
	
}

public class RefCast04 {
    public static void main(String[] args) {

        Mother04 m04=new Mother04(); // 사전에 업캐스팅을 안함
        Son04 s04=(Son04)m04; // 사전에 업캐스팅을 안해서 캐스팅 연산 예외 오류가 난다.

        s04.m04();
        s04.s04();
        System.out.println("\n ==================== \n");
        
        Mother04 m=new Son04(); // Son04 객체 생성 및 업캐스팅.
        Son05 s=(Son05)m; //Son05 두번째 자손이 사전에 업캐스팅을 하지 않았기 때문에 캐스팅 연산 예외 오류가 난다.
        s.m04();
    }
}