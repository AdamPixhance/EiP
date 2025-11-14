
public class TriangleApplication {

	public static void main(String[] args) {
		// this whole .java class, is used to debug the code in Point, Pythagoras and Triangle java files that are in the ex6 project
		Point a = new Point(0,0);
		Point b = new Point(0,4);
		Point c = new Point(4,0);
		Triangle test = new Triangle(a,b,c);
		
		System.out.println(test.isRight());
		System.out.println(test.isObtuse());

	}

}
