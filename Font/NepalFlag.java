import java.awt.*;
import java.applet.Applet;
public class NepalFlag extends Applet
{
	int x[] = {10, 80, 30, 80, 10};
	int y[] = {10, 60, 60, 120, 120};

	public void paint(Graphics g) {
		//draw the body with red
		g.setColor(Color.RED);
		g.fillPolygon(x, y, 5);
		//draw the border
		g.setColor(Color.BLUE);
		g.drawPolygon(x, y, 5);
		g.setColor(Color.WHITE);
		//draw the sun
		g.fillOval(20, 85, 20, 20);
		//draw the moon
		g.drawArc(20, 30,20,20,0,-180);
		//draw the pole
		g.setColor(Color.GREEN);
		g.drawLine(10,120,10,160);

	}


}
/*
<applet code="NepalFlag.class" width="500" height="500">
</applet>
 */