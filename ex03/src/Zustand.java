public class Zustand {
	public static void main(String[] args) {
		int m = 3;
		double d = 2.2;
		d = m++ * d;
		int n = 15 * (int)d;
		if (d == m || true) {
			int k = 8;
			d = d + k;
			System.out.println(d);
		}
		d = n / 7;
		System.out.println("Ergebnis: " + d);
	}

}
