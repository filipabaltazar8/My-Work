package byMyOwn2;

import java.util.Scanner;

public class ex204 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String name = keyboard.nextLine();
		String address = keyboard.nextLine();
		String age = keyboard.hasNextInt();
		
		System.out.println("Name: " + name + "\n Address: " + address + "\n age: " + age );

}

}
