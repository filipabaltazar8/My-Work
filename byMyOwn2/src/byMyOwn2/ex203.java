package byMyOwn2;

import java.util.Scanner;

public class ex203 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		double value1 = keyboard.nextDouble();
		double value2 = keyboard.nextDouble();
		double value3 = keyboard.nextDouble();
		
		System.out.println("Values before tax: " + "\n value1: " + value1 +"\n value2: " + value2 +"\n value3: " + value3);
	
		double tax = keyboard.nextDouble();
		
		value1 = value1*tax + value1;
		value2 = value2*tax + value2;
		value3 = value3*tax + value3;
				
		System.out.println("Values after taxes: " + "\n value1: "+ value1 + "\n value2: "+ value2 + "\n value3: "+ value3 );

			}




	}

