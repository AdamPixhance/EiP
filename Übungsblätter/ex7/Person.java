
public class Person {
	protected String Name;

	// getName method
	public String getName() {
		return Name;
	}

	// setName method
	public void setName(String name) {
		Name = name;
	}

	// Default Constructor for Person
	Person() {
	}

	// Constructor for Person with Name
	Person(String Name) {
		this.Name = Name;
	}

	protected String baseIntro() {
		return "Hallo, mein Name ist " + Name + ".";
	}

	// generic baseline Introduction Method to build upon
	public String Introduction() {
		return baseIntro();
	}
	
	public void printIntro() {
		System.out.println(Introduction());
		System.out.println();
	}
}