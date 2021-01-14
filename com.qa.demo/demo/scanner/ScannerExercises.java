package demo.scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import demo.scanner.apps.Calculator;
import demo.scanner.apps.PersonBuilder;
import demo.scanner.models.Person;

public class ScannerExercises {
	
	private static Scanner input;
	
	public static void run(Scanner scan) {
		input = scan;
		//calc();
		personList();
	}
	
	public static void calc() {
		Calculator.menu(input);
	}
	
	public static void personList() {
		List<Person> people = new ArrayList();
		String result;
		String searchTerm;
		boolean flag = true;
		
		StringBuilder menu = new StringBuilder();		
		menu.append("\n====================\n")
		.append("\t Staff Register Menu\n")
		.append("====================\n")
		.append("1) Register\n")
		.append("2) List Staff\n")
		.append("3) Search\n")
		.append("====================\n")
		.append("0) Exit\n")
		.append("====================");
		
		while(flag) {
			System.out.println(menu.toString());
			System.out.println("\nPlease select which program to run:");
			result = input.nextLine();
			
			switch(Integer.parseInt(result)) {
				case 1:
					people.add(PersonBuilder.build(input));
					break;
				case 2:
					for(Person handle : people) {
						System.out.println(handle.toString());						
					}
					break;
				case 3:
					System.out.println("Please enter staff name here:");
					searchTerm = input.nextLine();
					
					for(Person handle : people) {
						if(handle.getName().equalsIgnoreCase(searchTerm)) {
							System.out.println("Found:\n" + handle.toString());
							break;
						}
					}
					break;
					
				case 0:
					System.out.println("Exiting Staff Management System, have a good day!");
					flag = false;
					break;
					
				default:
					System.out.println("Input error detected, please try again!\n");
					break;
			}
		}		
		
	}

}
