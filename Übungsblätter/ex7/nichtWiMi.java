
public class nichtWiMi extends Personal {
	private String Bereich;

	// getter Bereich
	public String getBereich() {
		return Bereich;
	}

	// setter Bereich
	public void setBereich(String Bereich) {
		this.Bereich = Bereich;
	}

	// default constructor
	nichtWiMi() {
		super();
	}

	// constructor with a name
	nichtWiMi(String Name) {
		super(Name);
	}

	// constructor with a name and Personal Number
	nichtWiMi(String Name, int PersonalNummer) {
		super(Name, PersonalNummer);
	}

	// Full WiMi constructor
	nichtWiMi(String Name, int PersonalNummer, String Bereich) {
		super(Name, PersonalNummer);
		this.Bereich = Bereich;
	}

	// The non-WiMi specific Introduction method which overrides the Person.javaone
	@Override
	public String Introduction() {
		StringBuilder sb = new StringBuilder(baseIntro());
		sb = sb.append("\nIch bin nicht-wissenschaftliches Personal und arbeite im Bereich " + Bereich + ".");
		sb = sb.append("\n" + basePersonalIntro());
		return sb.toString();
	}

}
