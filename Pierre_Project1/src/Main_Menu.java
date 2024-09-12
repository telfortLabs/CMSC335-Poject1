/**
 * Project 1
 * 
 * @author Telfort
 * 
 * @created 9 Sept 2024
 * 
 * @summary This class will be used to load the shape app.
 */

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main_Menu extends JPanel implements ActionListener {
	
	
	/*
	 * The method below creates a GUI to present to the user.
	 */
	
	public static void GUI() {   
		
		/*
		 * From line 38-48, a frame is created and labeled it "Shape App",
		 * then the size and location to appear is set, and finally set the frame
		 * to close when the "x" button is clicked. Furthermore,  a panel is created,
		 * then set the panel to use Border Layout and added it to the frame.
		 */
		
		JLabel  welcome = new JLabel();
		welcome.setText("Please choose from the dimensions below");
		
		JFrame frame = new JFrame("Welcome to Shape App");									/* Created a frame. */
		frame.setSize(400, 200);															/* Set the frame size. */
		frame.setLocation(600, 200);														/* Set location for frame to display. */
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);								/* Set frame to terminate when "X" is clicked. */
		
		JPanel panel = new JPanel();														/* Created a panel. */
		panel.setLayout(new FlowLayout());													/* Set panel to use Border Layout. */
		frame.add(panel);																	/* Added panel to the frame. */
		
		
		
		JButton shape2D = new JButton("2 Dimensional shape");								/* Created button and labeled it shape2D. */
		
		/*
		 * Once the user clicks on the button
		 * it will load the menu for creating 
		 * 2D shapes. 
		 */
		
		shape2D.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {									
				
				frame.dispose();
				if(e.getSource() == shape2D) {
					Controller2D drawing2D = new Controller2D();
				}
			}
		});
		
		
		
		JButton shape3D = new JButton("3 Dimensional shape");								/* Created button and labeled it shape3D. */
		
		/*
		 * Once the user clicks on the button
		 * it will load the menu for creating 
		 * 3D shapes. 
		 */
		
		shape3D.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				if(e.getSource() == shape3D) {
					Controller3D drawing3D = new Controller3D();
				}	
			}
		});
		
		
		
		JButton exit = new JButton("Exit");													/* Created button and labeled it exit. */
		exit.addActionListener(new Main_Menu());											/* Added an Action Listener to button. */
		
		/*
		 * Added the buttons
		 * and label to the panel.
		 */
		
		panel.add(welcome);
		panel.add(shape2D);																	
		panel.add(shape3D);																	
		panel.add(exit);																	
		
		frame.setVisible(true);																/* Making the frame visible. */
		
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
	
	/*
	 * the system will perform the action below, which is exit when the button is clicked.
	 * This action is associated with the button exit in line 126.
	 */
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Exited the App");
		System.exit(0);																		/* System will terminate when the button exit is clicked. */	
	}

} // End ShapeDrawer
