package section3;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Byte numbers
		byte smallestByteNumber = Byte.MIN_VALUE;
		byte bigestByteNumber = Byte.MAX_VALUE;
		System.out.println("Byte Smallest value = " + smallestByteNumber);
		System.out.println("Byte Largest Value =" +bigestByteNumber);
		System.out.println(smallestByteNumber/2);
		byte a =(byte)( smallestByteNumber/2);
		
		//short numbers
		short smallestShortNumber = Short.MIN_VALUE;
		short biggestShortNumber = Short.MAX_VALUE;
		System.out.println("Short Smallest value = " + smallestShortNumber);
		System.out.println("Short Largest Value =" +biggestShortNumber);
		
		short ab= (short)(smallestShortNumber/2);
		
	}

}
