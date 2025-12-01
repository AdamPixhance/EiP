
public class FunWithStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getQuotedText("EiP macht Spaß! \"Und Strings sind toll!"));
	}

	static public int countWords(String text) {
		int result = 1;
		if (text.isBlank()) {
			return 0;
		}
		for (int i = 0; i < text.length(); i++) {
			if (Character.isSpaceChar(text.charAt(i))) {
				result++;
			}
		}
		if (result == 0) {
			return 1;
		}
		return result;
	}

	static public String getQuotedText(String text) {
		for (int i = 0; i < text.length() - 1; i++) {
			if (text.charAt(i) == '"') {
				int firstMark = i;
				for (int x = i + 1; x < text.length(); x++) {
					if (text.charAt(x) == '"') {
						int secondMark = x;
						if (secondMark == firstMark + 1) {
							return "";
						}
						if (secondMark > firstMark + 1) {
							return text.substring(firstMark + 1, secondMark);
						}
						return "" + text.charAt(firstMark + 1);
					}
				}
				break;
			}
		}
		return null;

	}

	static public String commonPrefix(String text1, String text2) {
		String result = "";
		int minLen = 0;
		if (text1.length() <= text2.length()) {
			minLen = text1.length();
		} else {
			minLen = text2.length();
		}
		for (int i = 0; i < minLen; i++) {
			if (Character.toLowerCase(text1.charAt(i)) == Character.toLowerCase(text2.charAt(i))) {
				result += text1.charAt(i);
				continue;
			}
			break;
		}
		return result;
	}

}
