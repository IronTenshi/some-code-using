package abstractclasspractice4;

public class test {
public static void main(String[] args) {
	FulltimeEmployee f1 = new FulltimeEmployee("丁哥", 1000122123);
	PartTimeEmployeee p1 = new PartTimeEmployeee("奥哥", 243325, 12);
	f1.calculateSalary();
	p1.calculateSalary();
}
}
