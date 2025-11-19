package abstractclasspractice4;

public class FulltimeEmployee extends Employee
{
	public FulltimeEmployee(String nameString,double ID)
	{
		super(nameString, ID);
	}
	@Override
	public void calculateSalary()
	{
		System.out.println(monthlySalary);
	}
	private double monthlySalary = 200000000;
}
