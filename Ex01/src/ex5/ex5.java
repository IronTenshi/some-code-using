package ex5;

import java.util.Scanner;

public class ex5 {
	public class Person
	{
		private String name;
		private int age;
		
		public void setname(String name)
		{
			this.name = name;
		}
		public void setage(int age)
		{
			this.age = age;
		}
		public void printprofile()
		{
			System.out.println("name is  "+ name);
			System.out.println("age is  "+ age);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ex5 outerEx5 = new ex5();
		Person p1 = outerEx5.new Person();
		String name;
		int age;
		
		System.out.println("name is ");
		name = sc.next();
		p1.setname(name);
		System.out.println("age is ");
		age = sc.nextInt();
		p1.setage(age);
		
		sc.close();
		p1.printprofile();
	}
}
