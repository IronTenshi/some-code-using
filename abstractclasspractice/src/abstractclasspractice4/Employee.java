package abstractclasspractice4;

public abstract class Employee 
{
	protected String nameString;
	protected double ID;
	
	public abstract void calculateSalary();
	public Employee(String nameString,double ID)
	{
		this.ID = ID;
		this.nameString = nameString;
	}

}
