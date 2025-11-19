package hello;

import java.util.Scanner;

public class test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =  sc.nextInt();
		sc.close();
		
		double t = 0;
		for(int i = 10 ;; ) 
		{
			int s = a % i;
			a = a / i;
			System.out.println(s);
			t = t + s; 
			if(a < 10)
			{
				System.out.println(a);
				break;
			}
		}
		System.out.println("result is "+ t);
	}

}
