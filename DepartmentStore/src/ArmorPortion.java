import java.util.Scanner;

public class ArmorPortion {
	Scanner armorInput = new Scanner(System.in);
	String[][] armorSaleArray = { { "1", "Cloth Armor", "10" }, { "2", "Leather Armor", "30" },
			{ "3", "Chainmail", "60" }, { "4", "Full-Plate Armor", "100" } };

	int[][] getArmorQuantityArray() {
		
		int armorContinue = 1;
		int armorChoice = 1;
		int armorSaleQuantity = 1;
		String keepGoing = " ";
		int dontBreak = 1;
		// 4 rows, 2 columns/ first column: quantity, second column: price
		int[][] armorQuantityArray = new int[4][2];
		for (int row = 0; row < armorSaleArray.length; row++) {
			for (int col = 0; col < armorSaleArray[row].length; col++) {
				System.out.print(armorSaleArray[row][col] + "\t");
			}
			System.out.println();
		}
		do {
			do {
				try {
					dontBreak = 1;
					System.out.println("Which armor do you want? Numbered 1-4");
					armorChoice = Integer.parseInt(armorInput.nextLine());
					if (1 <= armorChoice && armorChoice <= 4) {
						dontBreak = 0;
					} else {
						System.out.println("Maybe your an old man too ehh? You can't count like one!");
					}
				} catch (Exception e) {
					System.out.println("What're you going on about?!");
				}
				/*
				 * } else{ System.out.println("Incorrect input"); }
				 */

			} while (dontBreak == 1);
			armorQuantityArray[armorChoice - 1][1] = Integer.parseInt(armorSaleArray[armorChoice - 1][2]);
			do {
				try {
					dontBreak = 1;
					System.out.println("how many would you want?");
					armorSaleQuantity = Integer.parseInt(armorInput.nextLine());
					if (1 <= armorSaleQuantity && armorSaleQuantity <= 2147483646) {
						dontBreak = 0;

					}
				} catch (Exception e) {
					System.out.println("Say somethin' I can understand stranger!");
				}
			} while (dontBreak == 1);
			armorQuantityArray[armorChoice - 1][0] = armorSaleQuantity;
			System.out.println(
					"You want " + armorQuantityArray[armorChoice - 1][0] + " of " + armorSaleArray[armorChoice - 1][1]);
			do {
				dontBreak = 1;
				System.out.println("Do you want more armor? 'yes' or 'no'");
				keepGoing = armorInput.nextLine();
				if (keepGoing.equals("yes")) {
					dontBreak = 0;
				} else if (keepGoing.equals("no")) {
					armorContinue = 0;
					dontBreak = 0;
				} else {
					System.out.println("You're starting to annoy me...");
				}
			} while (dontBreak == 1);

		} while (armorContinue == 1);
		armorInput.close();
		return armorQuantityArray;

	}
}
