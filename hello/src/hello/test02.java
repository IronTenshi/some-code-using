package hello;

import java.util.Scanner;


public class test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入A"); 
		double A = sc.nextDouble();
		System.out.println("请输入B"); 
		double B = sc.nextDouble();
		
		double x = (double)A/B;
		System.out.println("最后结果为  "+x);
		
		sc.close();
		 
		 
		
		
	}
}
