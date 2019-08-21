package section3;

public class CastingChallenge {

	public static void main(String[] args) 
	{
		byte byteNumber = 23;
		short shortNumber = 32132;
		int intNumber = 213213;
		long finalLongNumber = 50000232323l+1032232l*(byteNumber+shortNumber+intNumber);
		System.out.println(finalLongNumber);
		short finalShortValue = (short)(1323+108*(byteNumber+shortNumber+intNumber));
		System.out.println(finalShortValue);
	}

}
