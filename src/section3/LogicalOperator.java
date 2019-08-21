package section3;

public class LogicalOperator 
{
	public static void main(String[] args) 
	{
		int highScore = 81;
		if (highScore == 100)
		{
			System.out.println("It is the high score");
		}
		if(highScore!=100)
		{
			System.out.println("it is not high score");
		}
		if(highScore<100)
		{
			System.out.println("It is less than 100");
		}
		if(highScore>100)
		{
			System.out.println("It is greater than 100");
		}
		int secondScore = 91;
		if(highScore < 100 && secondScore >80 && secondScore < 100)
		{
			System.out.println("Both coditions are true.. ");
		}
		if((true)&&(false)||(false))
		{
			System.out.println("this will always execute");
		}
		
		boolean isCar = false;
		if(isCar=true)
		{
			System.out.println("is " + isCar);
		}
		System.out.println(isCar);
		
		int newValue = 12;
		if(newValue == 211)
		{
			System.out.println("Check if this works or not...");
		}
		
	}
}
