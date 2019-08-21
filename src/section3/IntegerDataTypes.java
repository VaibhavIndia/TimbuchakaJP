package section3;

public class IntegerDataTypes {
	public static void main(String[] args) {
		
		// Byte numbers
		byte smallestByteNumber = Byte.MIN_VALUE;
		byte bigestByteNumber = Byte.MAX_VALUE;
		System.out.println("Byte Smallest value = " + smallestByteNumber);
		System.out.println("Byte Largest Value =" +bigestByteNumber);
		
		//short numbers
		short smallestShortNumber = Short.MIN_VALUE;
		short biggestShortNumber = Short.MAX_VALUE;
		System.out.println("Short Smallest value = " + smallestShortNumber);
		System.out.println("Short Largest Value =" +biggestShortNumber);
		
		
		//Integer numbers
		int smallestIntegerNumber = Integer.MIN_VALUE;
		int bigestIntegerNumber = Integer.MAX_VALUE;
		System.out.println("Integer Smallest value = "+ bigestIntegerNumber);
		System.out.println("Integer Largest Value =" +smallestIntegerNumber);

		
		//Long numbers
		
		long l=213232323123L;
		System.out.println(l);
		Long smallestLongNumber = Long.MIN_VALUE;
		Long biggestLongNumber = Long.MAX_VALUE;
		System.out.println("Long Smallest value = "+ smallestLongNumber);
		System.out.println("Long Largest Value =" + biggestLongNumber);

		System.out.println(biggestLongNumber+1);
	}
}
