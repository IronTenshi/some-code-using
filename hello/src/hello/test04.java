package hello;

import java.util.Random;
import java.util.Scanner;

public class test04 {
public static void main(String[] args) {
	double x ;
	double y ;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("please input two double numbers");
	x = sc.nextDouble();
	y = sc.nextDouble();
	sc.close();
	
	System.out.println("the * result is  "+ x*y);
	double q = x+y;
	System.out.println("the + result is  "+ q);
	double t = x-y;
	System.out.println("the - result is  "+ t);
	System.out.println("the / result is  "+ x/y);
	
	Random r1 = new Random(); 
	Random r2 = new Random();
	
	int max = 200;
	int min = 100;
	
	int num1 = r1.nextInt(max - min + 1) + min;
	int num2 = r2.nextInt(max - min + 1) + min;

	System.out.println("the * result is  "+ num1*num2);
	double l = num1 + num2;
	System.out.println("the + result is  "+ l);
	double s = num1 - num2;
	System.out.println("the - result is  "+ s );
	System.out.println("the / result is  "+ (double)num1/num2);
	
}
}
