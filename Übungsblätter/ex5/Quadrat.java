
public class Quadrat {
	private int Seitenlaenge;
	private String Linienfarbe;
	private String Fuellfarbe;

	// Min Constructor
	public Quadrat(int Seitenlaenge) {
		this.setSeitenlaenge(Seitenlaenge);
	}

	// Full info Constructor
	public Quadrat(int Seitenlaenge, String Linienfarbe, String Fuellfarbe) {
		this.setSeitenlaenge(Seitenlaenge);
		this.Linienfarbe = Linienfarbe;
		this.Fuellfarbe = Fuellfarbe;
	}

	// getter for Füllfarbe
	public String getFuellfarbe() {
		return Fuellfarbe;
	}

	// setter for Füllfarbe
	public void setFuellfarbe(String fuellfarbe) {
		Fuellfarbe = fuellfarbe;
	}

	// getter for Linienfarbe
	public String getLinienfarbe() {
		return Linienfarbe;
	}

	// setter for Linienfarbe
	public void setLinienfarbe(String linienfarbe) {
		Linienfarbe = linienfarbe;
	}

	// getter for SeitenLänge
	public int getSeitenlaenge() {
		return Seitenlaenge;
	}

	// setter for SeitenLänge
	public void setSeitenlaenge(int seitenlaenge) {
		Seitenlaenge = seitenlaenge;
	}

	// Method "Flächeninhalt", which measures the area of a given Quadrat.
	public int Flaecheninhalt() {
		return Seitenlaenge * Seitenlaenge;
	}

}
