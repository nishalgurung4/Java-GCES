class TaskParameterConstructor
{
	public String name;
	public boolean isComplete;
	//parameterized constructor
	public TaskParameterConstructor(String name, boolean isComplete)
	{
		this.name = name;
		this.isComplete = isComplete;

	}

	public static void main(String[] args)
	{
		TaskParameterConstructor task1 = new TaskParameterConstructor("Study java", false);
		System.out.println("task1 name="+task1.name);
	}
}