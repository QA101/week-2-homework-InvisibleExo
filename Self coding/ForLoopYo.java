
public class ForLoopYo {

	public static void main(String[] args) {
		forLoopChallengeOne();
		System.out.println();
		forLoopChallengeTwo();
		System.out.println();
		forLoopChallengeThree();
		System.out.println();
		forLoopChallengeFour();
		System.out.println();
		forLoopChallengeFive();
		System.out.println();
		forLoopChallengeSix();
		System.out.println();
		forLoopChallengeSeven();
		
	}
	// Part 1
	public static void forLoopChallengeOne() {
		for (int i = 0; i < 4; i++) {
			System.out.println("* * * * * * *");
		}
	}
	
	//Part 2
	public static void forLoopChallengeTwo() {
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= i; j++ ) {
				System.out.print(2 + " ");
			}
			System.out.println();
		}
	}
	
	//Part 3
	public static void forLoopChallengeThree() {
		
	
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* * ");
			}
		System.out.println();
		}
	}
	
	// Part 4
	public static void forLoopChallengeFour() {
		for (int i = 1; i <= 8; i+=2) {
			for (int j = 1; j <= i; j++) {
				System.out.print("$ ");
			}
			System.out.println(" ");
		}
	}
	
	// Part 5
	public static void forLoopChallengeFive() {
		for (int i = 1; i <= 4; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	//Part 6
	public static void forLoopChallengeSix() {
		for(int i = 3; i <= 8; i+=2) {
			for(int j = 1; j <= i; j++) {
				if (i == 7 && j ==1) {
					System.out.print(7 + " ");
				}
				else {
				System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}
	
	//Part 7
	public static void forLoopChallengeSeven() {
		int counter = 0;
		for (int i = 1; i < 8; i+=2 ) {
			counter++;
			for(int j = 1; j <= i; j++) {
				System.out.print(counter + " ");
			}
			
			System.out.println();
		}
	}


}
