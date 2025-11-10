
public class FizzBuzzAdam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 100; ++i) {
			if (i % 3 == 0) {
				System.out.print("fizz");
			}
			if (i % 5 == 0) {
				System.out.print("buzz");
			}
			if (i % 3 == 0 || i % 5 == 0) {
				System.out.println();
				continue;
			}
			System.out.println(i);

		}

	}

}
