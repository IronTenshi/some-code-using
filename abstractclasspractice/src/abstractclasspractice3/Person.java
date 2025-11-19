package abstractclasspractice3;

public abstract class Person 
{
	protected String nameString;
	public Person(String nameString)
	{
		this.nameString = nameString;
	}
	public abstract void display();
}
