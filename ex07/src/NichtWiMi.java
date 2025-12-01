
public class NichtWiMi extends Personal {
	private String bereich;

	// getter bereich
	public String getbereich() {
		return bereich;
	}

	// setter bereich
	public void setbereich(String bereich) {
		this.bereich = bereich;
	}

	// default constructor
	NichtWiMi() {
		super();
	}

	// constructor with a name
	NichtWiMi(String name) {
		super(name);
	}

	// constructor with a name and Personal Number
	NichtWiMi(String name, int personalNummer) {
		super(name, personalNummer);
	}

	// Full WiMi constructor
	NichtWiMi(String name, int personalNummer, String bereich) {
		super(name, personalNummer);
		this.bereich = bereich;
	}

	// The non-WiMi specific Introduction method which overrides the Person.javaone
	@Override
	public String introduction() {
		StringBuilder sb = new StringBuilder(baseIntro());
		sb = sb.append("\nIch bin nicht-wissenschaftliches Personal und arbeite im bereich " + bereich + ".");
		sb = sb.append("\n" + basePersonalIntro());
		return sb.toString();
	}

}
