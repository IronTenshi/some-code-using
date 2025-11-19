package hello;

import java.util.Scanner;

public class test03 {
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input a int number");
		a = sc.nextInt();
		
		sc.close();
		System.out.println(String.format("sqrt  = %.2f",Math.sqrt((double)a)));
		System.out.println("平方  = "+ a*a);
		System.out.println("立方  = "+ a*a*a);
	}
}
