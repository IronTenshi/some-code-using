package ex2;

public class student {
	private String name;
	private double number;

	public void name(String name)
	{
		this.name = name;
	}
	public void number(double number)
	{
		this.number = number;
	}
	public void outprint()
	{
		System.out.println("name is "+ name );
		System.out.println("number is "+ number);
	}
}
