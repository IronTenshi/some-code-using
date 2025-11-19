package hello;

import java.util.Scanner;

public class test05 {
	public static void main(String[] args) {
		int a;
		int b;
		int temp;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		
		temp = a;
		a = b;
		b = temp;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
