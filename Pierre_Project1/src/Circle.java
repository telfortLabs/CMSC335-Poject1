/**
 * Project 1
 * 
 * @author Telfort
 * 
 * @created 25 Aug 2024
 * 
 * @summary This class will be used to create a circle.
 */

public class Circle implements TwoDimensionalShape {
	
	private double radius;							// Variable for the radius of a circle.
	private double area;							// Variable for the area of a circle.
	
	/**
	 * The constructor below takes one parameter
	 * @param radius which will be used
	 * to calculate the area of a circle.
	 */
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	/*
	 * Method to get the radius of a circle.
	 */
	
	public double getRadius() {
		return radius;
	}
	
	/*
	 * Method to get the dimension's type of a circle.
	 */
	
	@Override
	public void getDimension() {
		System.out.println("A Circle is a 2 dimensional shape object.");
	}
	
	/*
	 * Method to get the area of a circle.
	 * area = pi * radius raised to 2nd power.
	 */
	
	@Override
	public double getArea() {
		area = (int) (Math.PI * Math.pow(radius, 2));
		return area;
	}
}
