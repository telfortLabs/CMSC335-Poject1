import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Project 1
 * 
 * @author Telfort
 * 
 * @created 25 Aug 2024
 * 
 * @summary This class will display a menu to the user. The operation conducted will be base on the 
 * user's choice.
 */

public class Shape_App {
	
	private static Scanner user_input = new Scanner(System.in);												//Create scanner object for user input.
	private static int calc_option = 0;																		//Create variables to control loop.
	private static String response = "";																	//Create variables for user response.
	private static double radius, radius2, length, width, base, height, sideLength;							//Create variables for use in program.
	private static LocalDateTime today = LocalDateTime.now();												//Create variable for date
	private static DateTimeFormatter formatPattern = DateTimeFormatter.ofPattern("MMM-dd-yy hh:mm a");		//Create variable to format the date

	public static void main(String[] args) {
	
		
		//Do/While loop to execute program as long as user doesn't choose to exit the program
				System.out.println("Welcome to the Java OO Shapes Program!");
				
				try {
					do {
						
						//call method for menu prompt
						displayMenu();
						
						//Create statement for user input for switch execution
						System.out.print("\nEnter your selection: ");
						calc_option = user_input.nextInt();
						
						switch(calc_option) {
						case 10:
							System.out.print("\nThanks for using the program. Today is ");
							System.out.print(today.format(formatPattern));
							break;
						case 1:
							//Call method to construct Circle
							constructCircle();
							break;
						case 2:
							//Call method to construct Rectangle
							constructRectangle();
							break;
						case 3:
							//Call method to construct Square
							constructSquare(); 
							break;
						case 4:
							//Call method to construct Triangle
							constructTriangle(); 
							break;
						case 5:
							//Call method to construct Sphere
							constructSphere(); 
							break;
						case 6:
							//Call method to construct Cube
							constructCube(); 
							break;
						case 7:
							//Call method to construct Cone
							constructCone(); 
							break;
						case 8:
							//Call method to construct Cylinder
							constructCylinder(); 
							break;
						case 9:
							//Call method to construct Torus
							constructTorus(); 
							break;
						default:
							//Default message when an error occurs
							System.out.println("\nAn unknown error has occurred. \n");
						}
						
					} while (calc_option !=10);
					
				} catch (InputMismatchException e) {
		            System.out.println("Invalid choice, exiting program.");
		        }
				
				user_input.close();

	}
	
	/*
	 * Method below will display a menu to the user.
	 */
	
	public static void displayMenu () {
		System.out.println("\nPlease make a selection (use the corresponding numerical value): ");
		System.out.println("1.  Construct a Circle ");
		System.out.println("2.  Construct a Rectangle ");
		System.out.println("3.  Construct a Square ");
		System.out.println("4.  Construct a Triangle ");
		System.out.println("5.  Construct a Sphere ");
		System.out.println("6.  Construct a Cube ");
		System.out.println("7.  Construct a Cone ");
		System.out.println("8.  Construct a Cylinder ");
		System.out.println("9.  Construct a Torus ");
		System.out.println("10. Exit the program"); 
	}
	
	/*
	 * Method below will create a circle.
	 */
	
	public static void constructCircle() {
		System.out.println("\nYou have selected a Circle\n");
		System.out.print("Enter the radius of the circle: ");
		 radius = user_input.nextDouble();
		Circle circle = new Circle(radius);
		System.out.println("\nThe area of the Circle is " + circle.getArea()+ "\n");
		System.out.print("Would you like to continue? (y/n): ");
		response = user_input.next();
		if (response.equalsIgnoreCase("n")) {
			calc_option = 10;
			System.out.print("\nThanks for using the program. Today is ");
			System.out.print(today.format(formatPattern));
		}
	}
	
	/*
	 * Method below will create a rectangle.
	 */
	
	public static void constructRectangle() {
		System.out.println("\nYou have selected a Rectangle\n");
		System.out.print("Enter the length of the Rectangle: ");
		length = user_input.nextDouble();
		System.out.print("Enter the width of the rRectangle: ");
		width = user_input.nextDouble();
		 Rectangle rectangle = new Rectangle(length, width);
		 System.out.println("\nThe area of the Rectangle is " + rectangle.getArea()+ "\n");
		 System.out.print("Would you like to continue? (y/n): ");
		 response = user_input.next();
		 if (response.equalsIgnoreCase("n")) {
				calc_option = 10;
				System.out.print("\nThanks for using the program. Today is ");
				System.out.print(today.format(formatPattern));
			}
	}
	
	/*
	 * Method below will create a square.
	 */
	
	public static void constructSquare() {
		System.out.println("\nYou have selected a Square\n");
		System.out.print("Enter the length of the side of the Square: ");
		sideLength = user_input.nextDouble();
		Square square = new Square(sideLength);
		 System.out.println("\nThe area of the Square is " + square.getArea()+ "\n");
		 System.out.print("Would you like to continue? (y/n): ");
		 response = user_input.next();
		 if (response.equalsIgnoreCase("n")) {
				calc_option = 10;
				System.out.print("\nThanks for using the program. Today is ");
				System.out.print(today.format(formatPattern));
			}
	}
	
	/*
	 * Method below will create a triangle.
	 */
	
	public static void constructTriangle() {
		System.out.println("\nYou have selected a Triangle\n");
		System.out.print("Enter the base of the Triangle: ");
		base = user_input.nextDouble();
		System.out.print("Enter the height of the Triangle: ");
		height = user_input.nextDouble();
		 Triangle triangle = new Triangle(base, height);
		 System.out.println("\nThe area of the Triangle is " + triangle.getArea()+ "\n");
		 System.out.print("Would you like to continue? (y/n): ");
		 response = user_input.next();
		 if (response.equalsIgnoreCase("n")) {
				calc_option = 10;
				System.out.print("\nThanks for using the program. Today is ");
				System.out.print(today.format(formatPattern));
			}
	}
	
	/*
	 * Method below will create a sphere.
	 */
	
	public static void constructSphere() {
		System.out.println("\nYou have selected a Sphere\n");
		System.out.print("Enter the radius of the Sphere: ");
		radius = user_input.nextDouble();
		Sphere sphere = new Sphere(radius);
		System.out.println("\nThe volume of the Sphere is " + sphere.getVolume()+ "\n");
		System.out.print("Would you like to continue? (y/n): ");
		response = user_input.next();
		if (response.equalsIgnoreCase("n")) {
			calc_option = 10;
			System.out.print("\nThanks for using the program. Today is ");
			System.out.print(today.format(formatPattern));
		}
	}
	
	/*
	 * Method below will create a cube.
	 */
	
	public static void constructCube() {
		System.out.println("\nYou have selected a Cube\n");
		System.out.print("Enter the side's length of the Cube: ");
		sideLength = user_input.nextDouble();
		Cube cube = new Cube(sideLength);
		System.out.println("\nThe volume of the Cube is " + cube.getVolume()+ "\n");
		System.out.print("Would you like to continue? (y/n): ");
		response = user_input.next();
		if (response.equalsIgnoreCase("n")) {
			calc_option = 10;
			System.out.print("\nThanks for using the program. Today is ");
			System.out.print(today.format(formatPattern));
		}
	}
	
	/*
	 * Method below will create a cone.
	 */
	
	public static void constructCone() {
		System.out.println("\nYou have selected a Cone\n");
		System.out.print("Enter the radius of the Cone: ");
		radius = user_input.nextDouble();
		System.out.print("Enter the height of the Cone: ");
		height = user_input.nextDouble();
		Cone cone = new Cone(radius, height);
		System.out.println("\nThe volume of the Cone is " + cone.getVolume()+ "\n");
		System.out.print("Would you like to continue? (y/n): ");
		response = user_input.next();
		if (response.equalsIgnoreCase("n")) {
			calc_option = 10;
			System.out.print("\nThanks for using the program. Today is ");
			System.out.print(today.format(formatPattern));
		}
	}
	
	/*
	 * Method below will create a cylinder.
	 */
	
	public static void constructCylinder() {
		System.out.println("\nYou have selected a Cylinder\n");
		System.out.print("Enter the radius of the Cylinder: ");
		radius = user_input.nextDouble();
		System.out.print("Enter the height of the Cylinder: ");
		height = user_input.nextDouble();
		Cylinder cylinder = new Cylinder(radius, height);
		System.out.println("\nThe volume of the Cylinder is " + cylinder.getVolume()+ "\n");
		System.out.print("Would you like to continue? (y/n): ");
		response = user_input.next();
		if (response.equalsIgnoreCase("n")) {
			calc_option = 10;
			System.out.print("\nThanks for using the program. Today is ");
			System.out.print(today.format(formatPattern));
		}
	}
	/*
	 * Method below will create a torus.
	 */
	public static void constructTorus() {
		System.out.println("\nYou have selected a Torus\n");
		System.out.print("Enter the outer radius of the Torus: ");
		radius = user_input.nextDouble();
		System.out.print("Enter the inner radius of the Torus: ");
		radius2 = user_input.nextDouble();
		Torus torus = new Torus(radius, radius2);
		System.out.println("\nThe volume of the Torus is " + torus.getVolume()+ "\n");
		System.out.print("Would you like to continue? (y/n): ");
		response = user_input.next();
		if (response.equalsIgnoreCase("n")) {
			calc_option = 10;
			System.out.print("\nThanks for using the program. Today is ");
			System.out.print(today.format(formatPattern));
		}
	}
}













