
public class Professor extends Personal {
	private String forschungsgebiet;

	// getter method for forschungsgebiet
	public String getforschungsgebiet() {
		return forschungsgebiet;
	}

	// explicit forschungsgebiet Wechseln Methode that is simply a setter method
	public void forschungsgebietWechseln(String forschungsgebiet) {
		this.forschungsgebiet = forschungsgebiet;
	}

	// default constructor
	Professor() {
		super();
	}

	// constructor with a name
	Professor(String name) {
		super(name);
	}

	// constructor with a name and Personal Number
	Professor(String name, int personalNummer) {
		super(name, personalNummer);
	}

	// full Professor Constructor
	Professor(String name, int personalNummer, String forschungsgebiet) {
		super(name, personalNummer);
		this.forschungsgebiet = forschungsgebiet;
	}

	// The Professor specific introduction method
	// which overrides the Person.java one
	@Override
	public String introduction() {
		StringBuilder sb = new StringBuilder(baseIntro());
		sb = sb.append("\nIch bin Professor und mein forschungsgebiet ist " + forschungsgebiet + ".");
		sb = sb.append("\n" + basePersonalIntro());
		return sb.toString();
	}
}
