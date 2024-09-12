/**
 * Project 1
 * 
 * @author Telfort
 * 
 * @created 25 Aug 2024
 * 
 * @summary This class will be used to create a torus.
 */

public class Torus implements ThreeDimensionalShape {
	
	private double majorRadius;									/* Variable for the major radius of a torus. */
	private double minorRadius;									/* Variable for the minor radius of a torus. */
	private double volume;										/* Variable for the volume of a torus. */
	
	/**
	 * The constructor below takes 2 parameters
	 * @param majorRadius
	 * @param minorRadius
	 * that will be used to calculate
	 * the volume of a torus.
	 */
	
	public Torus (double majorRadius, double minorRadius) {
		this.majorRadius = majorRadius;
		this.minorRadius = minorRadius;
	}
	
	/*
	 * Method to get the volume of a torus.
	 * volume = 2 * pi raised to 2nd power * major radius * minor radius raised to 2nd power.
	 */
	
	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		volume = (int) (2 * Math.pow(Math.PI, 2) * majorRadius * Math.pow(minorRadius, 2));
		return volume;
	}
	
	/*
	 * Method to get the dimension's type of a torus.
	 */
	
	@Override
	public void getDimension() {
		System.out.println("A torus is a 3 dimensional shape object.");	
	}
}
