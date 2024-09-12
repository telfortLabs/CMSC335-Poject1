/**
 * Project 1
 * 
 * @author Telfort
 * 
 * @created 25 Aug 2024
 * 
 * @summary This class will be used to create a cube.
 */

public class Cube implements ThreeDimensionalShape {
	private double sidelength;							/* Variable for the side's length of a cube. */
	private double volume;								/* Variable for the volume of a cube. */
	
	/**
	 * The constructor below takes one parameter
	 * @param sideLength
	 * which will be used to calculate the 
	 * volume of a cube.
	 */
	
	public Cube(double sideLength) {
		this.sidelength = sideLength;
	}
	
	/*
	 * Method to get the side'length of a cube.
	 */
	
	public double getSidelength() {
		return sidelength;
	}
	
	/*
	 * Method to get the volume of a cube.
	 * volume = sideLength * sideLength * sideLength.
	 */
	
	@Override
	public double getVolume() {
		volume = (int) (Math.pow(sidelength, 3));
		return volume;
	}
	
	/*
	 * Method to get the dimension's type of a cube.
	 */
	
	@Override
	public void getDimension() {
		System.out.println("A Cube is a 3 dimensional shape object.");
	}
}
