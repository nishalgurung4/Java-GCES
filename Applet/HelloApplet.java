import java.applet.Applet;
import java.awt.*;
public class HelloApplet extends Applet
{
	public void initialization()
	{
		System.out.println("Init");
	}

	public void start()
	{
		System.out.println("Start");
	}

	public void stop()
	{
		System.out.println("Stop");
	}

	public void destroy()
	{
		System.out.println("Destroy");
	}

	public void paint(Graphics g)
	{
		System.out.println("Paint");
	}
}
/*
<applet code="HelloApplet.class" width="400" height="500" alt="Hello Applet">
</applet>
*/