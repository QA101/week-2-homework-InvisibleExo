import java.util.Scanner;

public class ArrayCodingPt4 {

	public static void main(String[] args) {
		// The third portion of the Advanced Array tasks
		
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int list = console.nextInt();
		int [] theA = new int [list];
		System.out.println("Please enter " + list + " values for the theA array:");
		for (int i = 0; i < theA.length; i++) {
			theA[i] = console.nextInt();
		}
		console.close();
		
		// Part 7
		spotEven(theA);
		
		// Part 8
		spotOdd(theA);
		
		// Part 9
		spotPositive(theA);
		
		// Part 10
		spotNegative(theA);
	}
	
	// Part 7
		public static void spotEven(int [] theA) {
			int [] evenNum = new int [theA.length];
			for (int i = 0; i < theA.length; i++) {
				if (theA[i] % 2 == 0) {
					evenNum[i] = theA[i];
					System.out.println("Even number found in theA array at: Index[" + i + "] : " + evenNum[i]);
				}
			}
			
		}
		
		// Part 8
		public static void spotOdd(int [] theA) {
			int [] oddNum = new int [theA.length];
			for (int i = 0; i < theA.length; i++) {
				if (theA[i] % 2 != 0) {
					oddNum[i] = theA[i];
					System.out.println("Odd number found in theA array at: Index[" + i + "] : " + oddNum[i]);
				}
			}
		}
		
		// Part 9
		public static void spotPositive(int [] theA) {
			int [] posNum = new int [theA.length];
			for (int i = 0; i < theA.length; i++) {
				if (theA[i] > 0) {
					posNum[i] = theA[i];
					System.out.println("Positive number found in theA array at: Index[" + i + "] : " + posNum[i]);
				}
			}
		}
		
		// Part 10
		public static void spotNegative(int [] theA) {
			int [] negNum = new int [theA.length];
			for (int i = 0; i < theA.length; i++) {
				if (theA[i] < 0) {
					negNum[i] = theA[i];
					System.out.println("Negative number found in theA array at: Index[" + i + "] : " + negNum[i] );
				}
			}
		}

}
