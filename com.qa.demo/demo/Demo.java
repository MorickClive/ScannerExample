package demo;

import java.util.Scanner;

public class Demo {
	// Runner's scanner
	private static Scanner input;

	public static void run(Scanner scan) {
		// Runner's scanner
		input = scan;
		
		// Scanner Example
		// scannerExample(input);
		
		// Exceptions(try catch finally)
		try {
			exceptionDemo();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("always runs");
		}
	}

	// Exceptions demo
	public static void exceptionDemo() throws RuntimeException {
		throw new RuntimeException();
	}

	// Scanner demo
	private static void scannerExample(Scanner input) {
		String result;

		boolean flag = true;

		while (flag) {
			System.out.println("Please enter an option:");
			result = input.nextLine();

			switch (Integer.parseInt(result)) {
			case 1:
				System.out.println("Here is " + 1);
				break;
			case 2:
				System.out.println("Here is " + 2);
				break;
			case 3:
				System.out.println("Here is " + 3);
				break;
			case 4:
				System.out.println("Here is " + "a vole");
				break;

			case 0:
				flag = false;
				break;

			default:
				System.out.println("Unexpected input detected");
				flag = false;
			}
		}

	}

}
