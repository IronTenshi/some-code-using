package lambda;

import java.util.List;
import java.util.ArrayList;
//import java.util.Comparator;

public class test3 {
	static List<Integer> lists = new ArrayList<>();
	static {
		lists.add(12);
		lists.add(32);
		lists.add(54);
		lists.add(13);
	}
	public static void main(String[] args) {
//		lists.sort(new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				// TODO Auto-generated method stub
//				return o1 - o2;
//			}
//		});
		lists.sort((o1, o2)->o1-o2);
		for (int list : lists)
		{
			System.out.println(list);
		}
	}
}
