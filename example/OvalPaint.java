import java.awt.*;
import javax.swing.*;

public class OvalPaint extends JPanel {

  public void paintComponent(Graphics g) {
    g.setColor(Color.orange);
    g.fillRect(0, 0, getWidth(), getHeight());
    g.setColor(Color.red);
    g.fillOval(getWidth()/4, getHeight()/4, 
		getWidth()/2, getHeight()/2);
  }

  public static void main(String args[]) {
    JFrame frame = new JFrame("OvalPaint");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    OvalPaint panel = new OvalPaint();
    
    frame.add(panel);

    frame.setSize(300, 200);
    frame.setVisible(true);
  }
}