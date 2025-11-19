package Student;

import java.util.Scanner;

public class Student {
	private String studentnameString;
	private double IDnumber;
	private String collageString;
	public Class[] selectClasses;//1 change public Class[] selectClasses;
	
	public Student() //change initial build;
	{
        selectClasses = new Class[4]; 
    }
	
	public int i = 0;
	
	private String getstudentString()
	{
		return studentnameString;
	}
	private double getIDnumber()
	{
		return IDnumber;
	}
	private String getcollageString()
	{
		return collageString;
	}
	
	public void getdate()
	{
		System.out.println(getstudentString());
		System.out.println(getIDnumber());
		System.out.println(getcollageString());
	}
	public void inputdate(Scanner scanner)
	{
		//Scanner scanner = new Scanner(System.in);change 1 question;
		System.out.println("name");
		studentnameString = scanner.next();
		System.out.println("ID");
		IDnumber = scanner.nextDouble();
		System.out.println("collage");
		collageString = scanner.next();		
		//scanner.close();
	}
	public void selectclass(Class c)
	{
		if(i == 4)
		{
			System.out.println("达上限");
		}
		else
		{
			selectClasses[i] = c;
			i++;
		}
	}
	public void showselectclass()
	{
		for(int n = 0;n < i;n++)
		{
			System.out.println(+n+1);
			selectClasses[n].getdate();
		}
	}
	public int getselectnumber()
	{
		return i;
	}
}
