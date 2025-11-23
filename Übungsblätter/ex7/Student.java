
public class Student extends Person {
	private int matrikelnummer;
	private String studiengang;

	// get matrikelnummer Method
	public int getmatrikelnummer() {
		return matrikelnummer;
	}

	// set matrikelnummer Method
	public void setmatrikelnummer(int matrikelnummer) {
		this.matrikelnummer = matrikelnummer;
	}

	// get studiengang Method
	public String getstudiengang() {
		return studiengang;
	}

	// set studiengang Method
	public void setstudiengang(String studiengang) {
		this.studiengang = studiengang;
	}

	// Default Constructor for Students with just name
	Student() {
		super();
	};

	// Default Constructor for Students with just name
	Student(String name) {
		super(name);
	}

	// Constructor for Students with full info
	Student(String name, int matrikelnummer, String studiengang) {
		super(name);
		this.matrikelnummer = matrikelnummer;
		this.studiengang = studiengang;
	}

	// The student specific Introduction method which overrides the Person.java one
	@Override
	public String introduction() {
		StringBuilder sb = new StringBuilder(baseIntro());
		sb = sb.append("\nIch bin Student im " + studiengang + " und meine Matrikelnummer ist " + matrikelnummer + ".");
		return sb.toString();
	}
}
