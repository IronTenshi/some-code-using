package test04;

public class Student extends Person
{
	@Override
	public void eat()
	{
		System.out.println("dining hall");
	}
	@Override
	public void sleep()
	{
		System.out.println("dorm");
	}
}
