package Student;

import java.util.Scanner;

public class Class {
	private String classnameString;
	private double IDnumber;
	private Student[] selectStudents;
	private int i = 0;
	
	public Class() //change initial build;
	{
        selectStudents = new Student[50]; 
    }
	
	public void getdate()
	{
		System.out.println(classnameString);
		System.out.println(IDnumber);
	}
	public void addclass(Scanner scanner)
	{
		//Scanner scanner = new Scanner(System.in);change 1 question;
		System.out.println("class name");
		classnameString = scanner.next();
		System.out.println("IDnumber");
		IDnumber = scanner.nextDouble();
		//scanner.close();
	}
	public void selectstudent(Student s)
	{
		selectStudents[i] = s;
		i++;
	}
	public void showselectstudent()
	{
		for(int n = 0; n < i ;n++)
		{
			selectStudents[n].getdate();
		}
	}
}
