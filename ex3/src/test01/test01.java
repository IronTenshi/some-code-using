package test01;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//PT0.1440721S
//PT0.0514104S

public class test01 {
	public static void main(String[] args) {
		List<Integer> linkedList = new LinkedList<Integer>();
		List<Integer> arrayList = new ArrayList<Integer>();
		for(int i = 0; i < 10000000;++i)
		{
			linkedList.add(1);
			arrayList.add(1);
		}
		linkedList.add(2);
		arrayList.add(2);
		linkedList.add(1);
		arrayList.add(1);
		
		Instant starttime0 = Instant.now();
		for(int num: linkedList)
		{
			if(num == 2)
			{
				break;
			}
		}
		Instant endtime0 = Instant.now();
		Duration duration0 = Duration.between(starttime0, endtime0);
		System.out.println(duration0);
		
		Instant starttime1 = Instant.now();
		for(int num :arrayList)
		{
			if(num == 2)
			{
				break;
			}
		}
		Instant endtime1 = Instant.now();
		Duration duration1 = Duration.between(starttime1, endtime1);
		System.out.println(duration1);
	}
}
