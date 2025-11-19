package hello;

import java.util.Scanner;

public class hellowrokd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please input a double number(F)");
		double x = sc.nextDouble();
		
		double t = 9.0/5 *x +32;
		System.out.println("转换为摄氏度为  " +t);
		
		System.out.println("please input a double number too(C)");
		double y =sc.nextDouble();
		
		double n = 5.0/9 *(y-32);
		System.out.println("转换为华氏度为  "+n);
		
		sc.close();
		
}
}
