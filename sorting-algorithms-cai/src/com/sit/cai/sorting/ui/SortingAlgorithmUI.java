package com.sit.cai.sorting.ui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sit.cai.sorting.helper.Constants;
import com.sit.cai.sorting.view.data.one.DataOnePanel;
import com.sit.cai.sorting.view.home.HomePanel;
import javax.swing.UIManager;

public class SortingAlgorithmUI {

	private JFrame frame;
	
	private JPanel panelHome;
	private JPanel panelSort;
	private JPanel panelDataTypeOne;
	private JPanel panelDataTypeTwo;
	private JPanel panelDataTypeThree;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SortingAlgorithmUI window = new SortingAlgorithmUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SortingAlgorithmUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(SortingAlgorithmUI.class.getResource("/com/sit/cai/sorting/resources/sorting2_48.png")));
		frame.setTitle("Sorting Algorithms");
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(175, 238, 238));	
		frame.getContentPane().setLayout(new CardLayout(0, 0));		
		frame.setBounds(10, 10, Constants.DIM_W, Constants.DIM_H);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);
		
		panelHome = new HomePanel();
		frame.getContentPane().add(panelHome, "name_686575850805405");
		panelHome.setLayout(null);
		panelHome.setVisible(true);
		
		panelSort = new JPanel();
		frame.getContentPane().add(panelSort, "name_686579345063934");
		panelSort.setLayout(null);
		panelSort.setVisible(true);
		
		panelDataTypeOne = new DataOnePanel();
		frame.getContentPane().add(panelDataTypeOne, "name_686581803715326");
		panelDataTypeOne.setLayout(null);
		panelDataTypeOne.setVisible(true);
		
		panelDataTypeTwo = new JPanel();
		frame.getContentPane().add(panelDataTypeTwo, "name_686584640617335");
		panelDataTypeTwo.setLayout(null);
		panelDataTypeTwo.setVisible(true);
		
		panelDataTypeThree = new JPanel();
		frame.getContentPane().add(panelDataTypeThree, "name_686588145800747");
		panelDataTypeThree.setLayout(null);
		panelDataTypeThree.setVisible(true);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JPanel getPanelHome() {
		return panelHome;
	}

	public void setPanelHome(JPanel panelHome) {
		this.panelHome = panelHome;
	}

	public JPanel getPanelSort() {
		return panelSort;
	}

	public void setPanelSort(JPanel panelSort) {
		this.panelSort = panelSort;
	}

	public JPanel getPanelDataTypeOne() {
		return panelDataTypeOne;
	}

	public void setPanelDataTypeOne(JPanel panelDataTypeOne) {
		this.panelDataTypeOne = panelDataTypeOne;
	}

	public JPanel getPanelDataTypeTwo() {
		return panelDataTypeTwo;
	}

	public void setPanelDataTypeTwo(JPanel panelDataTypeTwo) {
		this.panelDataTypeTwo = panelDataTypeTwo;
	}

	public JPanel getPanelDataTypeThree() {
		return panelDataTypeThree;
	}

	public void setPanelDataTypeThree(JPanel panelDataTypeThree) {
		this.panelDataTypeThree = panelDataTypeThree;
	}

}
