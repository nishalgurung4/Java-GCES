import java.awt.*;
class BorderLayoutDemo
{
	BorderLayoutDemo()
	{
		Frame f = new Frame("Frame1");
		f.setVisible(true);
		f.setSize(500, 500);
		f.setLayout(new BorderLayout(10,20));//

		//button
		Button n = new Button("North");
		Button e = new Button("East");
		Button s = new Button("South");
		Button c = new Button("Center");
		Button w = new Button("West");

		f.add(n, BorderLayout.NORTH);
		f.add(e, BorderLayout.EAST);
		f.add(s, BorderLayout.SOUTH);
		f.add(c, BorderLayout.CENTER);
		f.add(w, BorderLayout.WEST);
	}

	public static void main(String[] args)
	{
		new BorderLayoutDemo();
	}

}