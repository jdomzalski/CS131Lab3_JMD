
/**
 * This is a class that represents our PointThreeD
 * 
 * @author Joshua Domzalski Programming Lab 3 Summer 2022
 */
public class PointThreeD {
	private double xPoint;
	private double yPoint;
	private double zPoint;
	// end variables

	public PointThreeD() {
		this.xPoint = 0;
		this.yPoint = 0;
		this.zPoint = 0;
	}// end empty-argument constructor

	public PointThreeD(double x, double y, double z) {
		this.xPoint = x;
		this.yPoint = y;
		this.zPoint = z;
	}// end preferred constructor

	/**
	 * toSting method
	 */
	@Override
	public String toString() {
		return "PointThreeD [xPoint=" + xPoint + ", yPoint=" + yPoint + ", zPoint=" + zPoint + "]";
	}

}// end class
