package ex1;

import java.util.Scanner;

public class ex1 {
	public class number
	{
		private double x;
		private double y;
		
		public void outnumeber()
		{
			System.out.println(x+" + "+ y +"i");
		}
		public void innumber(double x , double y)
		{
			this.x = x;
			this.y = y;
		}
	}
	public void add(number num1, number num2)
	{
		number additem = new number();
		additem.x = num1.x + num2.x;
		additem.y = num1.y + num2.y;
		additem.outnumeber();
		
	}
	public void subtraction(number num1, number num2)
	{
		number additem = new number();
		additem.x = num1.x - num2.x;
		additem.y = num1.y - num2.y;
		additem.outnumeber();
		
	}
	public static void main(String[] args) {
		ex1 ex1 = new ex1();
		number num1 = ex1.new number();
		number num2 = ex1.new number();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please input two number (x + y*i)");
		double r1,r2;
		r1 = sc.nextDouble();
		r2 = sc.nextDouble();
		num1.innumber(r1, r2);
		r1 = sc.nextDouble();
		r2 = sc.nextDouble();
		num2.innumber(r1, r2);
		sc.close();
		
		ex1.add(num1, num2);
		ex1.subtraction(num1, num2);
	}
}
