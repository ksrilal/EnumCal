package com.ksril;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner getInput = new Scanner(System.in);
		
		System.out.print("First Number: ");
		int first = getInput.nextInt();
		
		System.out.print("Second Number: ");
		int second = getInput.nextInt();
		
		System.out.print("1 - ADD\n2 - SUBSTRCT\nEnter Operator: ");
		int c = getInput.nextInt();
		
		switch(c){
			case 1:
				Operation add = new Operation(first, second, EnumOperator.ADD);
				System.out.println(first + " + " + second + " = " + add.calculate());
				break;
				
			case 2:
				Operation subtract = new Operation(first, second, EnumOperator.SUBTRACT);
				System.out.println(first + " - " + second + " = " + subtract.calculate());
				break;
			
			default: System.out.println("Invalid Operator!!");
		}
	}
}
