package demo.scanner.models;

public class Person {
	
	private String name;
	private int age;
	private String jobTitle;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
		this.age = 0;
		this.jobTitle = "";
		this.name = "";
	}
	
	public Person(String name, int age, String jobTitle) {
		super();
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	// alt+ shift + s
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", jobTitle=" + jobTitle + "]";
	}
	
	
}
