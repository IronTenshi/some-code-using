package Studet;

import java.util.ArrayList;

public class test01 {

public static void main(String[] args) {
	Studentsystem studentsystem = new Studentsystem();
	ArrayList<Integer> list0 = new ArrayList<Integer>();
	list0.add(80);
	list0.add(90);
	Student s0 = new Student("丁哥", list0);
	ArrayList<Integer> list1 = new ArrayList<Integer>();
	list1.add(10);
	list1.add(60);
	Student s1 = new Student("sb", list1);
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	list2.add(80);
	list2.add(70);
	Student s2 = new Student("wqaw", list2);
	studentsystem.Add(s0);
	studentsystem.Add(s1);
	studentsystem.Add(s2);
	
	studentsystem.Delete(1);
	studentsystem.sortlist();
	studentsystem.displayall();
	
}
}
