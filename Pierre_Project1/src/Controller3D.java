/**
 * Project 1
 * 
 * @author Telfort
 * 
 * @created 9 Sept 2024
 * 
 * @summary This class will be used to load the menu windows for 3D shapes.
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

public class Controller3D extends JFrame implements ActionListener {
	
	/*
	 * Created a frame, a panel and 
	 * other necessary variables to 
	 * load and display the app to the user.
	 */
	
	private JFrame frame = new JFrame();
	private JButton response = new JButton("Done");
	private String[] threeDimensional = {"","Cone","Cube","Cylinder","Sphere","Torus"};
	private JLabel message = new JLabel();
	private JLabel selected = new JLabel();
	private JPanel panel = new JPanel();
	private TextField shapeVolume = new TextField();
	private JLabel volume = new JLabel();
	private JLabel loadImage = new JLabel();
	
	String selectedShape, getRadius, getRadius2, getHeight, getSide;
	
	Double convertedRadius, convertedHeight, convertedSide, convertedRadius2;

	JComboBox<String> comboBox3D;
	
	ImageIcon cubeImage, coneImage, cylinderImage, phereImage, torusImage, sphereImage, blankImage;
	
	Controller3D() {
		
		/*
		 * Line 59 - 64 will load
		 * necessary images for the app.
		 */
		
		cubeImage = new ImageIcon(getClass().getResource("cube.jpg"));
		coneImage = new ImageIcon(getClass().getResource("cone.jpg"));
		cylinderImage = new ImageIcon(getClass().getResource("cylinder.jpg"));
		sphereImage = new ImageIcon(getClass().getResource("sphere.jpg"));
		torusImage = new ImageIcon(getClass().getResource("torus.jpg"));
		blankImage = new ImageIcon(getClass().getResource("blank.jpg"));
		
		frame = new JFrame("3D Drawings");																									/* Created a frame. */
		frame.add(panel);																													/* Added panel to the frame. */
		
		shapeVolume.setEditable(false);																										/* Disable edit function of text Field. */
		shapeVolume.setBounds(450, 35, 80, 20);																								/* Set frame location for text field. */
		volume.setBounds(250, 35, 140, 20);																									/* Set frame location for label. */
		loadImage.setBounds(300, 120, 250, 250);																							/* Set frame location for image icon. */
		
		comboBox3D = new JComboBox<>(threeDimensional);																						/* Added list of shapes to combo box. */
		comboBox3D.setBounds(25, 35, 140, 20);																								/* Set frame location for combo box. */
		
		response.setBounds(25, 180, 80, 20);																								/* Set frame location for button. */
		selected.setBounds(400, 15, 160, 20);																								/* Set frame location for label. */
		
		message.setText("Select shape from list below then click done");																	/* Message to display to user. */
		message.setBounds(25, 15, 290, 20);																									/* Set frame location for label. */
		
		/*
		 * Added the buttons
		 * and label, and other 
		 * necessary components to the panel.
		 */
		
		panel.add(message);
		panel.add(comboBox3D);
		panel.add(response);
		panel.add(shapeVolume);
		panel.add(volume);
		panel.add(loadImage);
		panel.add(selected);
		
		/*
		 * The Action listener below will
		 * check user's choice then collect necessary
		 * inputs from the user to calculate the volume
		 * of a shape then display and image of 
		 * the shape.
		 */
		
		response.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					if(comboBox3D.getSelectedItem().equals("Cone")) {
						loadImage.setIcon(blankImage);
						shapeVolume.setText("");
						
						selectedShape = "You selected " + comboBox3D.getItemAt(comboBox3D.getSelectedIndex());
						selected.setText(selectedShape);
						
						getRadius = JOptionPane.showInputDialog(panel, "Enter Cone radius");		
						getHeight = JOptionPane.showInputDialog(panel, "Enter Cone height");
						
						convertedRadius = Double.parseDouble(getRadius);
						convertedHeight = Double.parseDouble(getHeight);
						
						Cone cone = new Cone(convertedRadius, convertedHeight);
						
						volume.setText("Volume of Cone is");
						
						shapeVolume.setText(String.valueOf(cone.getVolume()));
						
						loadImage.setIcon(coneImage);
						System.out.println("Tasked completed successfully");
					}
					else if(comboBox3D.getSelectedItem().equals("Cube")) {
						
						loadImage.setIcon(blankImage);
						volume.setText("Volume of Cube is");
						shapeVolume.setText("");
						
						selectedShape = "You selected " + comboBox3D.getItemAt(comboBox3D.getSelectedIndex());
						selected.setText(selectedShape);
						
						getSide = JOptionPane.showInputDialog(panel, "Enter Cube side's length");
						
						
						convertedSide = Double.parseDouble(getSide);
						
						
						Cube cube = new Cube(convertedSide);
						
						shapeVolume.setText(String.valueOf(cube.getVolume()));
						
						loadImage.setIcon(cubeImage);
						System.out.println("Tasked completed successfully");
					}
					else if(comboBox3D.getSelectedItem().equals("Cylinder")) {						
						
						loadImage.setIcon(blankImage);
						volume.setText("Volume of Cylinder is");
						shapeVolume.setText("");
						
						selectedShape = "You selected " + comboBox3D.getItemAt(comboBox3D.getSelectedIndex());
						selected.setText(selectedShape);
						
						getRadius = JOptionPane.showInputDialog(panel, "Enter Cylinder radius");
						
						getHeight = JOptionPane.showInputDialog(panel, "Enter Cylinder height");
						
						convertedRadius = Double.parseDouble(getRadius);
						convertedHeight = Double.parseDouble(getHeight);
						
						Cylinder cylinder = new Cylinder(convertedRadius, convertedHeight);
						
						shapeVolume.setText(String.valueOf(cylinder.getVolume()));
						
						loadImage.setIcon(cylinderImage);
						System.out.println("Tasked completed successfully");
						
					}
					else if(comboBox3D.getSelectedItem().equals("Sphere")) {
						
						loadImage.setIcon(blankImage);
						volume.setText("Volume of Sphere is");
						shapeVolume.setText("");
						
						selectedShape = "You selected " + comboBox3D.getItemAt(comboBox3D.getSelectedIndex());						
						selected.setText(selectedShape);
						
						getRadius = JOptionPane.showInputDialog(panel, "Enter Sphere radius");
						
						convertedRadius = Double.parseDouble(getRadius);
						
						Sphere sphere = new Sphere(convertedRadius);
						
						shapeVolume.setText(String.valueOf(sphere.getVolume()));
						
						loadImage.setIcon(sphereImage);
						System.out.println("Tasked completed successfully");
					}
					else if(comboBox3D.getSelectedItem().equals("Torus")) {
						
						loadImage.setIcon(blankImage);
						volume.setText("Volume of Torus is");
						shapeVolume.setText("");
						
						selectedShape = "You selected " + comboBox3D.getItemAt(comboBox3D.getSelectedIndex());
						selected.setText(selectedShape);
						
						getRadius = JOptionPane.showInputDialog(panel, "Enter Torus outer radius");
						getRadius2 = JOptionPane.showInputDialog(panel, "Enter Torus inner radius");
						
						convertedRadius = Double.parseDouble(getRadius);
						convertedRadius2 = Double.parseDouble(getRadius2);
						
						Torus torus = new Torus(convertedRadius, convertedRadius2);
						
						shapeVolume.setText(String.valueOf(torus.getVolume()));
						
						loadImage.setIcon(torusImage);
						System.out.println("Tasked completed successfully");
					}
					else {
						loadImage.setIcon(blankImage);
						volume.setText("");
						shapeVolume.setText("");
						
						selectedShape = "Sorry wrong answer " + comboBox3D.getItemAt(comboBox3D.getSelectedIndex());			
						selected.setText(selectedShape);
						
						System.err.println("Sorry an error has occured");
					}
					
				} catch (Exception ex) {
					
					System.err.println("Invalid input, verify input then try again");
					JOptionPane.showMessageDialog(panel, "Invalid input, verify input then try again", "ERROR!!!", JOptionPane.ERROR_MESSAGE);
				}
			}
			
		});
		
		
		panel.setLayout(null);																												/* Setting layout for frame. */
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);																				/* Set frame to close when the user click "x". */
		frame.setSize(600, 600);																											/* Set size for frame. */
		frame.setVisible(true);																												/* Making the frame visible. */
		
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
		System.exit(0);																														/* System will terminate when the button exit is clicked. */
		
	}

}
