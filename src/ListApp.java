import arraylist.*;

/**
 * This is a class that is being used to test the applications of the project
 * 
 * @author Joshua Domzalski Programming Lab 3 Summer 2022
 *
 */
public class ListApp {

	public static void main(String[] args) {

		/**
		 * Creating objects of different types
		 */

		String S1 = new String("Sunday");
		String S2 = new String("Monday");
		String S3 = new String("Tuesday");
		String S4 = new String("Wednesday");
		String S5 = new String("Thursday");
		String S6 = new String("Friday");
		String S7 = new String("Saturday");

		Square s1 = new Square(4);
		Square s2 = new Square(8);
		Square s3 = new Square(10);
		Square s4 = new Square(5);
		Square s5 = new Square(12);
		Square s6 = new Square(50);
		Square s7 = new Square(30.5);
		Square s8 = new Square(100);
		Square s9 = new Square(0.5);
		Square s10 = new Square(7);

		PointThreeD p1 = new PointThreeD(2, 4, 6);
		PointThreeD p2 = new PointThreeD(4, 6, 10);
		PointThreeD p3 = new PointThreeD(6, 12, 18);
		PointThreeD p4 = new PointThreeD(10, 20, 30);

		/**
		 * Creating ArrayList with different type parameters
		 */

		ArrayList<String> stringList = new ArrayList<String>(7);
		ArrayList<Square> squareList = new ArrayList<Square>();
		ArrayList<PointThreeD> pointList = new ArrayList<PointThreeD>(4);

		/**
		 * Adding the items to their respective ArrayLists
		 */

		stringList.addItem(S1);
		stringList.addItem(S2);
		stringList.addItem(S3);
		stringList.addItem(S4);
		stringList.addItem(S5);
		stringList.addItem(S6);
		stringList.addItem(S7);

		squareList.addItem(s1);
		squareList.addItem(s2);
		squareList.addItem(s3);
		squareList.addItem(s4);
		squareList.addItem(s5);
		squareList.addItem(s6);
		squareList.addItem(s7);
		squareList.addItem(s8);
		squareList.addItem(s9);
		squareList.addItem(s10);

		pointList.addItem(p1);
		pointList.addItem(p2);
		pointList.addItem(p3);
		pointList.addItem(p4);

		/**
		 * Printing out all three ArrayLists
		 */

		System.out.println(stringList.toString());
		System.out.println(squareList.toString());
		System.out.println(pointList.toString());

	}// end main

}// end class
