package section3;

public class OperatorChallenge {

	public static void main(String[] args) 
	{
		double firstValue = 20.00;
		double secondValue = 80.00;
		double result1 = (firstValue + secondValue) * 100;
		double reminder = result1 % 40;
		
		System.out.println(reminder);
		boolean bValue = (reminder==0)?true:false;
		
		if(bValue)
		{
			System.out.println("True");
		}
		else 
		{
			System.out.println("False");
		}
	}

}
