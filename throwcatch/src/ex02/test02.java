package ex02;

import java.util.Scanner;

public class test02 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("input the age");
	int age = scanner.nextInt();
	scanner.close();
	try {
		if(age<0 || age >200)
		{
			throw new Judgement();
		}
	} catch (Judgement e) {
		System.out.println(e);
	}
}
}
