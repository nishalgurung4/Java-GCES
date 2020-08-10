import java.awt.*;  
public class CheckboxExample  
{  
     CheckboxExample(){  
       Frame f= new Frame("Checkbox Example"); 
       CheckboxGroup lang = new CheckboxGroup(); 
        Checkbox checkbox1 = new Checkbox("C++", lang, false);  
        checkbox1.setBounds(100,100, 100,100);  
        Checkbox checkbox2 = new Checkbox("Java", lang, true);  
        checkbox2.setBounds(200,200, 100,100);  
        f.add(checkbox1);  
        f.add(checkbox2);  
        f.setSize(500,500);  
        f.setLayout(null);  
        f.setVisible(true);  
     }  
public static void main(String args[])  
{  
    new CheckboxExample();  
}  
}  