// import java.awt.Frame;
import javax.swing.*;
import java.awt.Graphics;
public class FramePaint extends JFrame {
   FramePaint()
   {
      super("Drawing Graphics in a Frame Directly");
      setBounds(100,50,500,300);
      setVisible(true);
   }
   public static void main(String[] a) {
      new FramePaint();     
   }
   public void paintComponent(Graphics g) {
         g.drawRect(20,10,100,60);
      }
   
}