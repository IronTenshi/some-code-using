package test01;

public class Ameircanpeople extends People
{
	@Override
	public void say()
	{
		System.out.println("american people say "+sayingString);
	}
	Ameircanpeople(String sayinString)
	{
		this.sayingString = sayinString;
	}
	
	private String sayingString;
}
