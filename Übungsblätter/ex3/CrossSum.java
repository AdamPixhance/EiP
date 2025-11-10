public class CrossSum {

    public static int calculateCrossSum(int n) {
        int result = 0;

        String string_number = Integer.toString(n);
        
        for (int i = 0; i < string_number.length(); i++) {
        	result += Character.getNumericValue(string_number.charAt(i));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculateCrossSum(125));
    }
}
