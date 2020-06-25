package Shapes.src.shapes;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ShapeGUI extends JFrame {
	
	private JPanel buttonsP, inputP, imgP;
	private JButton calcB, rectPrismB, triPrismB, coneB, sphereB, cylinderB, torusB;
	private JLabel lengthL, widthL, heightL, radius1L, radius2L;
	private JTextField lengthF, widthF, heightF, radius1F, radius2F;

	public ShapeGUI() {
		// Setup
		super("Volume Calculator");
		setSize(new Dimension(800, 400));
		setLayout(new FlowLayout());
		
		// Run
		this.createGUI();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	private void createGUI() {
		buttonsP = new JPanel();
		
		// Create buttons
		calcB = new JButton("Calculate Volume");
		rectPrismB = new JButton("Rectangular Prism");
		triPrismB = new JButton("Triangular Prism");
		coneB = new JButton("Cone");
		sphereB = new JButton("Sphere");
		cylinderB = new JButton("Cylinder");
		torusB = new JButton("Torus");
		
		// Add to buttons panel
		buttonsP.add(calcB);
		buttonsP.add(rectPrismB);
		buttonsP.add(triPrismB);
		buttonsP.add(coneB);
		buttonsP.add(sphereB);
		buttonsP.add(cylinderB);
		buttonsP.add(torusB);
		
		// Add buttons panel to frame
		add(buttonsP);
		
	}

	public static void main(String[] args) {
		// Invoke constructor to setup GUI by allocating an instance
		new ShapeGUI();
	}
	


}
