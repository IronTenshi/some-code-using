package Student01;

import java.util.Scanner;

public class studentsystem {
	private int N;
	private student[] stu = new student[100];
	private double score[];
	private double avg = 0;
	
	Scanner sc = new Scanner(System.in);
	
	public void getN(int N)
	{
		this.N = N;
	}
	public void studentcollect()
	{
		for(int i = 0 ;i < N ; i++)
		{
			stu[i] = new student();//初始化
			System.out.println("name");
			stu[i].getname(sc.next());
			System.out.println("number");
			stu[i].getnumber(sc.nextDouble());
			System.out.println("score");
			score = new double[5];
			for(int t = 0 ; t < 5 ; t++)
			{
				score[t] = sc.nextDouble();
			}
			stu[i].getscore(score);
			stu[i].addscore();
		}
	}
	public void removescanner()
	{
		sc.close();
	}
	public void calculationavg()
	{
		for(int i = 0 ;i < N ; i++)
		{
			avg += stu[i].gettotalscore();
		}
		avg = avg/(double)N;
		System.out.println("avg = "+ avg);
	}
	public void judgement()
	{
		for(int i = 0 ;i < N ; i++)
		{
			if(stu[i].gettotalscore() >= avg*1.2)
			{
				//1等奖
				System.out.println("获得一等奖");
				stu[i].print();
			}
			else if(stu[i].gettotalscore() >= avg*1.1)
			{
				//2等奖
				System.out.println("获得二等奖");
				stu[i].print();
			}
		}
	}
}
