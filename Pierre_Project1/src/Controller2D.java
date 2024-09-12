/**
 * Project 1
 * 
 * @author Telfort
 * 
 * @created 9 Sept 2024
 * 
 * @summary This class will be used to load the menu windows for 2D shapes.
 */

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Controller2D extends JFrame implements ActionListener {
	
	/*
	 * Created a frame, a panel and 
	 * other necessary variables to 
	 * load and display the app to the user.
	 */
	
	private JFrame frame = new JFrame();
	private JButton response = new JButton("Done");
	private String[] twoDimensional = {"","Circle","Rectangle","Square","Triangle"};
	private JComboBox<String> comboBox2D;
	private JLabel message = new JLabel();
	private JLabel selected = new JLabel();
	private JPanel panel = new JPanel();
	private TextField shapeArea = new TextField();
	private JLabel area = new JLabel();
	private JLabel loadImage = new JLabel();
	
	private String length, width, getRadius, base, height, sideLength, selectedShape;
	
	private Double convertedRadius, convertedLength, convertedWidth, convertedBase, 
	convertedHeight, convertedSide;
	
	private ImageIcon circleImage, squareImage, triangleImage, rectangleImage, blankImage;
	
	Controller2D () {
		
		/*
		 * Line 58 - 62 will load
		 * necessary images for the app.
		 */
		
		circleImage = new ImageIcon(getClass().getResource("circle.png"));
		squareImage = new ImageIcon(getClass().getResource("square.jpg"));
		triangleImage = new ImageIcon(getClass().getResource("triangle.jpg"));
		rectangleImage = new ImageIcon(getClass().getResource("rectangle.jpg"));
		blankImage = new ImageIcon(getClass().getResource("blank.jpg"));
		
		frame.setTitle("2D Drawings");																				/* Created a frame. */
		frame.add(panel);																							/* Added panel to the frame. */
		
		shapeArea.setEditable(false);																				/* Disable edit function of text Field. */
		shapeArea.setBounds(450, 35, 80, 20);																		/* Set frame location for text field. */
		area.setBounds(250, 35, 140, 20);																			/* Set frame location for label. */
		loadImage.setBounds(300, 120, 250, 250);																	/* Set frame location for image icon. */
		
		comboBox2D = new JComboBox<>(twoDimensional);																/* Added list of shapes to combo box. */
		comboBox2D.setBounds(25, 35, 140, 20);																		/* Set frame location for combo box. */
		
		response.setBounds(25, 160, 80, 20);																		/* Set frame location for button. */
		selected.setBounds(400, 15, 160, 20);																		/* Set frame location for label. */
		
		message.setText("Select shape from list below then click done");											/* Message to display to user. */
		message.setBounds(25, 15, 290, 20);																			/* Set frame location for label. */
		
		/*
		 * Added the buttons
		 * and label, and other 
		 * necessary components to the panel.
		 */
		
		panel.add(message);
		panel.add(comboBox2D);
		panel.add(selected);
		panel.add(response);
		panel.add(shapeArea);
		panel.add(area);
		panel.add(loadImage);
		
		/*
		 * The Action listener below will
		 * check user's choice then collect necessary
		 * inputs from the user to calculate the area
		 * of a shape then display and image of 
		 * the shape.
		 */
		
		response.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					if(comboBox2D.getSelectedItem().equals("Circle")) {
						
						loadImage.setIcon(blankImage);
						shapeArea.setText("");
						
						selectedShape = "You selected " + comboBox2D.getItemAt(comboBox2D.getSelectedIndex());
						selected.setText(selectedShape);
						
						getRadius = JOptionPane.showInputDialog(panel, "Enter Circle radius");						
						
						convertedRadius = Double.parseDouble(getRadius);
						
						Circle circle = new Circle(convertedRadius);
						
						area.setText("Area of Circle is");
						
						shapeArea.setText(String.valueOf(circle.getArea()));
						
						loadImage.setIcon(circleImage);
						System.out.println("Tasked completed successfully");
					}
					else if(comboBox2D.getSelectedItem().equals("Rectangle")) {
						
						loadImage.setIcon(blankImage);
						area.setText("Area of Rectangle is");
						shapeArea.setText("");
						
						selectedShape = "You selected " + comboBox2D.getItemAt(comboBox2D.getSelectedIndex());
						selected.setText(selectedShape);
						
						length = JOptionPane.showInputDialog(panel, "Enter Rectangle length");						
						
						width = JOptionPane.showInputDialog(panel, "Enter Rectangle width");
						
						convertedLength = Double.parseDouble(length);
						convertedWidth = Double.parseDouble(width);
						
						Rectangle rectangle = new Rectangle(convertedLength, convertedWidth);
						
						shapeArea.setText(String.valueOf(rectangle.getArea()));
						
						loadImage.setIcon(rectangleImage);
						System.out.println("Tasked completed successfully");
					}
					else if(comboBox2D.getSelectedItem().equals("Triangle")) {
						
						loadImage.setIcon(blankImage);
						area.setText("Area of Triangle is");
						shapeArea.setText("");
						
						selectedShape = "You selected " + comboBox2D.getItemAt(comboBox2D.getSelectedIndex());
						selected.setText(selectedShape);
						
						base = JOptionPane.showInputDialog(panel, "Enter Triangle base");
						
						height = JOptionPane.showInputDialog(panel, "Enter Triangle height");
						
						convertedBase = Double.parseDouble(base);
						convertedHeight = Double.parseDouble(height);
						
						Triangle triangle = new Triangle(convertedBase, convertedHeight);							
						
						shapeArea.setText(String.valueOf(triangle.getArea()));
						
						loadImage.setIcon(triangleImage);
						System.out.println("Tasked completed successfully");
						
					}
					else if(comboBox2D.getSelectedItem().equals("Square")) {
						
						loadImage.setIcon(blankImage);
						area.setText("Area of Square is");
						shapeArea.setText("");
						
						selectedShape = "You selected " + comboBox2D.getItemAt(comboBox2D.getSelectedIndex());
						selected.setText(selectedShape);
						
						sideLength = JOptionPane.showInputDialog(panel, "Enter Square side's length");
						
						convertedSide = Double.parseDouble(sideLength);
						
						Square square = new Square(convertedSide);
						
						shapeArea.setText(String.valueOf(square.getArea()));
						
						loadImage.setIcon(squareImage);
						System.out.println("Tasked completed successfully");
					}
					else {
						loadImage.setIcon(blankImage);
						area.setText("");
						shapeArea.setText("");
						
						selectedShape = "Sorry wrong answer " + comboBox2D.getItemAt(comboBox2D.getSelectedIndex());
						selected.setText(selectedShape);
						
						System.err.println("Sorry an error has occured");
					}
					
				} catch (Exception ex) {
					
					System.err.println("Invalid input, verify input then try again");
					JOptionPane.showMessageDialog(panel, "Invalid input, verify input then try again", "ERROR!!!", JOptionPane.ERROR_MESSAGE);
					
				}
			}
			
		});
		
		panel.setLayout(null);																							/* Setting layout for frame. */
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);															/* Set frame to close when the user click "x". */
		frame.setSize(600, 600);																						/* Set size for frame. */
		frame.setVisible(true);																							/* Making the frame visible. */
		
		/*
		 * Added Metal look and Feel
		 * appearance to the app.
		 */
		
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		SwingUtilities.updateComponentTreeUI(frame);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Exited the App");
		System.exit(0);																									/* System will terminate when the button exit is clicked. */
	}

}
