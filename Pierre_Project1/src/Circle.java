/**
 * Project 1
 * 
 * @author Telfort
 * 
 * @created 25 Aug 2024
 * 
 * @summary This program is parent class for subclass such as Triangle, Circle, Square, Rectangle, Cube
 */

public class Circle extends TwoDimensionalShape {
	
	private double radius;
	
	public Circle(double radius) {
		super(2, Math.PI * Math.pow(radius, 2));
		this.radius = radius;
	}

	public double getRadius() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		 int area = (int) (Math.PI * Math.pow(radius, 2));
		return area;
	}
	
}
