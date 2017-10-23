import java.util.Scanner;
public class ArrayCodingPt1 {

	public static void main(String[] args) {
		int [] simpleArray = {1, 2, 3, 4,};
		
		arrayPart1(simpleArray);
		
		arrayPart2(simpleArray);
		// resetting array to original values.
		System.out.println("Resetting simpleArray values. I could just make the second method void, save some memory....");
		arrayPart2(simpleArray);
		System.out.println("....but then that happened.\n Ohh, let's do multiplication now:");
		
		multiplyElements(simpleArray);
		System.out.println("Now let's do a new array....with doubles.");
		double [] simpleArray2 = {1.2, 2.5, 3.8, -12};
		// Now lets clone the last three methods with some tweaking....
		arrayPart2(simpleArray2);
		
		arrayPart5(simpleArray2);
		System.out.println("Now to reverse back to norm");
		arrayPart5(simpleArray2);
		System.out.println("Stop, multiply.");
		
		multiplyElementsWithDecimals(simpleArray2);
		// To Create a method (Part 7) that will define size of array, enter the values and combine values of all the index
		// slots, then average them based on array size.
		numberOfMPScoreRatio();
		
		
		
	}
	
	// Part 1
	public static int[] arrayPart1(int [] testOne) {
		int [] arrayPt1 = testOne;
		for (int i = 0; i < arrayPt1.length; i++) {
			System.out.println("simpleArray at [" + i + "] = " + arrayPt1[i]);
		}
		return arrayPt1;
	}
	
	// Part 2
	public static int[] arrayPart2(int [] testSwap) {
		for (int i = 0; i < testSwap.length/2; i++) {
			int j = testSwap.length - i - 1;
			swap(testSwap, i, j);
		}
		for (int i = 0; i < testSwap.length; i++) {
			System.out.println("Now simple Array [" + i + "] = " + testSwap[i]);
		}
		return testSwap;
	}
	// Part of part 2
	public static void swap(int [] list, int normal, int invert) {
		int temp = list[normal];
		list[normal] = list[invert];
		list[invert] = temp;
	}
	
	//Part 3
	public static void multiplyElements(int [] list) {
		int total = 1;
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " * ");
			total = list[i] *= total;
		}
		System.out.println("= " + total);
	}
	
	// Part 4
	public static double[] arrayPart2(double [] testOne) {
		double [] arrayPt2 = testOne;
		for (int i = 0; i < arrayPt2.length; i++) {
			System.out.println("simpleArray at [" + i + "] = " + arrayPt2[i]);
		}
		return arrayPt2;
	}
	// Part 5
	public static double[] arrayPart5(double [] testSwap) {
		for (int i = 0; i < testSwap.length/2; i++) {
			int j = testSwap.length - i - 1;
			swap2(testSwap, i, j);
		}
		for (int i = 0; i < testSwap.length; i++) {
			System.out.println("Now simple Array [" + i + "] = " + testSwap[i]);
		}
		return testSwap;
	}
	// Part 2 of Part 5
	public static void swap2(double [] list, int normal, int invert) {
		double temp = list[normal];
		list[normal] = list[invert];
		list[invert] = temp;
	}
	
	// Part 6 
	public static void multiplyElementsWithDecimals(double [] list) {
		double total = 1;
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " * ");
			total = list[i] *= total;
		}
		System.out.println("= " + total);
	}
	
	
	// Part 7 
	public static void numberOfMPScoreRatio() {
		System.out.println("So tell me how many MP matches you played last night? ");
		Scanner console = new Scanner(System.in);
		int total = console.nextInt();
		double sum = 0;
		double [] scoreList = new double [total];
		System.out.println(total + " matchs.");
		System.out.println("What was your score for each round? ");
		for (int i = 0; i < scoreList.length; i++) {
			System.out.print("Match " + (i+1) + ": ");
			System.out.println(scoreList[i] = console.nextDouble());
			sum += scoreList[i];
		}
		double average = sum/total;
		System.out.println("Your average is: " + average);
		if (average >= 90) {
			System.out.println("Wow. You should consider playing tournaments.");
		}
		else if (average <= 89 || average <= 70) {
			System.out.println("Hmmm, not bad. Maybe we should play on game nights.");
		}
		else {
			System.out.println("Probably best to take breaks and do some other activites if you're getting frustrated. Don't burn yourself out.");
		}
		
		console.close();
	}
}
