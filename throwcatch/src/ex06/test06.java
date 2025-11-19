package ex06;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class test06 {
public static void main(String[] args) {
	List<Integer> listarray = new ArrayList<Integer>();
	List<Integer> linkedlist = new LinkedList<Integer>();
	
	Instant starttime1 = Instant.now();
	for(int i = 0 ; i < 10000;i++)
	{
		listarray.add(1);
	}
	Instant endtime1 = Instant.now();
	Duration d1 = Duration.between(starttime1, endtime1);
	System.out.println(d1);
	
	Instant starttime2 = Instant.now();
	for(int i = 0 ; i < 10000;i++)
	{
		linkedlist.add(1);
	}
	Instant endtime2 = Instant.now();
	Duration d2 = Duration.between(starttime2, endtime2);
	System.out.println(d2);
}
}
