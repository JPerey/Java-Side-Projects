import java.util.Scanner;

class WeaponPortion {
	Scanner weaponInput = new Scanner(System.in);
	String[][] weaponSaleArray = { { "1", "Straight Sword", "50" }, { "2", "Claymore", "100" },
			{ "3", "Halberd", "60" }, { "4", "Scythe", "50" } };

	int[][] getWeaponQuantityArray() {
		int weaponContinue = 1;
		int weaponChoice = 1;
		int weaponSaleQuantity = 1;
		String keepGoing = " ";
		int dontBreak = 1;
		// 4 rows, 2 columns/ first column: quantity, second column: price
		int weaponQuantityArray[][] = new int[4][2];
		for (int row = 0; row < weaponSaleArray.length; row++) {
			for (int col = 0; col < weaponSaleArray[row].length; col++) {
				System.out.print(weaponSaleArray[row][col] + "\t");
			}
			System.out.println();
		}
		do {
			do {
				try {
					dontBreak = 1;
					System.out.println("Which weapon do you want? Numbered 1 - 4");
					weaponChoice = Integer.parseInt(weaponInput.nextLine());
					if (1 <= weaponChoice && weaponChoice <= 4) {
						// THIS ALLOWED 50 TO WORK?! WTF?!
						dontBreak = 0;
					} else {
						System.out.println("I only have so much in stock you blubbering nitwit!!");
					}
				} catch (Exception e) {
					System.out.println("I'm an old man you bugger, what'd you say?!");
				}
			} while (dontBreak == 1);
			weaponQuantityArray[weaponChoice - 1][1] = Integer.parseInt(weaponSaleArray[weaponChoice - 1][2]);
			// System.out.println(weaponQuantityArray[weaponChoice - 1][1]);
			// this was a check to see if the right array cell was being copied
			// i.e. the price of the weapon
			do {
				try {
					dontBreak = 1;
					System.out.println("how many would you want?");
					weaponSaleQuantity = Integer.parseInt(weaponInput.nextLine());
					if (1 <= weaponSaleQuantity && weaponSaleQuantity <= 2147483646) {
						dontBreak = 0;
					}
				} catch (Exception e) {
					System.out.println("There ya go being non-sensical again!");
				}
			} while (dontBreak == 1);
			weaponQuantityArray[weaponChoice - 1][0] = weaponSaleQuantity;
			System.out.println("You want " + weaponQuantityArray[weaponChoice - 1][0] + " of "
					+ weaponSaleArray[weaponChoice - 1][1]);
			do {
				dontBreak = 1;
				System.out.println("Do you want another weapon? 'yes' or 'no'");
				keepGoing = weaponInput.nextLine();
				if (keepGoing.equals("yes")) {
					dontBreak = 0;
				} else if (keepGoing.equals("no")) {
					weaponContinue = 0;
					dontBreak = 0;
				} else {
					System.out.println("You're starting to annoy me...");
				}
			} while (dontBreak == 1);

		} while (weaponContinue == 1);
		weaponInput.close();
		return weaponQuantityArray;
	}
}
