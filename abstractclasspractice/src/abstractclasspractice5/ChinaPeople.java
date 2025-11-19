package abstractclasspractice5;

public class ChinaPeople extends People
{
	@Override
	public void say()
	{
		System.out.println("chinese say");
		Speaking speaking = new Speaking(speakString);
		speaking.speak();
	}
	public ChinaPeople(String speakString)
	{
		this.speakString = speakString;
	}
	private String speakString;
}
