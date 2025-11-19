package ex04;

import java.util.ArrayList;

public class test04 {
	public static int listTest(ArrayList<Integer> al, Integer s)
	{
		for(int i = 0 ; i < al.size() ; i++)
		{
			if(s.equals(al.get(i)) )
				return i;
		}
		return -1;//not valid;
	}
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(9);
		list.add(123);
		list.add(3);
		
		
		int index = listTest(list, 3);
		System.out.println("3s index  = " +index);
	}
}
