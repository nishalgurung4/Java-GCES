import javax.swing.*;
class FrameAssociation
{
	FrameAssociation()
	{
		JFrame f = new JFrame("Hello");
		f.setVisible(true);
		f.setSize(400,400);

		//component
		JButton btn = new JButton("Click Me!");
		btn.setBounds(130,100,100, 40);
		f.add(btn);
		f.setLayout(null);
	}
	public static void main(String[] args)
	{
		new FrameAssociation();
		

	}
}