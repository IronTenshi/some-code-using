package abstractclasspractice5;

public class test {
	public class AfricaPeople extends People
	{
		@Override
		public void say() 
		{
			System.out.println("african say");
			Speaking speaking = new Speaking(speakString);
			speaking.speak();
		}
		public AfricaPeople(String speakString)
		{
			this.speakString = speakString;
		}
		private String speakString;
	}
public static void main(String[] args) {
	test t1 = new test();
	AfricaPeople AfricaPeople = t1.new AfricaPeople("asdas");
	AfricaPeople.say();
	ChinaPeople c1 = new ChinaPeople("丁哥6666");
	c1.say();
	AmericaPeople a1 = new AmericaPeople("ding ge 66666");
	a1.say();
}
}
