package abstractclasspractice5;

public class AmericaPeople extends People
{
	@Override
	public void say() 
	{
		System.out.println("american say");
		Speaking speaking = new Speaking(speakString);
		speaking.speak();
	}
	public AmericaPeople(String speakString)
	{
		this.speakString = speakString;
	}
	private String speakString;
}
