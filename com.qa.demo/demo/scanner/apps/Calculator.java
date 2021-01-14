package demo.scanner.apps;

import java.util.Scanner;

public class Calculator {
	
	private static double[] inputVals = new double[2];
	private static Scanner input;
	
	public static void menu(Scanner scan) {
		input = scan;
		String result;
		boolean flag = true;
		StringBuilder menu = new StringBuilder();
		String ans = "Answer: "; 
		
		menu.append("\n====================\n")
		.append("\t Calculator Menu\n")
		.append("====================\n")
		.append("1) Addition\n")
		.append("2) Subtraction\n")
		.append("3) Multiplication\n")
		.append("4) Division\n")
		.append("5) Modulus\n")
		.append("====================\n")
		.append("0) Exit\n")
		.append("====================");
		
		while(flag) {
			System.out.println(menu.toString());
			System.out.println("\nPlease select which program to run:");
			result = input.nextLine();
			
			switch(Integer.parseInt(result)) {
				case 1:
					System.out.println("1) Addition");
					numberRequest();
					System.out.println(ans + add(inputVals[0], inputVals[1]));
					break;
				case 2:
					System.out.println("2) Subtraction");
					numberRequest();
					System.out.println(ans + sub(inputVals[0], inputVals[1]));
					break;
				case 3:
					System.out.println("3) Multiplication");
					numberRequest();
					System.out.println(ans + mult(inputVals[0], inputVals[1]));
					break;
				case 4:
					System.out.println("4) Division");
					numberRequest();
					System.out.println(ans + div(inputVals[0], inputVals[1]));
					break;
				case 5:
					System.out.println("5) Modulus");
					numberRequest();
					System.out.println(ans + mod(inputVals[0], inputVals[1]));
					break;
				case 0:
					System.out.println("Exiting Calculator, have a good day!");
					flag = false;
					break;
					
				default:
					System.out.println("Input error detected, please try again!\n");
					break;
			}
		}		
		
	}
	
	private static double[] numberRequest() {
		System.out.println("\tPlease enter value 1:");
		inputVals[0] = Double.parseDouble(input.nextLine());
		System.out.println("\tPlease enter value 2:");
		inputVals[1] = Double.parseDouble(input.nextLine());
		
		return inputVals;
	}

	private static double add(double x, double y) {
		return x + y;
	}

	private static double sub(double x, double y) {
	 return  x - y;
	}

	private static double mult(double x, double y) {
	 return  x * y;
	}

	private static double div(double x, double y) {
	 return  x / y;
	}

	private static double mod(double x, double y) {
	 return  x % y;
	}
}
