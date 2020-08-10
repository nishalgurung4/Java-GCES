import packaget.Task;
class PackageDemo
{
	public static void main(String[] args)
	{
		Task t = new Task();
		t.markAsComplete();
		System.out.println(t.isComplete);
	}
}