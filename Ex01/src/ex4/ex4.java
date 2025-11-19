package ex4;

public class ex4 {
	public class java
	{
		private int n1 = 1;
		private int n2 = 2;

		public int add()
		{
			return n1 + n2;
		}
		public int substraction()
		{
			return n1 - n2;
		}
		public int multiplication()
		{
			return n1 * n2;
		}
		public double division()
		{
			return (double)n1 / n2;
		}
	}
	public static void main(String[] args) {
		ex4 outerEx4 = new ex4();
		java number = outerEx4.new java();
		System.out.println(number.add());
		System.out.println(number.substraction());
		System.out.println(number.multiplication());
		System.out.println(number.division());
	}

}
