/**
 * 
 */
package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author lucai
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> wishList = new ArrayList<String>();
		String check = "s", name = null, address = null;

		Scanner in = new Scanner(System.in);

		System.out.print("Do you want to create a new wish list? (s/n)");
		check = in.nextLine();

		if (check.equalsIgnoreCase("s")) {
			do {
				System.out.print("Add a new wish item: ");
				String wish = in.nextLine();
				wishList.add(wish);

				System.out.println("This list contains " + wishList.size() + " item...");

				System.out.print("Continue? (s/n)");
				check = in.nextLine();
				System.out.println("");
			} while (check.equalsIgnoreCase("s"));

			Collections.sort(wishList);
			Iterator<String> iterator = wishList.iterator();

			System.out.println("List's items:");
			while (iterator.hasNext())
				System.out.println(iterator.next());
		}

		System.out.print("\nEnter name: ");
		name = in.nextLine();
		System.out.print("Enter address: ");
		address = in.nextLine();

		LetteraBabboNatale mail = new LetteraBabboNatale(name, address, wishList);
		try {
			System.out.println(mail.invia());
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}

		in.close();
	}

}
