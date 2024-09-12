/**
 * Project 1
 * 
 * @author Telfort
 * 
 * @created 25 Aug 2024
 * 
 * @summary This class will be used to create a square.
 */

public class Square implements TwoDimensionalShape {
	private double sideLength;							  			/* Variable for the length of the side of a square. */
	private double area;										 	/* Variable for the area of a square. */
	
	/**
	 * The constructor below takes one parameter
	 * @param sideLength
	 * which will be used to calculate the area
	 * of a square.
	 */
	
	public Square(double sideLength) {
		this.sideLength = sideLength;
	}
	
	/*
	 * Method to get the area of a square.
	 * area = sideLength * sideLength
	 */
	
	@Override
	public double getArea() {
		area = (int) (Math.pow(sideLength, 2));
		return area;
	}
	
	/*
	 * Method to get the dimension's type of a square.
	 */
	
	@Override
	public void getDimension() {
		System.out.println("A Square is a 2 dimensional shape object.");
	}
}
