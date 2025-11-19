package ex2;

public class book{
	private String bookname;
	private double booknumber;
	private boolean t = false;
	private String student;
	
	public void getbookname(String bookname)
	{
		this.bookname = bookname;
	}
	public void getbooknumber(double booknumber)
	{
		this.booknumber = booknumber;
	}
	public void lend(String studentname)
	{
		this.t = true;
		student = studentname;
	}
	public void return01()
	{
		t = false;
	}
	public void outprint()//查看书的状态
	{
		System.out.println("bookname is "+ bookname);
		System.out.println("booknumber is "+booknumber);
		if(t)
		{
			System.out.println("student name is"+ student);
		}
		else
		{
			System.out.println("no lend");
		}
	}
}
