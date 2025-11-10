import java.util.Arrays;

public class GetterSetter {

	public static void main(String[] args) {
		EineKlasse obj = new EineKlasse();

		int m = 1;
		obj.setZahl(m);
		System.out.println("zahl: " + obj.getZahl());
		m = 100;
		System.out.println("zahl: " + obj.getZahl());

		char bs = 'a';
		obj.setBuchstabe(bs);
		System.out.println("buchstabe: " + obj.getBuchstabe());
		bs = 'Z';
		System.out.println("buchstabe: " + obj.getBuchstabe());

		String zk = "abc";
		obj.setZeichenkette(zk);
		System.out.println("zeichenkette: " + obj.getZeichenkette());
		zk = "XYZ";
		System.out.println("zeichenkette: " + obj.getZeichenkette());

		int[] array = { 1, 2 };
		obj.setZahlenArray(array); // obj.setZahlenArray2
		System.out.println("zahlenFeld: " + Arrays.toString(obj.getZahlenArray())); // getZahlenArray2
		array[0] = 100;
		System.out.println("zahlenFeld: " + Arrays.toString(obj.getZahlenArray())); // getZahlenArray2
	}
}
