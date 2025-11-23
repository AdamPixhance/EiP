
public class Line extends Shape {
	private int lenght;

	public Line() {
		this.lenght = 8;
	}

	public Line(int lenght) {
		this.lenght = lenght;
	}

	public void printShape() {
		for (int i = 0; i < lenght; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
