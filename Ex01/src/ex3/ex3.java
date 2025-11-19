package ex3;

import java.util.Scanner;

public class ex3 {
	public class A
	{
		private int v = 100;
		
		public void guess(int i)
		{
			if( i > v )
			{
				System.out.println("greater than");
			}
			if( i < v )
			{
				System.out.println("less than");
			}
			if( i == v )
			{
				System.out.println("equal to");
			}
		}
		public int getv()
		{
			return v;
		}
	}
	public static void main(String[] args) {
		System.out.println("guess the number");
		Scanner sc = new Scanner(System.in);
		
		int i;
		ex3 outerEx3 = new ex3();
		A a1 = outerEx3.new A();
		
		while(true)
		{
			i = sc.nextInt();
			a1.guess(i);
			if( i == a1.getv() )
				break;
		}
		
		sc.close();
	}

}
