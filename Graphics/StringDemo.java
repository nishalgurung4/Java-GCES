import java.awt.*;
class StringDemo extends Frame
{
	StringDemo()
	{
		setVisible(true);
		setSize(500, 500);
	}

	public void paint(Graphics g)
	{
		g.drawString("Hello", 100, 100);
		// g.drawRect(110, 110, 200, 100);
		g.setColor(new Color(255, 0, 0));
		g.fillRect(110, 110, 200, 100);

		g.setColor(new Color(0, 255, 0));
		g.drawOval(100, 200, 50, 50);

		g.setColor(Color.RED);
		g.fillOval(100, 300, 50, 50);

		g.drawLine(100, 350, 200, 450);
	}

	public static void main(String[] args)
	{
		new StringDemo();
	}
	
}