package src;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 *    java GUI 중의 하나인 awt로 프레임 원도우 창을 만든 다음 멀티쓰레드에 의해서 왼쪽에서 오른쪽으로 오랜지색 글자가 항상 지나가는 것을 만드는 스레드
 *    응용 예제이다.
 */


class Frame04 extends Frame implements Runnable{
   int x=0;
   
   public Frame04() {
      this.setBackground(new Color(0,0,0)); //this.은 생략가능함
      setSize(370,150);
      setVisible(true);
      
      addWindowListener(new WindowAdapter() {
         
         public void wondowClosing(WindowEvent e) {
            dispose();
            System.exit(0);
         }
      });//프레임 윈도우 이벤트 등록메서드 -> 익명클래스 즉 내부무명클래스(외부클래스명$번호.class->Frame04$1.class)
   }
   
   @Override
   public void run() {

      while(true) {
         try {
            Thread.sleep(100);
         }catch(InterruptedException ie) {}
         repaint();
         
         x+=5;
      }
   }
   
   @Override
   public void paint(Graphics g) {
      Dimension d;
      d = getSize();
      g.setColor(Color.orange);
      g.drawString("java", x, d.height/2);
      
      if(x > d.width) {
         x = 0;
      }
   }
}
public class ThreadEx04 {

   public static void main(String[] args) {

      Frame04 f = new Frame04();
      Thread th = new Thread(f);
      th.start();
   }

}
