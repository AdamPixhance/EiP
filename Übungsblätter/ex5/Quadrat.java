
public class Quadrat {
	private int Seitenlaenge;
	private String Linienfarbe;
	private String Fuellfarbe;

	// Min Constructor
	public Quadrat(int Seitenlaenge) {
		this.setSeitenlaenge(Seitenlaenge);

		// Full info Constructor
	}

	public Quadrat(int Seitenlaenge, String Linienfarbe, String Fuellfarbe) {
		this.setSeitenlaenge(Seitenlaenge);
		this.Linienfarbe = Linienfarbe;
		this.Fuellfarbe = Fuellfarbe;

		// getter & setter für Seitenlänge
	}

	// Flacheninhalt methode
	public int Flaecheninhalt() {
		return Seitenlaenge * Seitenlaenge;
	}

	// getter & setter für Füllfarbe
	public String getFuellfarbe() {
		return Fuellfarbe;
	}

	public void getFuellfarbe(String fuellfarbe) {
		Fuellfarbe = fuellfarbe;
	}

	// getter & setter für Linienfarbe
	public String getLinienfarbe() {
		return Linienfarbe;
	}

	public int getSeitenlaenge() {
		return Seitenlaenge;
	}

	public void setLinienfarbe(String linienfarbe) {
		Linienfarbe = linienfarbe;
	}

	public void setSeitenlaenge(int seitenlaenge) {
		Seitenlaenge = seitenlaenge;
	}

}
