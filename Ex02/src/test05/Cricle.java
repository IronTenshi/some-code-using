package test05;

public class Cricle extends Shape<Double>
{
	private double r;
	
	public Cricle(Double r)
	{
		this.r = r;
	}
	@Override
	public Double getArea()
	{
		return r*r*3.14;
	}
	@Override
	public Double getPerimeter()
	{
		return 2*3.14*r;
	}
	@Override
	public void printInfo()
	{
		System.out.println(getArea());
		System.out.println(getPerimeter());
	}
}
