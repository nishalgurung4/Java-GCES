import java.awt.*;  
import java.awt.event.*;  
class OuterDemo extends Frame{  
	TextField tf;  
	OuterDemo(){  
		//create components  
		tf=new TextField();  
		tf.setBounds(60,50,170,20);  
		Button b=new Button("click me");  
		b.setBounds(100,120,80,30);  
		//register listener  
		Outer outer = new Outer(this);
		b.addActionListener(outer);//passing current instance  
		//add components and set size, layout and visibility  
		add(b);add(tf);  
		setSize(300,300);  
		setLayout(null);  
		setVisible(true);  
	}  

	public static void main(String args[]){  
		new OuterDemo();  
	}  
}  

class Outer implements ActionListener
{
	OuterDemo obj;
	Outer(OuterDemo obj)
	{
		this.obj = obj;
	}
	public void actionPerformed(ActionEvent e){  
		obj.tf.setText("Welcome");  
	}  
}