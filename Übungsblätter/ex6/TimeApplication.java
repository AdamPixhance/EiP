
public class TimeApplication {

	public static void main(String[] args) {
		// this class is just for debugging the Time.java class
		Time test1 = new Time(12,12,12);
		Time test2 = new Time(1,1,1);
		System.out.println(test1.differenceTo(test2));
		
		Time test3 = new Time(3,45,42);
		Time test4 = new Time(13,14,15);
		System.out.println(test3.differenceTo(test4));
		
		Time test5 = new Time(25,12,3);
		Time test6 = new Time(14,14,15);
		System.out.println(test5.differenceTo(test6));
		
		Time test7 = new Time(23,55,4);
		Time test8 = new Time(5,23,55);
		System.out.println(test7.differenceTo(test8));

	}

}
