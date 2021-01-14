package demo.scanner.models;

public class Cat {
	
	public String name;

	public Cat(String name) {
		super();
		this.name = name;
	}
	
	public String speak() { return "meow!"; }
	
	public static String shouldSay() {return "*Feed me*"; }
	
}
