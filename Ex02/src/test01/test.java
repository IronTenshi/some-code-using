package test01;

public class test 
{
	public class Africapeople extends People
	{
		@Override
		public void say()
		{
			System.out.println("african people say "+ sayingString);
		}
		Africapeople(String sayingString)
		{
			this.sayingString = sayingString;
		}
		
		private String sayingString;
	}
	public static void main(String[] args) {
		test test = new test();
		People africapeople = test.new Africapeople("丁哥666");
		Speaking speaking = new Speaking();
		speaking.speaking(africapeople);
		
		People ameircanpeople = new Ameircanpeople("厚哥666");
		People chinesepeople = new Chinesepeople("程哥666");
		speaking.speaking(ameircanpeople);
		speaking.speaking(chinesepeople);
	}
}
