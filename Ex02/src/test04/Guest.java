package test04;

public class Guest extends Person
{
	@Override
	public void eat()
	{
		System.out.println("guest dining hall");
	}
	@Override
	public void sleep()
	{
		System.out.println("guest dorm");
	}
}
