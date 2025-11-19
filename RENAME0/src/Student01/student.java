package Student01;

public class student {
	private String name;
	private double number;
	private double[] score = new double[5];
	private double totalscore = 0;
	
	public void getname(String name)
	{
		this.name = name;
	}
	public void getnumber(double number)
	{
		this.number = number;
	}
	public void getscore(double score[])
	{
		for(int i = 0 ; i < 5 ; i++)
		{
			this.score[i] = score[i];
		}
	} 
	public void addscore()
	{
		for(int i = 0 ; i < 5 ; i++)
		{
			totalscore = score[i] + totalscore;
		}
	}
	public void print()
	{
		System.out.println("name is "+name);
		System.out.println("number is "+number);
		for(int i = 0;i < 5; i++)
		{
			System.out.print(score[i]+"  ");
		}
		System.out.print("the totalscore is " +totalscore);
	}
	public double gettotalscore()
	{
		return totalscore;
	}
}
