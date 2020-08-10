class ParentClass
{
	String name;
	public ParentClass ()
	{
		System.out.println("C from Parent");
	}
	 public void test()
	 {
	 	System.out.println("hello from parent");
	 }
}

class ChildClass extends ParentClass
{
	public ChildClass()
	{
		super();
	}
	public void test()
	{
		System.out.println("Hello from child");
	}

}

class Demo
{
	public static void main(String[] args)
	{
		ChildClass c = new ChildClass();
		c.name = "Anil";
		c.test();
		System.out.println(c.name);
	}
}