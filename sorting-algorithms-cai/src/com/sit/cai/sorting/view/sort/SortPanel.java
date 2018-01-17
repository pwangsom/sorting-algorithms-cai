package com.sit.cai.sorting.view.sort;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

import com.sit.cai.sorting.helper.Constants;
import com.sit.cai.sorting.view.home.HomeCenterPanel;
import com.sit.cai.sorting.view.home.HomeFooterPanel;
import com.sit.cai.sorting.view.shared.HeaderPanel;

@SuppressWarnings("serial")
public class SortPanel extends JPanel {
	
	private JPanel panelHead;
	private JPanel panelMain;
	private JPanel panelFooter;
	
	private Component rigidHeader;
	private Component rigidCenter;
	private Component rigidFooter;

	/**
	 * Create the panel.
	 */
	public SortPanel() {
		setBackground(new Color(175, 238, 238));
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBounds(0, 0, Constants.DIM_W, Constants.DIM_H);	

		panelHead = new HeaderPanel(Constants.APP_NAME + " - " + "Sort");
		panelHead.setBounds(0, 0, Constants.DIM_W, Constants.DIM_H_HEADER);
		add(panelHead);		

		rigidHeader = Box.createRigidArea(new Dimension(Constants.DIM_W, Constants.DIM_H_HEADER));
		rigidHeader.setBounds(0, 0, Constants.DIM_W, Constants.DIM_H_HEADER);
		panelHead.add(rigidHeader);
		
		panelMain = new HomeCenterPanel();
		panelMain.setBounds(0, Constants.DIM_H_HEADER, Constants.DIM_W, Constants.DIM_H_CENTER);
		add(panelMain);
		
		rigidCenter = Box.createRigidArea(new Dimension(Constants.DIM_W, Constants.DIM_H_CENTER));
		rigidCenter.setBounds(0, Constants.DIM_H_HEADER, Constants.DIM_W, Constants.DIM_H_CENTER);
		panelMain.add(rigidCenter);
		
		panelFooter = new HomeFooterPanel();
		panelFooter.setBounds(0, Constants.DIM_H_HEADER+Constants.DIM_H_CENTER, Constants.DIM_W, Constants.DIM_H_FOOTER);
		add(panelFooter);
		
		rigidFooter = Box.createRigidArea(new Dimension(Constants.DIM_W, Constants.DIM_H_FOOTER));
		rigidFooter.setBounds(0, Constants.DIM_H_HEADER+Constants.DIM_H_CENTER, Constants.DIM_W, Constants.DIM_H_FOOTER);
		panelFooter.add(rigidFooter);

	}

}
