package demo;

import java.util.Scanner;

public class Runner {

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Demo.run(input);
		//ScannerExercises.run(input);
		
		//CleanUp
		input.close();
		System.out.println("\nScanner has been cleaned up!\n\t- Exit!");
	}

}
