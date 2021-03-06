package ru.litsey2.cuttesseract;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import ru.litsey2.cuttesseract.geometry.Cube4d;

/**
 * Main program window
 * @author Ilgiz Mustafin
 */
public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	PointRotator pointRotator;

	public MainFrame(String title) {
		super(title);

		pointRotator = new PointRotator(new Cube4d(1, Colors.CUBE_COLOR));

		setLayout(new SpringLayout());

		SpringLayout mainLayout = new SpringLayout();

		JPanel mainPanel = new JPanel(mainLayout);

		SegmentDrawer4d segmentDrawer = new SegmentDrawer4d(pointRotator);

		PointVectorControlPanel controlPanel = new PointVectorControlPanel(
				segmentDrawer);

		mainPanel.add(segmentDrawer);
		mainPanel.add(controlPanel);

		mainLayout.putConstraint(SpringLayout.NORTH, segmentDrawer, 0,
				SpringLayout.NORTH, mainPanel);
		mainLayout.putConstraint(SpringLayout.EAST, segmentDrawer, 0,
				SpringLayout.EAST, mainPanel);
		mainLayout.putConstraint(SpringLayout.WEST, segmentDrawer, 0,
				SpringLayout.WEST, mainPanel);
		mainLayout.putConstraint(SpringLayout.SOUTH, segmentDrawer, 0,
				SpringLayout.NORTH, controlPanel);

		mainLayout.putConstraint(SpringLayout.WEST, controlPanel, 0,
				SpringLayout.WEST, mainPanel);
		mainLayout.putConstraint(SpringLayout.EAST, controlPanel, 0,
				SpringLayout.EAST, mainPanel);
		mainLayout.putConstraint(SpringLayout.SOUTH, controlPanel, 0,
				SpringLayout.SOUTH, mainPanel);

		setLayout(new GridLayout(1, 1));
		add(mainPanel);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pack();

		setSize(500, 500);
		setVisible(true);
	}

}
