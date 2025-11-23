
public class TriangleApplication {

	public static void main(String[] args) {
		// this whole .java class, is used to debug the code in Point, Pythagoras and
		// Triangle java files that are in the ex6 project
		Point a = new Point(0, 0);
		Point b = new Point(0, 4);
		Point c = new Point(4, 0);
		oldTriangle test = new oldTriangle(a, b, c);

		System.out.println("is Right gives back the value: " + test.isRight());
		System.out.println("is obtuse gives back the value: " + test.isObtuse());

	}

}
