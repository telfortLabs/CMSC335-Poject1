/**
 * Project 1
 * 
 * @author Telfort
 * 
 * @created 25 Aug 2024
 * 
 * @summary This class will be used to create a sphere.
 */

public class Sphere implements ThreeDimensionalShape {
	private double radius;												/* Variable for the radius of a sphere. */
	private double volume;												/* Variable for the volume of a sphere. */
	
	/**
	 * The constructor below takes one parameter
	 * @param radius
	 * which will be used to calculate
	 * the volume of a sphere.
	 */
	
	public Sphere(double radius) {
		this.radius = radius;
	}
	
	/*
	 * Method to get the volume of a sphere.
	 * volume = 4/3 * pi * radius raised to 3rd power.
	 */
	
	@Override
	public double getVolume() {
		volume = (int) ((4 / 3) * (Math.PI * Math.pow(radius, 3)));
		return volume;
	}
	
	/*
	 * Method to get the dimension's type of a sphere.
	 */
	
	@Override
	public void getDimension() {
		System.out.println("A Sphere is a 3 dimensional shape object.");
	}
}
