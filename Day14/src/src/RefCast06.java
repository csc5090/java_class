/*
 * 
 * 
 * 
 */


package src;

class Mother06{
	   public void m06() {
	      System.out.println("부모클래스 메서드 m06()");
	   }
	}
	class Son06 extends Mother06{
	   public void s06() {
	      System.out.println("자손클래스 메서드 s06()");
	   }

	   @Override
	   public void m06() {
	      // TODO Auto-generated method stub
	      System.out.println("오버라이딩 한 메서드 m06()");
	   }
	   
	}

	public class RefCast06 {

	   public static void main(String[] args) {
	      Mother06 m = new Son06();
	      m.m06(); //업캐스팅 이후 오버라이딩 한메서드를 호출한다
	      /*
	       * 메서드가 오버라이딩이 된 경우 참조변수 m이 실제 가리키는 객체타입이 누구인지에 따라서 호출되는 메서드가 결정된다.
	       * 여기서 자손인 Son06을 가리키고 있어서 자손에서 오버라이딩 한 메서드를 호출한다.
	       */
	   }

	}
