package ex602;

import java.util.Scanner;

public class ex602 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Indique o genero: ");
		String buffer;
		buffer = keyboard.nextLine();
		
		char gender = buffer.charAt(0);
		
		System.out.println("Indique a sua idade: ");
		int age;
		age = keyboard.nextInt();
		
		if ( (gender!='M' && gender !='F') || age<0 )
			System.out.println("Error in typed values");
		
		else if ( gender =='M' && age<18 )
			System.out.println("Boy");
		else if ( gender =='M' && age>=18 )
			System.out.println("Man");
		else if ( gender=='F' && age<18 )
			System.out.println("Girl");
		else 
			System.out.println("Woman");
		
		
	}

}
