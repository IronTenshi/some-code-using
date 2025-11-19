package Studet;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String nameString;
	private ArrayList<Integer> scoreList = new ArrayList<Integer>();
	
	public Student(String nameStringe,ArrayList<Integer> list)
	{
		this.nameString = nameStringe;
		this.scoreList = list;
	}
	
	public int Totalscore()
	{
		int totalscore = 0;
		for(int score : scoreList)
		{
			totalscore += score;
		}
		return totalscore;
	}
	
	public void Display()
	{
		System.out.print(nameString + "   ");
		for(int score : scoreList)
		{
			System.out.print(score + "   "); 
		}
		System.out.println();
	}
}
