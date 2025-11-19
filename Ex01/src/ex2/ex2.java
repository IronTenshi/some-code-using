package ex2;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		book book1 = new book();
		//add the book
		Scanner sc = new Scanner(System.in);
		String bookname;
		double booknumber;
		System.out.println("add the bookname");
		bookname = sc.next();
		System.out.println("add the booknumber");
		booknumber  = sc.nextDouble();
		book1.getbookname(bookname);
		book1.getbooknumber(booknumber);
		
		//add student
		student s1 = new student();
		double number;
		String name;
		System.out.println("add the name");
		name = sc.next();
		System.out.println("add the number");
		number = sc.nextDouble();
		s1.name(name);
		s1.number(number);
		
		System.out.println("student lend the book? 1 or 0");
		int t;
		t = sc.nextInt();
		if(t == 1)
		{
			book1.lend(name);
		}
		System.out.println("student return the book? 1 or 0");
		int i;
		i = sc.nextInt();
		if(i == 1)
		{
			book1.return01();
		}
		
		book1.outprint();
		s1.outprint();
		
		sc.close();
	}
}
