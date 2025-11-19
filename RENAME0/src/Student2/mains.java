package Student2;

import java.util.Scanner;

public class mains {
	public static void main(String[] args) {
		int size = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("输入学生个数");
		size = sc.nextInt();
		
		String[] name = new String[size];
		double[] number = new double[size];
		double[][] score = new double[size][5];
		double[] totalscore = new double[size];
		double avg = 0;
		
		for(int i = 0;i < size ; i++)
		{
			System.out.println("name");
			name[i] = sc.next();
			
			System.out.println("number");
			number[i] = sc.nextDouble();
			
			System.out.println("score");
			totalscore[i] = 0;
			for(int t = 0 ; t < 5; t++)
			{
				score[i][t] = sc.nextDouble();
				totalscore[i] += score[i][t];
			}
		}
		for(int i = 0 ;i < size;i++ )
		{
			avg += totalscore[i];
		}
		avg = avg/(double)size;
		for(int i = 0 ;i < size;i++)
		{
			if(totalscore[i] > avg*1.2)
			{
				System.out.println("获得一等奖");
				System.out.println("name  ="+name[i]);
				System.out.println("number  ="+number[i]);
				System.out.println("totalscore  ="+totalscore[i]);
			}
			else if(totalscore[i] > avg*1.1)
			{
				System.out.println("获得二等奖");
				System.out.println("name  ="+name[i]);
				System.out.println("number  ="+number[i]);
				System.out.println("totalscore  ="+totalscore[i]);
			}
		}
		sc.close();
	}

}
