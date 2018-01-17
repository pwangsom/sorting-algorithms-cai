package com.sit.cai.sorting.view.shared;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

import com.sit.cai.sorting.helper.Constants;
import java.awt.Component;

@SuppressWarnings("serial")
public class BasedPanel extends JPanel {
	
	protected JPanel panelHead;
	protected JPanel panelMain;
	protected JPanel panelFooter;
	
	protected Component rigidHeader;
	protected Component rigidCenter;
	protected Component rigidFooter;
	

	/**
	 * Create the panel.
	 */
	public BasedPanel() {
		panelHead = new HeaderPanel();		
		initialComponents();
	}
	
	public BasedPanel(String headerName) {
		panelHead = new HeaderPanel(headerName);		
		initialComponents();
	}
	
	private void initialComponents(){
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBounds(0, 0, Constants.DIM_W, Constants.DIM_H);
		
		add(panelHead);		

		rigidHeader = Box.createRigidArea(new Dimension(Constants.DIM_W, Constants.DIM_H_HEADER));
		rigidHeader.setBounds(0, 0, Constants.DIM_W, Constants.DIM_H_HEADER);
		panelHead.add(rigidHeader);
		
		panelMain = new JPanel();
		add(panelMain);
		
		rigidCenter = Box.createRigidArea(new Dimension(Constants.DIM_W, Constants.DIM_H_CENTER));
		rigidCenter.setBounds(0, 0, Constants.DIM_W, Constants.DIM_H_CENTER);
		panelMain.add(rigidCenter);
		
		panelFooter = new JPanel();
		add(panelFooter);
		
		rigidFooter = Box.createRigidArea(new Dimension(Constants.DIM_W, Constants.DIM_H_FOOTER));
		rigidFooter.setBounds(0, 0, Constants.DIM_W, Constants.DIM_H_FOOTER);
		panelFooter.add(rigidFooter);
		
	}


	public JPanel getPanelHead() {
		return panelHead;
	}


	public void setPanelHead(JPanel panelHead) {
		this.panelHead = panelHead;
	}


	public JPanel getPanelMain() {
		return panelMain;
	}


	public void setPanelMain(JPanel panelMain) {
		this.panelMain = panelMain;
	}


	public JPanel getPanelFooter() {
		return panelFooter;
	}


	public void setPanelFooter(JPanel panelFooter) {
		this.panelFooter = panelFooter;
	}


	public Component getRigidHeader() {
		return rigidHeader;
	}


	public void setRigidHeader(Component rigidHeader) {
		this.rigidHeader = rigidHeader;
	}


	public Component getRigidCenter() {
		return rigidCenter;
	}


	public void setRigidCenter(Component rigidCenter) {
		this.rigidCenter = rigidCenter;
	}


	public Component getRigidFooter() {
		return rigidFooter;
	}


	public void setRigidFooter(Component rigidFooter) {
		this.rigidFooter = rigidFooter;
	}

}
