package 중첩클래스와중첩인터페이스;

import 중첩클래스와중첩인터페이스.Button.OnClickListener;

/* 부모 중첩 인터페이스 OnClickListener를 구현 상속한 자손 클래스 CallListener 
 * 
 * 
 */

public class MessageListener implements OnClickListener {

	@Override
	public void onClick() {
		System.out.println("메세지를 보냅니다.");

	}

}
