package section3;

public class ternaryOperator {

	public static void main(String[] args) 
	{
		boolean isMan = (100<200) ? true : false;
		
		if (isMan)
		{
			System.out.println("this is man");
		}
		else 
		{
			System.out.println("This is not Man");
		}

		int ageOfClient =2;
		boolean isAdult = (ageOfClient>18) ? true: false;
		if(isAdult)
		{
			System.out.println("He is adult");
		}
		else
		{
			System.out.println("He is still child");
		}
		
	}

}
