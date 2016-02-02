package com.jamjamperey.Collatz;
/*
 * This class is used to 
 * originally to check 3 previous entries into the duplicate array and compare to next 3 values
 * 
 */
public class SimpleImpossibleMath {
	private int number = 0;
	private int iteration = 0;
	private int[] patternChecker = new int[99999999]; // need to change to arraylist so that the size is changing dynamically
	int running = 1;

	public SimpleImpossibleMath(int number) {
		this.number = number;
	}

	public void startProblem(){

		// loop to run iterations test with '10'
		do {
			if ((number % 2) == 0) {
				number = number / 2;
				
				System.out.println("Even iteration: " + iteration + " value:" + number);
				patternChecker[iteration] = number;
				iteration++;
				if (iteration>5){
					// this if statement checks the last 6 values of the loop and if they match, will stop the program
					if (patternChecker[iteration-2] == patternChecker[iteration-5] && patternChecker[iteration-3] == patternChecker[iteration-6] && patternChecker[iteration-4] == patternChecker[iteration-7]){
						System.out.println("Loop detected. stopping code at iteration: " + iteration);
						System.exit(0);
				}
				}
				
			}else{
				number = 3*number + 1;
				
				System.out.println("Odd iteration: " + iteration + " value:" + number);
				patternChecker[iteration] = number;
				iteration++;
				if (iteration>5){
					// this if statement checks the last 6 values of the loop and if they match, will stop the program
					if (patternChecker[iteration-2] == patternChecker[iteration-5] && patternChecker[iteration-3] == patternChecker[iteration-6] && patternChecker[iteration-4] == patternChecker[iteration-7]){
						System.out.println("Loop detected. stopping code at iteration: " + iteration);
						System.exit(0);
				}
				}
				//System.out.println("it ran...whatever.."); tester
			}

		} while (running == 1);
	}
}
