
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

public class Printer() {
	public Printer() {
		Kiosk.myKiosk = new Kiosk;
		System.out.println("****************************************");
		System.out.println("             Kroger Recipt              ");
		System.out.println("Qty    Item 
