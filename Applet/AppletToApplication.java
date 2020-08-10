public class AppletToApplication
{
	AppletToApplication()
	{
		int a = 5;
	}
	public void paint()
	{
		System.out.println("Paint");
	}

	public static void main(String[] args)
	{
		AppletToApplication a = new AppletToApplication();
		a.paint();
	}
}
