import java.util.Scanner;

public class MainPortion {
	public static void main(String[] args) {
		// we shall be a decrepit shop in a medieval fantasy world, akin to dark
		// souls
		Scanner input = new Scanner(System.in);
		WeaponPortion weaponAisle = new WeaponPortion();
		ArmorPortion armorAisle = new ArmorPortion();
		String aisleChoice;
		String weaponAisleChoice;
		String armorAisleChoice;
		int totalCost = 0;
		int overallChoice = 1;
		int mainDontBreak = 1;
		int[][] weaponQuantityandCostArray = new int[4][2];
		int[][] armorQuantityandCostArray = new int[4][2];
		int[] totalCostArmor = new int[4];
		int[] totalCostWeapon = new int[4];

		do {
			System.out.println("Hello and welcome traveller. Rest your weary head and stay awhile");
			System.out.println("Would you like to visit our 'weapon' or 'armor' section first?");
			aisleChoice = input.nextLine();
			switch (aisleChoice.toLowerCase()) {

			case "weapon":
				weaponQuantityandCostArray = weaponAisle.getWeaponQuantityArray();
				do {

					System.out.println("Would you like to visit the armor section now? 'yes' or 'no'");
					weaponAisleChoice = input.nextLine();
					switch (weaponAisleChoice.toLowerCase()) {
					case "weaponAisleChoice.equalsIgnoreCase(yes)":
						armorQuantityandCostArray = armorAisle.getArmorQuantityArray();
						mainDontBreak = 0;
						overallChoice = 0;
						break;
					case "no":
						mainDontBreak = 0;
						overallChoice = 0;
						break;
					default:
						System.out.println("What're you sayin, what?");
						break;
					}
				} while (mainDontBreak == 1);
				break;
			case "armor":
				armorQuantityandCostArray = armorAisle.getArmorQuantityArray();
				do {
					System.out.println("Would you like to visit the weapon section now? 'yes' or 'no'");
					armorAisleChoice = input.nextLine();
					switch (armorAisleChoice.toLowerCase()) {
					case "yes":
						weaponQuantityandCostArray = weaponAisle.getWeaponQuantityArray();
						mainDontBreak = 0;
						overallChoice = 0;
						break;
					case "no":
						mainDontBreak = 0;
						overallChoice = 0;
						break;
					default:
						System.out.println("What're you sayin, what?");
						break;
					}
				} while (mainDontBreak == 1);
				break;
			default:
				System.out.println("Entered incorrect text");
				break;
			}
		} while (overallChoice == 1);

		System.out.println("That's quite a bit of stuff stranger... I'll see what I can do.");
		for (int row = 0; row < armorQuantityandCostArray.length; row++) {
			totalCostArmor[row] = armorQuantityandCostArray[row][0] * armorQuantityandCostArray[row][1];
			System.out.println(totalCostArmor[row]);
		}
		for (int row = 0; row < weaponQuantityandCostArray.length; row++) {
			totalCostWeapon[row] = weaponQuantityandCostArray[row][0] * weaponQuantityandCostArray[row][1];
			System.out.println(totalCostWeapon[row]);
		}
		for (int row = 0; row < armorQuantityandCostArray.length; row++) {
			totalCost = totalCost + totalCostArmor[row] + totalCostWeapon[row];
		}
		input.close();
		System.out.println("Aye, it comes out to be " + totalCost + " silver");

	}

}
