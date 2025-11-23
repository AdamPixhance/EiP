
public abstract class Personal extends Person {
	protected int personalnummer;

	// getter method for personalnummer
	public int getpersonalnummer() {
		return personalnummer;
	}

	// setter method for personalnummer
	public void setpersonalnummer(int personalnummer) {
		this.personalnummer = personalnummer;
	}

	// Default Constructor
	Personal() {
			super();
		};

	// Default Constructor with name
	Personal(String name) {
			super(name);
		}
	// Constructor with name and personalnummer
	Personal(String name, int personalnummer){
		super(name);
		this.personalnummer = personalnummer;
	}

	protected String basePersonalIntro() {
		return "Ich arbeite an der Uni und meine personalnummer lautet: " + personalnummer + ".";
	}

	// setting up the abstract Inroduction method to be replaced within all Personal
	// under classes
	abstract public String introduction();
}
