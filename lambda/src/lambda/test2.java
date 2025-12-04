package lambda;

import java.util.ArrayList;
import java.util.List;

public class test2 {
	static List<Integer> lists = new ArrayList<Integer>();
	static
	{
		lists.add(32);
		lists.add(23);
		lists.add(233);
		lists.add(26);
	}
	public static void main(String[] args) {
		lists.sort((o1,o2)->o1-o2);
		System.out.println(lists.toString());	
	}
}
