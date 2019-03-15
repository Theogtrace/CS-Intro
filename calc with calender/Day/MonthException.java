
public class MonthException extends Exception
{
	public MonthException()
	{
		super("Dividing by Zero!");
	}
	
	public MonthException(String message)
	{
		super(message);
	}
}
