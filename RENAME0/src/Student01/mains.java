package Student01;

import java.util.Scanner;

public class mains {
	public static void main(String[] args) {
		int N;
		studentsystem studentsystem = new studentsystem();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("输入学生个数");
		N = sc.nextInt();
		studentsystem.getN(N);
		
		studentsystem.studentcollect();
		studentsystem.removescanner();
		studentsystem.calculationavg();
		studentsystem.judgement();
		sc.close();
	}

}
