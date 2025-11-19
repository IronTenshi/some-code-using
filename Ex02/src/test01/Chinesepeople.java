package test01;

public class Chinesepeople extends People
{
	@Override
	public void say() 
	{
		System.out.println("chinese people say "+sayingString);
	};
	
	Chinesepeople(String sayinString)
	{
		this.sayingString = sayinString;
	}
	
	private String sayingString;
}
