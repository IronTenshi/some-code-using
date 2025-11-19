package Studet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Studentsystem {
	private List<Student> students = new ArrayList<Student>();
	
	public void Add(Student student)
	{
		students.add(student);
	}
	
	public void Delete(int index)
	{
		students.remove(index-1);
	}
	
	public void displayall()
	{
		for(Student student: students)
		{
			student.Display();
		}
	}
	
	public void sortlist()
	{
		students.sort(Comparator.comparingInt(Student::Totalscore).reversed());
	}
}
