package com.sit.cai.sorting.view.shared;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.sit.cai.sorting.helper.Constants;

@SuppressWarnings("serial")
public class HeaderPanel extends JPanel {
	
	private JLabel lblHeadName;

	/**
	 * Create the panel.
	 */
	public HeaderPanel() {
		initialComponents("Header Name");
	}
	
	public HeaderPanel(String headerName) {
		initialComponents(headerName);
	}
	
	private void initialComponents(String headerName){
		setBackground(new Color(175, 238, 238));
		setBounds(0, 0, Constants.DIM_W, Constants.DIM_H_HEADER);
		setLayout(null);
		
		lblHeadName = new JLabel(headerName);
		lblHeadName.setFont(Constants.FONT_H1);
		lblHeadName.setBounds(10, 11, 1004, 78);
		lblHeadName.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblHeadName);
		
	}
	
	@Override
    public Dimension getPreferredSize() {
        return new Dimension(Constants.DIM_W, Constants.DIM_H_HEADER);
    }

	public JLabel getLblHeadName() {
		return lblHeadName;
	}

	public void setLblHeadName(JLabel lblHeadName) {
		this.lblHeadName = lblHeadName;
	}
}
