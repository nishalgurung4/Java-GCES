import java.applet.Applet;  
import java.awt.Graphics;  
public class Param extends Applet{  
  
	public void paint(Graphics g)
	{  
		String str=getParameter("msg"); 
		String s=getParameter("sus");
		g.drawString(str,50, 50);
	}  
  
}  
/*
<applet code="Param.class" width="300" height="300">  
<param name="msg" value="my nAME IS SUSHANT"> 
<param name="sus" value="Pokhara">
</applet>
 */