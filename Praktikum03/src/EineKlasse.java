public class EineKlasse {
	private int zahl;
	private char buchstabe;
	private String zeichenkette;
	private int[] zahlenArray;

	public int getZahl() {
		return zahl;
	}

	public void setZahl(int n) {
		zahl = n;
	}

	public char getBuchstabe() {
		return buchstabe;
	}

	public void setBuchstabe(char c) {
		buchstabe = c;
	}

	public void setZeichenkette(String zk) {
		zeichenkette = zk;
	}

	public String getZeichenkette() {
		return zeichenkette;
	}

	public int[] getZahlenArray() {
		return zahlenArray;
	}

	public void setZahlenArray(int[] za) {
		zahlenArray = za;
	}

	public int[] getZahlenArray2() {
		return zahlenArray.clone();
	}

	public void setZahlenArray2(int[] za) {
		zahlenArray = za.clone();
	}
}
