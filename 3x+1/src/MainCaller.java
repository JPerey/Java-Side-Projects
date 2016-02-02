/*Written by Jam Jam James Perey
 * 1st draft:Feb,1,2016
 * goals of this code:
 * 1. to run the "3n+1" or Collatz conjecture successfully . done
 * 2. to be able to write a loop that can check for a pattern going back 3,5,10, etc. index's. done
 * and comparing that to the incoming 3,5,10, etc values. done
 * 3. change int to double and see what happens
 * 4. to find a repeat pattern  after 'x' amount of iterations in such a way that the program decides to stop looping 
 * 5. to keep track of the time until a pattern occurs
 * 6. successfully find any bugs and fix them
 * 
 */
import java.util.Scanner;

import com.jamjamperey.Collatz.SimpleImpossibleMath;

public class MainCaller {
	public static void main(String[] args) {
		int inputNumber;
		Scanner input = new Scanner(System.in);
		System.out.println("What natural number(ex:1,2,3,etc.) would you like to input\ninto the simplest impossible math problem?");
		inputNumber = Integer.parseInt(input.nextLine());
		SimpleImpossibleMath simCaller = new SimpleImpossibleMath(inputNumber);
		simCaller.startProblem();
		input.close();
		
	}
}
