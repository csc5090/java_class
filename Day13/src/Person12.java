/* 1. 봉인된 sealed 클래스 Person을 상속한 자손클래스 Employee는 final이나 봉인이 해체된 비봉인 non-sealed로 선언하거나,
 * 또 다른 봉인된 sealed 키워드를 사용해서 봉인 클래스로 선언해야 한다.
 * 
 * 2. final 키워드로 선언된 Employee 자손클래스는 더이상 자손 클래스를 만들 수 없다.
 * non-sealed로 선언된 자손 클래스는 봉인이 해제 되었기 때문에 또 다른 자손 클래스를 생성할 수 있다.
 * 
 */


public final class Employee extends Person {
    @Override
    public void work() {
        System.out.println("직원은 회사에서 일한다.");
    }
}