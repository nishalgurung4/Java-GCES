import java.awt.*;
class FrameInheritance extends Frame
{
	FrameInheritance()
	{
		super("Hello World");
		setVisible(true);
		setSize(400, 400);
		//component
		Button btn = new Button("Click Me!");
		btn.setBounds(130,100,100, 40);
		add(btn);
		setLayout(null);
	}

	public static void main(String[] args)
	{
		
		new FrameInheritance();

	}

}