package byMyOwn7;

import java.util.Scanner;
9

public class ex701 {

	public static void main(String[] args) {
		
		Scanner keyboard =new Scanner(System.in);

		
		System.out.println("Say a number between 0 and 10: ");
		int number;
		number =keyboard.nextInt();
				
		if ( 0>number || number>10)
		System.out.println("Error");

		else if (number==1)
			System.out.println("I");
		
		else if (number==2)
		System.out.println("II");
		
		else if (number==3)
		System.out.println("III");
		
		else if (number==4)
		System.out.println("IV");
		
		else if (number==5)
		System.out.println("V");
		
		else if (number==6)
		System.out.println("VI");
		
		else if (number==7)
		System.out.println("VII");
		
		else if (number==8)
		System.out.println("VIII");
		
		else if (number==9)
		System.out.println("IX");
		
		else if (number==10)
		System.out.println("X");
	}

}
