/* 2025 - 09 - 02
 * 개발자 : 최상철
 * 
 * 봉인된 클래스(Sealed Class) 예시
 *  - Person 클래스는 sealed로 선언.
 *  - permits 뒤에 올 수 있는 자식 클래스를 지정해야 함.
 *  - 자식 클래스(Employee)는 반드시 final / sealed / non-sealed 중 하나를 붙여야 함.
 */

public sealed class Person permits Employee {
    // 공통 메서드 정의 가능
    public void work() {
        System.out.println("사람은 일을 한다.");
    }
}

