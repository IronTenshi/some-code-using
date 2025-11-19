package ex01;

public class Caculatearea {
	public double Caculate(double r) throws Judgement
	{
		if(r <= 0)
		{
			throw new Judgement();
		}
		return r*r*3.14;
	}
}
