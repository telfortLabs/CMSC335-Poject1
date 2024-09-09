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
	
	JFrame frame = new JFrame();
	JButton response = new JButton("Done");
	String[] threeDimensional = {"","Cone","Cube","Cylinder","Sphere","Torus"};
	JLabel message = new JLabel();
	JLabel selected = new JLabel();
	JPanel panel = new JPanel();
	TextField userInput = new TextField();
	JLabel volume = new JLabel();
	JLabel loadImage = new JLabel();
	
	String selectedShape, getRadius, getRadius2, getHeight, getSide;
	
	Double convertedRadius, convertedHeight, convertedSide, convertedRadius2;

	JComboBox<String> comboBox3D;
	
	Controller3D() {
		
		
		ImageIcon cubeImage = new ImageIcon(getClass().getResource("cube.jpg"));
		ImageIcon coneImage = new ImageIcon(getClass().getResource("cone.jpg"));
		ImageIcon cylinderImage = new ImageIcon(getClass().getResource("cylinder.jpg"));
		ImageIcon sphereImage = new ImageIcon(getClass().getResource("sphere.jpg"));
		ImageIcon torusImage = new ImageIcon(getClass().getResource("torus.jpg"));
		ImageIcon blankImage = new ImageIcon(getClass().getResource("blank.jpg"));
		
		// creating second frame
		frame = new JFrame("3D Drawings");
		frame.add(panel);
		
		
		userInput.setBounds(450, 35, 80, 20);
		volume.setBounds(250, 35, 140, 20);
		
		loadImage.setBounds(300, 120, 250, 250);
		
				
		// creating combo list
		comboBox3D = new JComboBox<>(threeDimensional);
		comboBox3D.setBounds(25, 35, 140, 20);
		
		
		response.setBounds(25, 180, 80, 20);
		selected.setBounds(400, 15, 160, 20);
		
		message.setText("Select shape from list below");
		message.setBounds(25, 15, 180, 20);
		
		panel.add(message);
		panel.add(comboBox3D);
		panel.add(response);
		panel.add(userInput);
		panel.add(volume);
		panel.add(loadImage);
		panel.add(selected);
		
		response.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					if(comboBox3D.getSelectedItem().equals("Cone")) {
						
						userInput.setText("");
						
						selectedShape = "You selected " + comboBox3D.getItemAt(comboBox3D.getSelectedIndex());
						selected.setText(selectedShape);
						
						getRadius = JOptionPane.showInputDialog(panel, "Enter cone radius");
						getHeight = JOptionPane.showInputDialog(panel, "Enter cone height");
						
						convertedRadius = Double.parseDouble(getRadius);
						convertedHeight = Double.parseDouble(getHeight);
						
						Cone cone = new Cone(convertedRadius, convertedHeight);
						
						volume.setText("Volume of Cone is");
						
						userInput.setText(String.valueOf(cone.getVolume()));
						
						loadImage.setIcon(coneImage);
						System.out.println("Tasked completed successfully");
					}
					else if(comboBox3D.getSelectedItem().equals("Cube")) {
						
						loadImage.setIcon(blankImage);
						volume.setText("Volume of Cube is");
						userInput.setText("");
						
						selectedShape = "You selected " + comboBox3D.getItemAt(comboBox3D.getSelectedIndex());
						selected.setText(selectedShape);
						
						getSide = JOptionPane.showInputDialog(panel, "Enter cube side's length");
						
						
						convertedSide = Double.parseDouble(getSide);
						
						
						Cube cube = new Cube(convertedSide);
						
						userInput.setText(String.valueOf(cube.getVolume()));
						
						loadImage.setIcon(cubeImage);
						System.out.println("Tasked completed successfully");
					}
					else if(comboBox3D.getSelectedItem().equals("Cylinder")) {
						
						loadImage.setIcon(blankImage);
						volume.setText("Volume of Cylinder is");
						userInput.setText("");
						
						selectedShape = "You selected " + comboBox3D.getItemAt(comboBox3D.getSelectedIndex());
						selected.setText(selectedShape);
						
						getRadius = JOptionPane.showInputDialog(panel, "Enter cylinder radius");
						
						getHeight = JOptionPane.showInputDialog(panel, "Enter cylinder height");
						
						convertedRadius = Double.parseDouble(getRadius);
						convertedHeight = Double.parseDouble(getHeight);
						
						Cylinder cylinder = new Cylinder(convertedRadius, convertedHeight);
						
						userInput.setText(String.valueOf(cylinder.getVolume()));
						
						loadImage.setIcon(cylinderImage);
						System.out.println("Tasked completed successfully");
						
					}
					else if(comboBox3D.getSelectedItem().equals("Sphere")) {
						
						loadImage.setIcon(blankImage);
						volume.setText("Volume of Sphere is");
						userInput.setText("");
						
						selectedShape = "You selected " + comboBox3D.getItemAt(comboBox3D.getSelectedIndex());
						selected.setText(selectedShape);
						
						getRadius = JOptionPane.showInputDialog(panel, "Enter sphere radius");
						
						convertedRadius = Double.parseDouble(getRadius);
						
						Sphere sphere = new Sphere(convertedRadius);
						
						userInput.setText(String.valueOf(sphere.getVolume()));
						
						loadImage.setIcon(sphereImage);
						System.out.println("Tasked completed successfully");
					}
					else if(comboBox3D.getSelectedItem().equals("Torus")) {
						
						loadImage.setIcon(blankImage);
						volume.setText("Volume of Torus is");
						userInput.setText("");
						
						selectedShape = "You selected " + comboBox3D.getItemAt(comboBox3D.getSelectedIndex());
						selected.setText(selectedShape);
						
						getRadius = JOptionPane.showInputDialog(panel, "Enter torus outer radius");
						getRadius2 = JOptionPane.showInputDialog(panel, "Enter torus inner radius");
						
						convertedRadius = Double.parseDouble(getRadius);
						convertedRadius2 = Double.parseDouble(getRadius2);
						
						Torus torus = new Torus(convertedRadius, convertedRadius2);
						
						userInput.setText(String.valueOf(torus.getVolume()));
						
						loadImage.setIcon(torusImage);
						System.out.println("Tasked completed successfully");
					}
					else {
						loadImage.setIcon(blankImage);
						volume.setText("");
						userInput.setText("");
						
						selectedShape = "Sorry wrong answer " + comboBox3D.getItemAt(comboBox3D.getSelectedIndex());
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
		frame.setSize(600, 600);
		frame.setVisible(true);																/* Making the frame visible. */
		
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
