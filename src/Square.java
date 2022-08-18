/**
 * This is a class used to represent Square
 * 
 * @author Joshua Domzalski Programming Lab 3 Summer 2022
 *
 */
public class Square {
	private double side;
	// end variables

	public Square() {
		this.side = 0;
	}// end empty-argument constructor

	public Square(double s) {
		this.side = s;
	}// end preferred constructor

	/**
	 * Method to return the area of a square
	 * 
	 * @return
	 */
	public double getArea() {
		double area = side * side;
		return area;
	}

	/**
	 * toString method
	 */
	@Override
	public String toString() {
		return "Square [side=" + side + ", getArea()=" + getArea() + "]";
	}

}// end class
