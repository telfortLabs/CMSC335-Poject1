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
	
	JFrame frame = new JFrame();
	JButton response = new JButton("Done");
	String[] twoDimensional = {"","Circle","Rectangle","Square","Triangle"};
	JComboBox<String> comboBox2D;
	JLabel message = new JLabel();
	JLabel selected = new JLabel();
	JPanel panel = new JPanel();
	TextField userInput = new TextField();
	JLabel area = new JLabel();
	JLabel loadImage = new JLabel();
	
	String length, width, getRadius, base, height, sideLength, selectedShape;
	
	
	Double convertedRadius, convertedLength, convertedWidth, convertedBase, 
	convertedHeight, convertedSide;
	
	
	Controller2D () {
		
		ImageIcon circleImage = new ImageIcon(getClass().getResource("circle.png"));
		ImageIcon squareImage = new ImageIcon(getClass().getResource("square.jpg"));
		ImageIcon triangleImage = new ImageIcon(getClass().getResource("triangle.jpg"));
		ImageIcon rectangleImage = new ImageIcon(getClass().getResource("rectangle.jpg"));
		ImageIcon blankImage = new ImageIcon(getClass().getResource("blank.jpg"));
		
		// creating second frame
		frame.setTitle("2D Drawings");
		frame.add(panel);
		
		userInput.setBounds(450, 35, 80, 20);
		area.setBounds(250, 35, 140, 20);
		
		loadImage.setBounds(300, 120, 250, 250);
		
		// creating combo list
		comboBox2D = new JComboBox<>(twoDimensional);
		comboBox2D.setBounds(25, 35, 140, 20);
		
		response.setBounds(25, 160, 80, 20);
		
		selected.setBounds(400, 15, 160, 20);
		
		message.setText("Select shape from list below");
		message.setBounds(25, 15, 180, 20);
		
		panel.add(message);
		panel.add(comboBox2D);
		panel.add(selected);
		panel.add(response);
		panel.add(userInput);
		panel.add(area);
		panel.add(loadImage);
		
		
		
		response.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					if(comboBox2D.getSelectedItem().equals("Circle")) {
						
						userInput.setText("");
						
						selectedShape = "You selected " + comboBox2D.getItemAt(comboBox2D.getSelectedIndex());
						selected.setText(selectedShape);
						
						getRadius = JOptionPane.showInputDialog(panel, "Enter Circle radius");
						
						convertedRadius = Double.parseDouble(getRadius);
						
						Circle circle = new Circle(convertedRadius);
						
						area.setText("Area of Circle is");
						
						userInput.setText(String.valueOf(circle.getArea()));
						
						loadImage.setIcon(circleImage);
						System.out.println("Tasked completed successfully");
					}
					else if(comboBox2D.getSelectedItem().equals("Rectangle")) {
						
						loadImage.setIcon(blankImage);
						area.setText("Area of Rectangle is");
						userInput.setText("");
						
						selectedShape = "You selected " + comboBox2D.getItemAt(comboBox2D.getSelectedIndex());
						selected.setText(selectedShape);
						
						length = JOptionPane.showInputDialog(panel, "Enter Rectangle length");
						
						width = JOptionPane.showInputDialog(panel, "Enter Rectangle width");
						
						convertedLength = Double.parseDouble(length);
						convertedWidth = Double.parseDouble(width);
						
						Rectangle rectangle = new Rectangle(convertedLength, convertedWidth);
						
						userInput.setText(String.valueOf(rectangle.getArea()));
						
						loadImage.setIcon(rectangleImage);
						System.out.println("Tasked completed successfully");
					}
					else if(comboBox2D.getSelectedItem().equals("Triangle")) {
						
						loadImage.setIcon(blankImage);
						area.setText("Area of Triangle is");
						userInput.setText("");
						
						selectedShape = "You selected " + comboBox2D.getItemAt(comboBox2D.getSelectedIndex());
						selected.setText(selectedShape);
						
						base = JOptionPane.showInputDialog(panel, "Enter Triangle base");
						
						height = JOptionPane.showInputDialog(panel, "Enter Triangle height");
						
						convertedBase = Double.parseDouble(base);
						convertedHeight = Double.parseDouble(height);
						
						Triangle triangle = new Triangle(convertedBase, convertedHeight);
						
						userInput.setText(String.valueOf(triangle.getArea()));
						
						loadImage.setIcon(triangleImage);
						System.out.println("Tasked completed successfully");
						
					}
					else if(comboBox2D.getSelectedItem().equals("Square")) {
						
						loadImage.setIcon(blankImage);
						area.setText("Area of Square is");
						userInput.setText("");
						
						selectedShape = "You selected " + comboBox2D.getItemAt(comboBox2D.getSelectedIndex());
						selected.setText(selectedShape);
						
						sideLength = JOptionPane.showInputDialog(panel, "Enter Square side's length");
						
						convertedSide = Double.parseDouble(sideLength);
						
						Square square = new Square(convertedSide);
						
						userInput.setText(String.valueOf(square.getArea()));
						
						loadImage.setIcon(squareImage);
						System.out.println("Tasked completed successfully");
					}
					else {
						loadImage.setIcon(blankImage);
						area.setText("");
						userInput.setText("");
						
						selectedShape = "Sorry wrong answer " + comboBox2D.getItemAt(comboBox2D.getSelectedIndex());
						selected.setText(selectedShape);
						
						System.out.println("Sorry an error has occured");
					}
					
				} catch (Exception ex) {
					
					System.err.println("Invalid input, verify input then try again");
					JOptionPane.showMessageDialog(panel, "Invalid input, verify input then try again", "ERROR!!!", JOptionPane.ERROR_MESSAGE);
					
				}
			}
			
		});
		
		panel.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);;
		frame.setVisible(true);																													/* Making the frame visible. */
		
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
		System.exit(0);	
	}

}
