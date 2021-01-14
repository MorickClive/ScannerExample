package demo.scanner.apps;

import java.util.Scanner;

import demo.scanner.models.Person;

public class PersonBuilder {
	private static Person result; 
	
	public static Person build(Scanner input) {
		
		result = new Person();
		
		System.out.println("Please enter your name: ");
		result.setName(input.nextLine());
		
		System.out.println("Please enter your age: ");
		result.setAge( Integer.parseInt(input.nextLine()) );
		
		System.out.println("Please enter your Job Title: ");
		result.setJobTitle(input.nextLine());
		
		return result;
	}

}
