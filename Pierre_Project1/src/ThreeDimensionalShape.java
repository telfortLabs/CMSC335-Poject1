/**
 * Project 1
 * 
 * @author Telfort
 * 
 * @created 25 Aug 2024
 * 
 * @summary This program is parent class for subclass such as Triangle, Circle, Square, Rectangle, Cube
 */

public class ThreeDimensionalShape extends Shape {
	
	public double volume;
	
	public ThreeDimensionalShape(int numberOfSides, double volume) {
		super(numberOfSides);
		this.volume = volume;
	}

	public double getVolume() {
		return volume;
	}
}
