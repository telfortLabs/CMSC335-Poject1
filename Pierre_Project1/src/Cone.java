/**
 * Project 1
 * 
 * @author Telfort
 * 
 * @created 25 Aug 2024
 * 
 * @summary This class will be used to create a cone.
 */

public class Cone implements ThreeDimensionalShape {
	private double radius;									/* Variable for the radius of a cone. */
	private double height;									/* Variable for the height of a cone. */
	private double volume;									/* Variable for the volume of a cone. */
	
	/**
	 * The constructor below takes 2 parameters
	 * @param radius
	 * @param height
	 * which will be used to calculate the 
	 * volume of a cone.
	 */
	
	public Cone(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	/*
	 * Method to get the radius of a cone.
	 */
	
	public double getRadius() {
		return radius;
	}
	
	/*
	 * Method to get the height of a cone.
	 */
	
	public double getHeight() {
		return height;
	}
	
	/*
	 * Method to get the volume of a cone.
	 * volume = (pi * radius raised to 2nd power * height) / 3.
	 */
	
	@Override
	public double getVolume() {
		
		volume = (int) ((Math.PI * Math.pow(radius, 2) * height) / 3);
		return volume;
	}
	
	/*
	 * Method to get the dimension's type of a cone.
	 */
	
	@Override
	public void getDimension() {
		System.out.println("A Cone is a 3 dimensional shape object.");
	}
}
