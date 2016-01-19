import java.util.Scanner;
import java.util.Random;

public class jamesFirstSideProject {
	public static void main(String[] args) {
		// Scanner object
		Scanner input = new Scanner(System.in);
		// random choice for computer
		Random randomGenerator = new Random();
		// String variables will be used to output Rock, Paper, or Scissors
		String yourChoice;
		String choice1;
		// Values needed to run loops
		int continuE = 1;
		/*randomComputerChoice
		 * = 1, rock
		 * = 2, paper
		 * = 3, scissors
		 */

		do {
			System.out.println("Would you like to play Rock, Paper, Scissors? \nPlease enter 'yes' or 'no'");
			choice1 = input.nextLine();

			switch (choice1) {
			case "yes":
				System.out.println("'rock', 'paper', 'scissors'?");
				yourChoice = input.nextLine();
				// Rock outcomes
				switch(yourChoice){
				case "rock":
					int randomComputerChoice = randomGenerator.nextInt(3);
					System.out.println(randomComputerChoice);
					
					if(randomComputerChoice == 0){
						System.out.println("Rock ties with Rock!");
					}
					else if(randomComputerChoice == 1){
						System.out.println("Rock loses to Paper!");
					}
					else{
						System.out.println("Rock beats Scissors!");
					}
					break;
					
				//Paper outcomes
				case "paper":
					randomComputerChoice = randomGenerator.nextInt(3);
					System.out.println(randomComputerChoice);
					
					if(randomComputerChoice == 0){
						System.out.println("Paper beats Rock!");
					}
					else if(randomComputerChoice == 1){
						System.out.println("Paper ties with Paper!");
					}
					else{
						System.out.println("Paper loses to Scissors!");
					}
					break;
					
				//Scissor outcomes
				case "scissors":
					randomComputerChoice = randomGenerator.nextInt(3);
					System.out.println(randomComputerChoice);
					
					if(randomComputerChoice == 0){
						System.out.println("Scissors loses to Rock!");
					}
					else if(randomComputerChoice == 1){
						System.out.println("Scissors beats Paper!");
					}
					else{
						System.out.println("Scissors ties with Scissors!");
					}
					break;
				}

				break;
			case "no":
				continuE = 0;
				System.out.println("Til next time");
				break;
			default:
				System.out.println("Entered incorrect text");
				break;
			}

		} while (continuE == 1);
	}
}
