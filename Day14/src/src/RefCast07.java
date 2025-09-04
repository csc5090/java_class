




package src;

class FireEngine07 extends Car07{

}

public class RefCast07 {
    public static void main(String[] args) {

        FireEngine07 fe = new FireEngine07();

        if(fe instanceof Car07) { // fe가 부모 Car07 타입으로 업캐스팅이 가능한가? true(참)
            System.out.println("업캐스팅이 가능합니다.");
        }

        if(fe instanceof Object) { // fe가 자바 최상위 부모클래스 Object타입으로 업캐스팅이 가능한가? true(참)
            System.out.println("업캐스팅이 가능합니다.");
        }

        Object obj = new FireEngine07(); // 사전에 업캐스팅 함

        if(obj instanceof FireEngine07) { // obj가 다운캐스팅이 가능한가? true(참) -> 사전에 업캐스팅을 했기 때문에 다운캐스팅 가능함
            System.out.println("명시적인 다운캐스팅 가능함");
            FireEngine07 fe2 = (FireEngine07)obj; // 명시적인 캐스팅 연산자를 사용한 다운캐스팅 됨
        } else {
            System.out.println("다운캐스팅 불가능합니다.");
        }
    }
}