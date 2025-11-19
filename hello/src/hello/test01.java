package hello;

public class test01 
{
	public class test
	{
		int a ;
		
		public void t() 
		{
			System.out.println(a);
		}
	}
	public static void main(String[] args) 
	{
		test01 outer = new test01();
		test d = outer.new test();
		d.t();
	}
}
