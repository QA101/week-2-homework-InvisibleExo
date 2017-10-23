import java.util.Scanner;

public class ArrayCodingPt3 {

	public static void main(String[] args) {
		// The second portion from the Advanced Arrays tasks.
		
		// Part 6.1 and 6.2
				// Decide the size of array a, b, and c. We could decide for each, but
				// can get messy.
				Scanner console = new Scanner(System.in);
				System.out.println("Enter the size for all three arrays: ");
				int list = console.nextInt();
				int [] theA = new int [list];
				int [] theB = new int [list];
				int [] theC = new int [list];
				System.out.println("Please enter " + list + " values for the theA array:");
				for (int i = 0; i < theA.length; i++) {
					theA[i] = console.nextInt();
				}
				System.out.println("Please enter " + list + " values for the theB array:");
				for (int i = 0; i < theA.length; i++) {
					theB[i] = console.nextInt();
				}
				console.close();
				theArraySum(theA, theB, theC);
				theArrayDiff(theA, theB, theC);
				
				
	}
	// 6.1
	public static void theArraySum(int [] A, int [] B, int [] C) {
		for(int i = 0; i < C.length; i++) {
			C[i] = (A[i] + B[i]);
			System.out.println("theC index of " + i + " has value = " + C[i]);
		}
	}
	// 6.2
	public static void theArrayDiff(int [] A, int[] B, int[] C) {
		for(int i = 0; i < C.length; i ++) {
			C[i] = (A[i] - B[i]);
			System.out.println("theC index of " + i + " has value = " + C[i]);
		}
	}
	
	
}
