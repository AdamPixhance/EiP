
public class Person {
	protected String name;

	// getName method
	public String getname() {
		return name;
	}

	// setName method
	public void setname(String name) {
		this.name = name;
	}

	// Default Constructor for Person
	Person() {
	}

	// Constructor for Person with name
	Person(String name) {
		this.name = name;
	}

	protected String baseIntro() {
		return "Hallo, mein name ist " + name + ".";
	}

	// generic baseline introduction Method to build upon
	public String introduction() {
		return baseIntro();
	}
	
	public void printIntro() {
		System.out.println(introduction());
		System.out.println();
	}
}