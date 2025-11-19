package hello;

import java.util.Scanner;

public class test07 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	sc.close();
	if(a % 4 ==0 )
	{
		if(a % 100!=0 || a % 400==0)
			System.out.println("leap year");
		else
			System.out.println("no leap year");
	}
	
	else System.out.println("no leap year");
	
}
}
