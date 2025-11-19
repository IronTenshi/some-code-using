package abstractclasspractice2;

public class Rectangle extends Shape
{
	@Override
	public double calculateArea()
	{
		return length*width;
	}
	Rectangle(double length,double width)
	{
		this.length = length;
		this.width = width;
	}
	
	private double length;
	private double width;
}
