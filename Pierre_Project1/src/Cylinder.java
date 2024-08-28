/**
 * Project 1
 * 
 * @author Telfort
 * 
 * @created 25 Aug 2024
 * 
 * @summary This class will be used to create a cylinder.
 */

public class Cylinder implements ThreeDimensionalShape {
	private double radius;									// Variable for the radius of a cylinder.
	private double height;									// Variable for the height of a cylinder.
	private double volume;									// Variable for the volume of a cylinder.
	
	/**
	 * The constructor below takes 2 parameters
	 * @param radius
	 * @param height
	 * which will be used to calculate the 
	 * volume of a cylinder.
	 */
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	/*
	 * Method to get the radius of a cylinder.
	 */
	
	public double getRadius() {
		return radius;
	}
	
	/*
	 * Method to get the height of a cylinder.
	 */
	
	public double getHeight() {
		return height;
	}
	
	/*
	 * Method to get the volume of a cylinder.
	 * volume = pi * radius raised to 2nd power * height.
	 */
	
	@Override
	public double getVolume() {
		volume = (int) (Math.PI * Math.pow(radius, 2) * height);
		return volume;
	}
	
	/*
	 * Method to get the dimension's type of a cylinder.
	 */
	
	@Override
	public void getDimension() {
		System.out.println("A Cylinder is a 3 dimensional shape object.");		
	}
}
