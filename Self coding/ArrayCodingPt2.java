import java.util.Scanner;


public class ArrayCodingPt2 {

	public static void main(String[] args) {
		//Working on the homework from the Advanced Array.txt file.
		
		//Part 1
		findMax();
		
		//Part 2 
		 findMin();
		
		//Part 3 (The 2D Array stuff) make it four rows and four columns.
		int [][] bigOne = { {12, 31, 14, 7} , {7, 8, 67, 23} , {107, 188, 200, 51} , {1, 2, 3, 4} };
		int maxNum = 0;
		//Rows
		for(int i = 0; i < bigOne.length; i++) {
			// Columns
			for (int j = 0; j < bigOne[i].length; j++) {
				if (bigOne [i][j] > maxNum) {
					maxNum = bigOne[i][j];
				}
				System.out.print(bigOne[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("The max number found in the bigOne grid is: " + maxNum);
 		
		
		//Part 4 (the 2D Array stuff)
		int [][] bigTwo = { {6, 3, -8, 7} , {300, 201, -10, 9} , {34, 22, 65, 77} , {4, 3, 2, 1} };
		int minNum = bigTwo[0][0];
		//Rows
		for(int i = 0; i < bigOne.length; i++) {
			// Columns
			for (int j = 0; j < bigTwo[i].length; j++) {
				if (bigTwo [i][j] < minNum) {
					minNum = bigTwo[i][j];
				}
				System.out.print(bigTwo[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("The minimum number found in the bigTwo grid is: " + minNum);
		
		// Part 5
		Scanner console = new Scanner(System.in);
		System.out.println("For part 5 of Advanced Arrays, how big do you want the array to be? ");
		int size = console.nextInt();
		int [] testArray = new int [size];
		System.out.println("Now enter " + size + " values: ");
		for (int i = 0; i < testArray.length; i++) {
			testArray[i] = console.nextInt();
		}
		// Close console
		console.close();
		System.out.println("Now see those values go in to reverse: ");
		arrayReverse(testArray); 
	
	} 
	
		//Part 1
		public static void findMax() {
		Scanner console = new Scanner(System.in);
		System.out.println("For part 1, enter the size of the array: ");
		int sizeArray = console.nextInt();
		int [] theArray = new int[sizeArray];
		int max = 0;
		System.out.println("Enter " + sizeArray + " values: ");
		for (int i = 0; i < theArray.length; i++) {
			theArray[i] = console.nextInt();
			if (theArray[i] > max) {
				max = theArray[i];
			}
		}
		console.close();
		System.out.println("The Maxium value entered in the Array is: " + max);
	}
	
	
	// Part 2
	public static void findMin() {
		Scanner console = new Scanner(System.in);
		System.out.println("For part 2, enter the size of the array: ");
		int sizeArray = console.nextInt();
		int [] theArray = new int[sizeArray];
		System.out.println("Enter " + sizeArray + " values: ");
		int min = theArray[0];
		for (int i = 0; i < theArray.length; i++) {
			theArray[i] = console.nextInt();
			if (theArray[i] < min) {
				min = theArray[i];
			}
		}
		console.close();
		System.out.println("The Minimum value entered in the Array is: " + min);
	}
	
	
	// Part 3
	// Part 4
	
	// Part 5
	public static int[] arrayReverse(int [] testSwap) {
		for (int i = 0; i < testSwap.length/2; i++) {
			int j = testSwap.length - i - 1;
			swap(testSwap, i, j);
		}
		for (int i = 0; i < testSwap.length; i++) {
			System.out.println("Now testArray [" + i + "] = " + testSwap[i]);
		}
		return testSwap;
	}
	// Part2 of Part 5
	public static void swap(int [] list, int normal, int invert) {
		int temp = list[normal];
		list[normal] = list[invert];
		list[invert] = temp;
	}
	
	
}
