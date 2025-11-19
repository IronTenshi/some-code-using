package abstractclasspractice2;

public class Circle extends Shape
{
	@Override
	public double calculateArea()
	{
		return radius*3.14;
	}
	Circle(double radius)
	{
		this.radius = radius;
	}
	
	private double radius;
}
