package ex01;

import java.util.Scanner;

public class test01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("input the radius");
		double r = scanner.nextDouble();
		scanner.close();
		Caculatearea c1 = new Caculatearea();
		try
		{
			System.out.println(c1.Caculate(r));
		}catch (Judgement e) {
			System.out.println(e);
		}
	}
}
