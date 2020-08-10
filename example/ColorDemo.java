import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class ColorDemo extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);

        /* Sets new drawing color using integers */
        g.setColor(new Color(255,0,0));
        g.fillRect(15,50,200,200);
        g.drawString("Current RGB : "+g.getColor(), 130, 40);
        setVisible(true);
        setSize(400, 400);
    }

    public static void main(String[] args) {
        new ColorDemo();
    }
}