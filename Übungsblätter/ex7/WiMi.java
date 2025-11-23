
public class WiMi extends Personal {
	private Professor unterProf;
	private String forschungsgebiet;

	// getter method for the UnterProf
	public Professor getUnterProf() {
		return unterProf;
	}

	// setter method for the UnterProf
	public void setUnterProf(Professor unterProf) {
		this.unterProf = unterProf;
		this.forschungsgebiet = unterProf.getforschungsgebiet();
	}

	// getter method for the forschungsgebiet
	public String getforschungsgebiet() {
		return forschungsgebiet;
	}

	// default constructor
	WiMi() {
		super();
	}

	// constructor with a name
	WiMi(String name) {
		super(name);
	}

	// constructor with a name and Personal Number
	WiMi(String name, int personalNummer) {
		super(name, personalNummer);
	}

	// full WiMi Constructor
	WiMi(String name, int personalNummer, Professor unterProf) {
		super(name, personalNummer);
		this.unterProf = unterProf;
		this.forschungsgebiet = unterProf.getforschungsgebiet();
	}

	// The WiMi specific Introduction method which overrides the Person.java one
	@Override
	public String introduction() {
		StringBuilder sb = new StringBuilder(baseIntro());
		sb = sb.append("\nIch bin WiMi bei Professor " + unterProf.getname() + " im forschungsgebiet " + forschungsgebiet + ".");
		sb = sb.append("\n" + basePersonalIntro());
		return sb.toString();
	}

}
