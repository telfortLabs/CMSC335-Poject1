
public class TwoDimensionalShape extends Shape {
	
	private double area;
	
	public TwoDimensionalShape(int numberOfSides, double area) {
		super(numberOfSides);
		this.area = area;
	}
	
	public double getArea() {
		return area;
	}
}
