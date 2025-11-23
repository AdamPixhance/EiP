
public class Triangle extends Shape {
	private int height;

	public Triangle() {
		this.height = 3;
	}

	public Triangle(int height) {
		this.height = height;
	}

	public void printShape() {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < height; i++) {
			int spaces = height - i;
			int stars = 2 * i + 1;
			sb.append(" ".repeat(spaces)).append("*".repeat(stars)).append("\n");
		}

		System.out.print(sb.toString());
	}
}