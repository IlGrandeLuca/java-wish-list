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
		String check = "s";

		Scanner in = new Scanner(System.in);

		do {
			System.out.print("Add new wish item: ");
			String wish = in.nextLine();
			wishList.add(wish);

			System.out.println("This list contains " + wishList.size() + " item...");

			System.out.println("Continue? (s/n)");
			check = in.nextLine();
			System.out.println("");
		} while (check.equalsIgnoreCase("s"));

		Collections.sort(wishList);
		Iterator<String> iterator = wishList.iterator();
		System.out.println("List's item:");
		while (iterator.hasNext())
			System.out.println(iterator.next());
	}

}
