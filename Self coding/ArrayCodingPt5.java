import java.util.Scanner;
public class ArrayCodingPt5 {

	public static void main(String[] args) {
		// The last portion of tasks from the advanced_array.txt file.
		// Part 11
		Scanner console = new Scanner(System.in);
		int [] primeCheck = new int [25];
		System.out.println("Enter your 25 values and we'll see if there are any prime numbers among them.");
		for (int i = 0; i <primeCheck.length; i++) {
			System.out.println("Enter the vaule for index " + (i));
			primeCheck[i] = console.nextInt();
		}
		console.close();
		System.out.println("The prime numbers found are: ");
		spotPrime(primeCheck);
		
	}
	
	// Part 11
	public static void spotPrime(int [] oneArray) {
		int [] tempPrimes = new int [oneArray.length];
		int primesFound = 0;
		for (int i = 0; i < oneArray.length; i++ ) {
			if (isPrime(oneArray[i]) == true && oneArray[i] != 1) {
				tempPrimes[i] = oneArray[i];
				primesFound++;
				System.out.println(tempPrimes[i]);
			}
		}
		System.out.println(primesFound + " prime numbers were found in theA array.");
	}
	// Check for each element is prime.
	static boolean isPrime(int n) {
		for (int j = 2; j < n; j++) {
			if (n%j==0 && n != 1) {
				return false;
			}
			
		}
		return true;
	}
	
	
	
	

}
