//interface
interface Mailable
{
	static int a = 5;
	public  void send();
}

interface Logable
{
	public void log();
}

class ParentClass
{
	public void add()
	{

	}

}

class ChildClass extends ParentClass implements Mailable, Logable
{
	public  void send()
	{
		System.out.println(a);

	}
	public void log()
	{

	}

}

class InterfaceDemo
{
	public static void main(String[] args)
	{
		ChildClass obj = new ChildClass();
		obj.send();
		System.out.println(ChildClass.a);
	}
}

// Default method in interface
//  Inheritance in Interface
//  Nested Interface