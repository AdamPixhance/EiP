
public abstract class Personal extends Person {
	protected int Personalnummer;

	// getter method for Personalnummer
	public int getPersonalnummer() {
		return Personalnummer;
	}

	// setter method for Personalnummer
	public void setPersonalnummer(int personalnummer) {
		Personalnummer = personalnummer;
	}

	// Default Constructor
	Personal() {
			super();
		};

	// Default Constructor with name
	Personal(String Name) {
			super(Name);
		}
	// Constructor with name and PersonalNummer
	Personal(String Name, int PersonalNummer){
		super(Name);
		this.Personalnummer = PersonalNummer;
	}

	protected String basePersonalIntro() {
		return "Ich arbeite an der Uni und meine Personalnummer lautet: " + Personalnummer + ".";
	}

	// setting up the abstract Inroduction method to be replaced within all Personal
	// under classes
	abstract public String Introduction();
}
