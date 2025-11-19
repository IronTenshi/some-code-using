package Student;

import java.util.Scanner;

public class studentsystem {
	public static void main(String[] args) {
		Student[] students = new Student[100];
		int studentnumber = 0;
		Class[] classes = new Class[100];
		int classnumber = 0;
		//change initial build;
//		students[studentnumber] = new Student();
//		classes[classnumber] = new Class();
		Scanner scanner = new Scanner(System.in);
		for(;;)
		{
			System.out.println("add student please input 1");
			System.out.println("add class please input 2");
			System.out.println("select class 3");
			System.out.println("delete class 4");
			System.out.println("show select class 5");
			System.out.println("show select student 6");
			System.out.println("close the system 7");
			int i = scanner.nextInt();
			switch (i) {
			case 1:{
				students[studentnumber] = new Student();//change
				students[studentnumber].inputdate(scanner);
				studentnumber++;
				break;
			}
			case 2:{
				classes[classnumber] = new Class();//change
				classes[classnumber].addclass(scanner);
				classnumber++;
				break;
			}
			case 3:{
				System.out.println("which number of student selects classes");
				int number = scanner.nextInt();
				if((number - 1) > studentnumber)
				{
					System.out.println("error");
					break;
				}
				else
				{
					for(int cn = 0;cn < classnumber;cn++)
					{
						classes[cn].getdate();
						System.out.println("did the student select this class(true or flase)");
						boolean t = scanner.nextBoolean();
						if(t)
						{
							//add student select class
							students[number - 1].selectclass(classes[cn]);
							classes[cn].selectstudent(students[number - 1]);
						}
					}
				}
				break;
			}
			case 4:
			{
				System.out.println("which number of student will delete the class");
				int number = scanner.nextInt();
				if((number - 1) > studentnumber)
				{
					System.out.println("error");
					break;
				}
				else
				{
					//delete class
					students[number - 1].showselectclass();
					System.out.println("which number of class will be deleted");
					int number2 = scanner.nextInt();
					for(int d = (number2 - 1);d < students[number - 1].i;d++)
					{
						students[number - 1].selectClasses[d] = students[number - 1].selectClasses[d+1];//change a question;
					}
					students[number - 1].i--;
				}
				break;
			}
			case 5:
			{
				System.out.println("which number of student show selectsclasses");
				int number = scanner.nextInt();
				if((number - 1) >= studentnumber)
				{
					System.out.println("error");
					break;
				}
				else
				{
					students[number -1].showselectclass();
				}
				break;
			}
			case 6:
			{
				System.out.println("which number of class selectsstudents");
				int number = scanner.nextInt();
				if((number - 1) >= classnumber)
				{
					System.out.println("error");
					break;
				}
				else
				{
					classes[number - 1].showselectstudent();
				}
				break;
			}
			case 7://change 
			{
				scanner.close();
				return;
			}
			default:
				System.out.println("error");
			}
		}
	}
}
