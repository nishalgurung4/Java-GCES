abstract class Shape
{
	// abstract public void draw();
	// abstract public void paint();

	public void init()
	{
		
	}

	
}

abstract class Circle extends Shape
{
	public void draw()
	{
		System.out.println("Drawing Circle");
	}
}

class Square extends Shape
{
	public void draw()
	{
		System.out.println("Drawing Square");
	}

	public void paint()
	{

	}
}

class ShapeDemo
{
	public static void main(String[] args)
	{
		// Square sq = new Square();
		// sq.draw();
		// 

	}
}