package test05;

public class Rectangle extends Shape<Integer>
{
	private int width;
	private int length;
	
	public Rectangle(Integer length,Integer width)
	{
		this.length = length;
		this.width = width;
	}
	@Override
	public Integer getArea()
	{
		return length*width;
	}
	@Override
	public Integer getPerimeter()
	{
		return 2*(length + width);
	}
	@Override
	public void printInfo()
	{
		System.out.println(getArea());
		System.out.println(getPerimeter());
	}
}
