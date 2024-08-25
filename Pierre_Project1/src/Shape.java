/**
 * Project 1
 * 
 * @author Telfort
 * 
 * @created 25 Aug 2024
 * 
 * @summary This program is parent class for subclass such as Triangle, Circle, Square, Rectangle, Cube
 */

public class Shape {
	
	private int numberOfSides;									// variable for number of sides in a shape.
	
	/**
	 * The constructor below take one parameter
	 * @param numberOfSides to create a shape.
	 */
	
	public Shape(int numberOfSides) {
		this.numberOfSides = numberOfSides;
	}
	
	/*
	 * The getter below will return
	 * the number of sides in a shape.
	 */
	
	public int getNumberOfSides() {
		return numberOfSides;
	}
}
