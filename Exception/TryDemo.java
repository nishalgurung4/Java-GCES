class TryDemo
{
	public static void main(String[] args)
	{
		int a = 5;
		System.out.println("Start");
		try {
			System.out.println(a/0);
		} catch(Exception e)
		{
			System.out.println("Inside Catch");
		} catch(ArithmeticException e)
		{
			System.out.println("-----");
		}

		System.out.println("After");
		System.out.println("End");

	}
}