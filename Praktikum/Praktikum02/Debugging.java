public class Debugging {

	public static void main(String[] args) {
		String numbers[] = { "  40 ", "     50 ", "  60" };
		for (int i = 0; i < numbers.length; ++i) {
			System.out.println(getFromArrayAndClean(numbers, i));
		}
	}

	private static int getFromArrayAndClean(String[] numbers, int i) {
		return Integer.parseInt(numbers[i].trim());
	}
}
