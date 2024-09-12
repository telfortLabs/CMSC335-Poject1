/**
 * Project 1
 * 
 * @author Telfort
 * 
 * @created 25 Aug 2024
 * 
 * @summary This class will be used to create a triangle.
 */

public class Triangle implements TwoDimensionalShape {
	private double base;								/* Variable for the base of a triangle. */
	private double height;								/* Variable for the height of a triangle. */ 
	private double area;								/* Variable for the area of a triangle. */
	
	/**
	 * The constructor below takes 2 parameters
	 * @param base
	 * @param height
	 * which will be used to calculate the area of a triangle.
	 */
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	/*
	 * Method to get the area of a triangle.
	 * area = (base * height) / 2
	 */
	
	@Override
	public double getArea() {
		area = (int) ((base * height) / 2);
		return area;
	}
	
	/*
	 * Method to get the dimension's type of a triangle.
	 */
	
	@Override
	public void getDimension() {
		System.out.println("A Triangle is a 2 dimensional shape object.");
	}
}
