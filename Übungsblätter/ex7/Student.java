
public class Student extends Person {
	private int Martikelnummer;
	private String Studiengang;

	// get Martikelnummer Method
	public int getMartikelnummer() {
		return Martikelnummer;
	}

	// set Martikelnummer Method
	public void setMartikelnummer(int martikelnummer) {
		Martikelnummer = martikelnummer;
	}

	// get Studiengang Method
	public String getStudiengang() {
		return Studiengang;
	}

	// set Studiengang Method
	public void setStudiengang(String studiengang) {
		Studiengang = studiengang;
	}

	// Default Constructor for Students with just name
	Student() {
		super();
	};

	// Default Constructor for Students with just name
	Student(String Name) {
		super(Name);
	}

	// Constructor for Students with full info
	Student(String Name, int Martikelnummer, String Studiengang) {
		super(Name);
		this.Martikelnummer = Martikelnummer;
		this.Studiengang = Studiengang;
	}

	// The student specific Introduction method which overrides the Person.java one
	@Override
	public String Introduction() {
		StringBuilder sb = new StringBuilder(baseIntro());
		sb = sb.append("\nIch bin Student im " + Studiengang + " und meine Matrikelnummer ist " + Martikelnummer + ".");
		return sb.toString();
	}
}
