
public class Professor extends Personal {
	private String Forschungsgebiet;

	// getter method for Forschungsgebiet
	public String getForschungsgebiet() {
		return Forschungsgebiet;
	}

	// explicit Forschungsgebiet Wechseln Methode that is simply a setter method
	public void ForschungsgebietWechseln(String forschungsgebiet) {
		Forschungsgebiet = forschungsgebiet;
	}

	// default constructor
	Professor() {
		super();
	}

	// constructor with a name
	Professor(String Name) {
		super(Name);
	}

	// constructor with a name and Personal Number
	Professor(String Name, int PersonalNummer) {
		super(Name, PersonalNummer);
	}

	// full Professor Constructor
	Professor(String Name, int PersonalNummer, String Forschungsgebiet) {
		super(Name, PersonalNummer);
		this.Forschungsgebiet = Forschungsgebiet;
	}

	// The Professor specific Introduction method
	// which overrides the Person.java one
	@Override
	public String Introduction() {
		StringBuilder sb = new StringBuilder(baseIntro());
		sb = sb.append("\nIch bin Professor und mein Forschungsgebiet ist " + Forschungsgebiet + ".");
		sb = sb.append("\n" + basePersonalIntro());
		return sb.toString();
	}
}
