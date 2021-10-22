import java.util.Scanner;

public class Kiosk {
	public double subtotal = 0.00;
	public double total = 0;
	public double tax = 0;
	public int itemNum;
	public int itemQty = 0;
	public int apples = 0;
	public int oranges = 0;
	public int melons = 0;
	public int berries = 0;
	public int grapes = 0;
	public int y = 0;
	String item;
	public void Register() {
		System.out.println("Welcome to Kroger");
		System.out.println("\nInventory: ");
		System.out.println("1 Apple    $2.99");
		System.out.println("1 Orange   $3.99");
		System.out.println("1 Melon    $6.99");
		System.out.println("1 Berrie   $0.99");
		System.out.println("1 Grape    $1.99");
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many differnt items would you like to purchase( Apple vs Melon vs Orange): ");
		String itemNumS = keyboard.nextLine();
		itemNum = Integer.parseInt(itemNumS);
		System.out.print("You can only buy a max of 9 of each item.");
		while (itemNum > 0) {
			y++;
			System.out.print("\nItem " + y + ": ");
			item =  keyboard.nextLine();
			String itemQtyS = item.substring(0,1);
			itemQty = Integer.parseInt(itemQtyS);
			String itemName = item.substring(2);
			if (itemName.equals("Apple") || itemName.equals("Apples")) {
				subtotal = (itemQty*2.99) + subtotal;
				apples = apples + itemQty;
			}
			else if(itemName.equals("Orange") || itemName.equals("Oranges")) {
				subtotal = (itemQty *3.99) + subtotal;
				oranges = oranges + itemQty;
			}
			else if(itemName.equals("Melon") || itemName.equals("Melons")) {
				subtotal = (itemQty*6.99) + subtotal;
				melons = melons + itemQty;
			}
			else if(item.equals("Berrie") || itemName.equals("Berries")) {
				subtotal = (itemQty*.99) + subtotal;
				berries = berries + itemQty;
			}
			else if(item.equals("Grape") || itemName.equals("Grapes")) {
				subtotal = (itemQty*1.99) + subtotal;
				grapes = grapes + itemQty;
			}
			else {
				System.out.println("That is not an item. Try Again.");
				y++;
			}
			itemNum = itemNum - 1;
		}  //close while loop
	}  //close kiosk()
	public void Printer() {
		tax = subtotal * .0575;
		double rTax = (double) Math.round(tax * 100) / 100;
		total = rTax + subtotal;
		double rTotal = (double) Math.round(total * 100) / 100;
		System.out.println("\n****************************************");
		System.out.println("             Kroger Recipt              ");
		System.out.println("Qty    Item                       Price ");
		String a = ("Apples");
		String o = ("Oranges");
		String m = ("Melons");
		String b = ("Berries");
		String g = ("Grapes");
		int aa = a.length();
		int oo = o.length();
		int mm = m.length();
		int bb = b.length();
		int gg = g.length();
		if (apples == 1 ) {
			System.out.print( "\n" + apples + "      " + "Apple ");
			int x = 27 - aa;
			while ( x > 0) {
				System.out.print(" ");
				x = x - 1;
			}
			System.out.print("$" + (2.99 * apples));
		}
		else if (apples > 1 ) {
			System.out.print( "\n" + apples + "      " + "Apples");
			int x = 27 - aa;
			while ( x > 0) {
				System.out.print(" ");
				x = x - 1;
			}
			System.out.print("$" + (2.99 * apples));
		}	
		if (oranges == 1 ) {
			System.out.print("\n" +  oranges + "      " + "Orange ");
			int x = 27 - oo;
			while ( x > 0) {
				System.out.print(" ");
				x = x - 1;
			}
			System.out.print("$" + (3.99 * oranges));
		}
		else if (oranges > 1) {
			System.out.print("\n" + oranges + "      "  + "Oranges");
			int x = 27 - oo;
			while ( x > 0) {
				System.out.print(" ");
				x = x - 1;
			}
			System.out.print("$" + (3.99 * oranges));
		}
		if (melons == 1) {
			System.out.print("\n" + melons + "      " + "Melon ");
			int x = 27 - mm;
			while ( x > 0) {
				System.out.print(" ");
				x = x - 1;
			}
			System.out.print("$" + (6.99 * melons));
		}
		else if (melons > 1) {
			System.out.print("\n" + melons + "      " + "Melons");
			int x = 27 - mm;
			while ( x > 0) {
				System.out.print(" ");
				x = x - 1;
			}
			System.out.print("$" + (6.99 * melons));
		}
		if (berries == 1) {
			System.out.print("\n" + berries + "      " + "Berrie ");
			int x = 27 - bb;
			while ( x > 0) {
				System.out.print(" ");
				x = x - 1;
			}
			System.out.print("$" + (0.99 * berries));
		}
		else if (berries > 1) {
			System.out.print("\n" + berries + "      " + "Berries");
			int x = 27 - bb;
			while ( x > 0) {
				System.out.print(" ");
				x = x - 1;
			}
			System.out.print("$" + (0.99 * berries));
		}	
		if (grapes == 1) {
			System.out.print("\n" + grapes + "      " + "Grape ");
			int x = 27 - gg;
			while ( x > 0) {
				System.out.print(" ");
				x = x - 1;
			}
			System.out.print("$" + (1.99 * grapes));
		}
		else if (grapes > 1) {
			System.out.print("\n" + grapes + "      " + "Grapes");
			int x = 27- gg;
			while ( x > 0) {
				System.out.print(" ");
				x = x - 1;
			}
			System.out.print("$" + (1.99 * grapes));
		}
		System.out.println("\n");
		if (total > 10) {
			int z = 24;
			while (z > 0) {
				System.out.print(" ");
				z = z -1;
			}
			System.out.println("Tax:      $" + rTax);
			z = 24;
			while (z > 0) {
				System.out.print(" ");
				z = z -1;
			}
			System.out.println("Subtotal: $" + subtotal);
			z = 24;
			while (z > 0) {
				System.out.print(" ");
				z = z -1;
			}
			System.out.println("Total:    $" + rTotal);
		}
		if (total < 10) {
			int z = 25;
			while (z > 0) {
				System.out.print(" ");
				z = z -1;
			}
			System.out.println("Tax:       $" + rTax);
			z = 25;
			while (z > 0) {
				System.out.print(" ");
				z = z -1;
			}
			System.out.println("Subtotal:$ " + subtotal);
			z = 25;
			while (z > 0) {
				System.out.print(" ");
				z = z -1;
			}
			System.out.println("Total:    $" +rTotal);
		
		}
		System.out.println("****************************************");
		System.out.println("     Thanks for shopping at Kroger      ");
		System.out.println("****************************************");
	}
} //close class Kiosk

//OLD CODE
/*String itemNumS = keyboard.nextLine();
		itemNum = Integer.parseInt(itemNumS);
		System.out.println("\nYou must type each item exactly how it's listed in the inventory (ex. 1 Apple) ");
		while (itemNum > 0) {
			y++;
			System.out.print("Item " + y + ": ");
			item =  keyboard.nextLine();
			if (item.equals("1 Apple")) {
				subtotal = 2.99 + subtotal;
				apples++;
			}
			else if(item.equals("1 Orange")) {
				subtotal = 3.99 + subtotal;
				oranges++;
			}
			else if(item.equals("1 Melon")) {
				subtotal = 6.99 + subtotal;
				melons++;
			}
			else if(item.equals("1 Berrie")) {
				subtotal = .99 + subtotal;
				berries++;
			}
			else if(item.equals("1 Grape")) {
				subtotal = 1.99 + subtotal;
				grapes++;
			}
			else {
				System.out.println("That is not an item. Try Again.");
				y++;
			}
			itemNum = itemNum - 1;*/
