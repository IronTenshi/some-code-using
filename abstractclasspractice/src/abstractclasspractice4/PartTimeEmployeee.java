package abstractclasspractice4;

public class PartTimeEmployeee extends Employee
{
	@Override
	public void calculateSalary()
	{
		System.out.println(hourlyRate*hoursWorked);
	}
	public PartTimeEmployeee(String nameString, double ID ,double hoursWorked)
	{
		super(nameString, ID);
		this.hoursWorked = hoursWorked;
	}
	private double hoursWorked;
	private double hourlyRate = 1000000000;
}
