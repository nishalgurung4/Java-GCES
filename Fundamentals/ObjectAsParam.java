class ObjectAsParam
{
	public String name;
	public boolean isComplete;

	
	//parameterized constructor
	public ObjectAsParam(String name, boolean isComplete)
	{
		this.name = name;
		this.isComplete = isComplete;
	}
	//default constructor
	public ObjectAsParam()
	{
		name = "New Task";
		isComplete = false;
	}

	//Parameterized constructor with object
	// as parameter (can also called copy constructor)
	public ObjectAsParam(ObjectAsParam obj)
	{
		this.name = obj.name;
		this.isComplete = obj.isComplete;

	}

	public static void main(String[] args)
	{
		ObjectAsParam task1 = new ObjectAsParam("Go to the market", true);
		ObjectAsParam task2 = new ObjectAsParam(task1);
		System.out.println("Task1 Name:"+task1.name);
		System.out.println("Task2 Name:"+task2.name);

		ObjectAsParam task3 = new ObjectAsParam();


	}
}