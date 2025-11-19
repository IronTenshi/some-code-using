package ex03;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class test03 {
public static void main(String[] args) {
	Random random = new Random();
	int[] numbers = new int[10];
	for(int i = 0;i < 10;i++)
	{
		numbers[i] = random.nextInt(100) + 1;
	}
	List<Integer> list = new ArrayList<>();
	
	for(int num : numbers)
	{
		if(num >= 10)
		{
			list.add(num);
		}
	}
	for(int num : list)
	{
		System.out.println(num);
	}
}
}
