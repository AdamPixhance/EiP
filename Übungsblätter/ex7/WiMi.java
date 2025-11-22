
public class WiMi extends Personal {
	private Professor unterProf;
	private String Forschungsgebiet;

	// getter method for the UnterProf
	public Professor getUnterProf() {
		return unterProf;
	}

	// setter method for the UnterProf
	public void setUnterProf(Professor unterProf) {
		this.unterProf = unterProf;
		this.Forschungsgebiet = unterProf.getForschungsgebiet();
	}

	// getter method for the Forschungsgebiet
	public String getForschungsgebiet() {
		return Forschungsgebiet;
	}

	// default constructor
	WiMi() {
		super();
	}

	// constructor with a name
	WiMi(String Name) {
		super(Name);
	}

	// constructor with a name and Personal Number
	WiMi(String Name, int PersonalNummer) {
		super(Name, PersonalNummer);
	}

	// full WiMi Constructor
	WiMi(String Name, int PersonalNummer, Professor unterProf) {
		super(Name, PersonalNummer);
		this.unterProf = unterProf;
		this.Forschungsgebiet = unterProf.getForschungsgebiet();
	}

	// The WiMi specific Introduction method which overrides the Person.java one
	@Override
	public String Introduction() {
		StringBuilder sb = new StringBuilder(baseIntro());
		sb = sb.append("\nIch bin WiMi bei Professor " + unterProf.getName() + " im Forschungsgebiet " + Forschungsgebiet + ".");
		sb = sb.append("\n" + basePersonalIntro());
		return sb.toString();
	}

}
