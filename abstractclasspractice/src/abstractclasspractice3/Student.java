package abstractclasspractice3;

public class Student extends Person
{
	@Override
	public void display() {
		System.out.println("name is  "+nameString+"   ID is "+studentID);
	}
	public Student(String nameString,double studentID)
	{
		super(nameString);
		this.studentID = studentID;
	}
	private double studentID;
}
