
public class Modelling {

	public static void main(String[] args) {
		Professor Maria = new Professor("Maria Weber", 142, "Theoretische Informatik");
		WiMi Theodor = new WiMi("Theodor Grün", 816, Maria);
		Student Anna = new Student("Anna Schmidt", 10815, "Medieninformatik");
		nichtWiMi Sabine = new nichtWiMi("Sabine Koch", 112, "IT-Support");

		Maria.printIntro();
		Theodor.printIntro();
		Anna.printIntro();
		Sabine.printIntro();

	}

}
