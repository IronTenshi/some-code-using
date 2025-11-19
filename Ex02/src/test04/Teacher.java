package test04;

public class Teacher extends Person
{
	@Override
	public void eat()
	{
		System.out.println("teachers dining hall");
	}
	@Override
	public void sleep()
	{
		System.out.println("teacher dorm");
	}
}
