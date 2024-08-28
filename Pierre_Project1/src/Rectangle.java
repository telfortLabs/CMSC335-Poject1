/**
 * Project 1
 * 
 * @author Telfort
 * 
 * @created 25 Aug 2024
 * 
 * @summary This class will be used to create a rectangle.
 */

public class Rectangle implements TwoDimensionalShape {
	private double length;								// Variable for the length of a rectangle.
	private double width;								// Variable for the width of a rectangle.
	private double area;								// Variable for the area of a rectangle.
	
	/**
	 * The constructor below takes 2 parameters
	 * @param length
	 * @param width
	 * which will be used to calculate
	 * the area of a rectangle.
	 */
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	/*
	 * Method to get the area of a rectangle.
	 * area = length * width.
	 */
	
	@Override
	public double getArea() {
		area = (int) (length * width);
		return area;
	}
	
	/*
	 * Method to get the dimension's type of a rectangle.
	 */
	
	@Override
	public void getDimension() {
		System.out.println("A Rectangle is a 2 dimensional shape object.");
	}
}
