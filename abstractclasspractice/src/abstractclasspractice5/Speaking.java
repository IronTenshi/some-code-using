package abstractclasspractice5;

public class Speaking 
{
	private String speakingString;
	public Speaking(String speakingString)
	{
		this.speakingString = speakingString;
	}
	
	public void speak()
	{
		System.out.println(speakingString);
	}
}
