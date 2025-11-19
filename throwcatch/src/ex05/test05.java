package ex05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class test05 {
	public static void main(String[] args) {
		String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
		List<String> list = new ArrayList<String>();
		
		for(String i : strs)
		{
			list.add(i);
		}
		
		Set<String> hash = new HashSet<String>(list);//remove the repeat qq numbers;
		List<String> reqqlist = new ArrayList<String>(hash); 
		
		for(String tString : reqqlist)
		{
			System.out.println(tString);
		}
		
		//迭代器
		Iterator<String> iterator = reqqlist.iterator();// is interface;
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
}
