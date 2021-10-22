
//your main interface for the project, with the main method
import util.Scanner;
public class Kiosk {
	public static void main (String[] args) {
		System.out.println("Welcome to Kroger");
		int ptotal = 0;
		int itemNum;
		int apples = 0;
		int oranges = 0;
		int melons = 0;
		int berries = 0;
		int grapes = 0;
		System.out.println("Inventory: ");
		System.out.println("1 Apple    $3.00");
		System.out.println("1 Orange   $4.00");
		System.out.println("1 Melon    $7.00");
		System.out.println("1 Berrie   $2.00");
		System.out.println("1 Grape    $2.00");
		Scanner Keyboard = new scanner(keyboard);
		System.out.println(Y"ou must type each item name exactly.  How many items would you like to buy (less than 10)?");;
		String itemNumS = scan.nextLine();
		itemNum = Integer.parseInt(itemNumS);
		while (itemNum > 0) {
			System.out.println("Item " + itemNum + ": ");
			String item =  scan.nextLine();
			if (item.equals("1 Apple")) {
				ptotal = 3 + total;
				apples = 1 + apples;
			}
			if (item.equals("1 Orange")) {
				ptotal = 4 + total;
				oranges = 1 + oranges;
			}
			if (item.equals("1 Melon")) {
				ptotal = 7 + total;
				melons = 1 + melons;
			}
			if (item.equals("1 Berrie")) {
				ptotal = 2 + total;
				berries = 1 + berries;
			}
			if (item.equals("1 Grape")) {
				ptotal = 2 + total;
				grapes = 1 + grapes;
			}
			else {
				System.out.println("That is not an item. Try Again.");
				itemNum = itemNum + 1;
			}
			itemNum = itemNum - 1;
		}  //close while
	}  //close main()
} //closes kiosk()

Version 2:
import java.util.Scanner;

public class Kiosk {
	public int subtotal = 0;
	public double total = 0;
	public double tax = 0;
	public int itemNum;
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
		System.out.println("1 Apple    $3.00");
		System.out.println("1 Orange   $4.00");
		System.out.println("1 Melon    $7.00");
		System.out.println("1 Berrie   $2.00");
		System.out.println("1 Grape    $2.00");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many items would you like to purchase (You can only buy a max of 9 items): ");
		String itemNumS = keyboard.nextLine();
		itemNum = Integer.parseInt(itemNumS);
		System.out.println("You must type each item exactly how it's listed in the inventory (ex. 1 Apple) ");
		while (itemNum > 0) {
			y++;
			System.out.print("Item " + itemNum + ": ");
			item =  keyboard.nextLine();
			if (item.equals("1 Apple")) {
				subtotal = 3 + subtotal;
				apples++;
			}
			else if(item.equals("1 Orange")) {
				subtotal = 4 + subtotal;
				oranges++;
			}
			else if(item.equals("1 Melon")) {
				subtotal = 7 + subtotal;
				melons++;
			}
			else if(item.equals("1 Berrie")) {
				subtotal = 2 + subtotal;
				berries++;
			}
			else if(item.equals("1 Grape")) {
				subtotal = 2 + subtotal;
				grapes++;
			}
			else {
				System.out.println("That is not an item. Try Again.");
				itemNum++;
			}
			itemNum = itemNum - 1;
		}  //close while loop
	}  //close kiosk()
	public void Printer() {
		tax = subtotal * .0575;
		double rTax = (double) Math.round(tax * 100) / 100;
		total = rTax + subtotal;
		System.out.println("****************************************");
		System.out.println("             Kroger Recipt              ");
		System.out.println("Qty    Item                       Price ");
//		System.out.println("Qty    Item              Tax:      $3.00");
//		System.out.println("Qty    Item              Subtotal: $3.00");
//		System.out.println("Qty    Item              Total:    $3.00");
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
			System.out.print("$" + (3 * apples) + ".00");
		}
		else if (apples > 1 ) {
			System.out.print( "\n" + apples + "      " + "Apples");
			int x = 27 - aa;
			while ( x > 0) {
				System.out.print(" ");
				x = x - 1;
			}
			System.out.print("$" + (3 * apples) + ".00");
		}	
		if (oranges == 1 ) {
			System.out.print("\n" +  oranges + "      " + "Orange ");
			int x = 27 - oo;
			while ( x > 0) {
				System.out.print(" ");
				x = x - 1;
			}
			System.out.print("$" + (4 * oranges) + ".00");
		}
		else if (oranges > 1) {
			System.out.print("\n" + oranges + "      "  + "Oranges");
			int x = 27 - oo;
			while ( x > 0) {
				System.out.print(" ");
				x = x - 1;
			}
			System.out.print("$" + (4 * oranges) + ".00");
		}
		if (melons == 1) {
			System.out.print("\n" + melons + "      " + "Melon ");
			int x = 27 - mm;
			while ( x > 0) {
				System.out.print(" ");
				x = x - 1;
			}
			System.out.print("$" + (7 * melons) + ".00");
		}
		else if (melons > 1) {
			System.out.print("\n" + melons + "      " + "Melons");
			int x = 27 - mm;
			while ( x > 0) {
				System.out.print(" ");
				x = x - 1;
			}
			System.out.print("$" + (7 * melons) + ".00");
		}
		if (berries == 1) {
			System.out.print("\n" + berries + "      " + "Berrie ");
			int x = 27 - bb;
			while ( x > 0) {
				System.out.print(" ");
				x = x - 1;
			}
			System.out.print("$" + (2 * berries) + ".00");
		}
		else if (berries > 1) {
			System.out.print("\n" + berries + "      " + "Berries");
			int x = 27 - bb;
			while ( x > 0) {
				System.out.print(" ");
				x = x - 1;
			}
			System.out.print("$" + (2 * berries) + ".00");
		}	
		if (grapes == 1) {
			System.out.print("\n" + grapes + "      " + "Grape ");
			int x = 27 - gg;
			while ( x > 0) {
				System.out.print(" ");
				x = x - 1;
			}
			System.out.print("$" + (2 * grapes) + ".00");
		}
		else if (grapes > 1) {
			System.out.print("\n" + grapes + "      " + "Grapes");
			int x = 27- gg;
			while ( x > 0) {
				System.out.print(" ");
				x = x - 1;
			}
			System.out.print("$" + (2 * grapes) + ".00");
		}
		System.out.println("\n");
		if (total > 10) {
			int z = 24;
			while (z > 0) {
				System.out.print(" ");
				z = z -1;
			}
			System.out.println("Tax:     $" + rTax);
			z = 24;
			while (z > 0) {
				System.out.print(" ");
				z = z -1;
			}
			System.out.println("Subtotal:$" + subtotal + ".00");
			z = 24;
			while (z > 0) {
				System.out.print(" ");
				z = z -1;
			}
			System.out.println("Total:   $" + total);
		}
		if (total < 10) {
			int z = 25;
			while (z > 0) {
				System.out.print(" ");
				z = z -1;
			}
			System.out.println("Tax:      $" + rTax);
			z = 25;
			while (z > 0) {
				System.out.print(" ");
				z = z -1;
			}
			System.out.println("Subtotal:$" + subtotal + ".00");
			z = 25;
			while (z > 0) {
				System.out.print(" ");
				z = z -1;
			}
			System.out.println("Total:   $" + total);
		
		}
	}
} //close class Kiosk
