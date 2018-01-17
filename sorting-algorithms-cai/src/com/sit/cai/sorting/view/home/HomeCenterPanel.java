package com.sit.cai.sorting.view.home;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.sit.cai.sorting.helper.Constants;

@SuppressWarnings("serial")
public class HomeCenterPanel extends JPanel {

	private JButton btnInsertion;
	private JButton btnSelection;
	private JButton btnBubble;
	private JButton btnShell;
	private JButton btnHeap;
	private JButton btnMerge;
	private JButton btnQuick;
	private JButton btnRadix;
	
	/**
	 * Create the panel.
	 */
	public HomeCenterPanel() {
		setBackground(new Color(175, 238, 238));
		setBounds(0, 0, Constants.DIM_W, Constants.DIM_H_CENTER);
		setLayout(null);
				
		btnInsertion = new JButton("Insertion Sort");
		btnInsertion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(btnInsertion.getText());
			}
		});
		btnInsertion.setHorizontalAlignment(SwingConstants.LEFT);
		btnInsertion.setIcon(new ImageIcon(HomeCenterPanel.class.getResource("/com/sit/cai/sorting/resources/sorting2_48.png")));
		btnInsertion.setBackground(new Color(135, 206, 235));
		btnInsertion.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 28));
		btnInsertion.setBounds(161, 10, 315, 119);
		add(btnInsertion);
		
		btnSelection = new JButton("Selection Sort");
		btnSelection.setHorizontalAlignment(SwingConstants.LEFT);
		btnSelection.setIcon(new ImageIcon(HomeCenterPanel.class.getResource("/com/sit/cai/sorting/resources/sorting2_48.png")));
		btnSelection.setBackground(new Color(135, 206, 235));
		btnSelection.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 28));
		btnSelection.setBounds(161, 139, 315, 119);
		add(btnSelection);
		
		btnBubble = new JButton("Bubble Sort");
		btnBubble.setHorizontalAlignment(SwingConstants.LEFT);
		btnBubble.setIcon(new ImageIcon(HomeCenterPanel.class.getResource("/com/sit/cai/sorting/resources/sorting2_48.png")));
		btnBubble.setBackground(new Color(135, 206, 235));
		btnBubble.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 28));
		btnBubble.setBounds(161, 268, 315, 119);
		add(btnBubble);
		
		btnShell = new JButton("Shell Sort");
		btnShell.setHorizontalAlignment(SwingConstants.LEFT);
		btnShell.setIcon(new ImageIcon(HomeCenterPanel.class.getResource("/com/sit/cai/sorting/resources/sorting2_48.png")));
		btnShell.setBackground(new Color(135, 206, 235));
		btnShell.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 28));
		btnShell.setBounds(161, 397, 315, 119);
		add(btnShell);
		
		btnHeap = new JButton("Heap Sort");
		btnHeap.setHorizontalAlignment(SwingConstants.LEFT);
		btnHeap.setIcon(new ImageIcon(HomeCenterPanel.class.getResource("/com/sit/cai/sorting/resources/sorting2_48.png")));
		btnHeap.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 28));
		btnHeap.setBackground(new Color(135, 206, 235));
		btnHeap.setBounds(547, 10, 315, 119);
		add(btnHeap);
		
		btnMerge = new JButton("Merge Sort");
		btnMerge.setHorizontalAlignment(SwingConstants.LEFT);
		btnMerge.setIcon(new ImageIcon(HomeCenterPanel.class.getResource("/com/sit/cai/sorting/resources/sorting2_48.png")));
		btnMerge.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 28));
		btnMerge.setBackground(new Color(135, 206, 235));
		btnMerge.setBounds(547, 139, 315, 119);
		add(btnMerge);
		
		btnQuick = new JButton("Quick Sort");
		btnQuick.setHorizontalAlignment(SwingConstants.LEFT);
		btnQuick.setIcon(new ImageIcon(HomeCenterPanel.class.getResource("/com/sit/cai/sorting/resources/sorting2_48.png")));
		btnQuick.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 28));
		btnQuick.setBackground(new Color(135, 206, 235));
		btnQuick.setBounds(547, 268, 315, 119);
		add(btnQuick);
		
		btnRadix = new JButton("Radix Sort");
		btnRadix.setHorizontalAlignment(SwingConstants.LEFT);
		btnRadix.setIcon(new ImageIcon(HomeCenterPanel.class.getResource("/com/sit/cai/sorting/resources/sorting2_48.png")));
		btnRadix.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 28));
		btnRadix.setBackground(new Color(135, 206, 235));
		btnRadix.setBounds(547, 397, 315, 119);
		add(btnRadix);
	}
	
	@Override
    public Dimension getPreferredSize() {
        return new Dimension(Constants.DIM_W, Constants.DIM_H_CENTER);
    }

	public JButton getBtnInsertion() {
		return btnInsertion;
	}

	public void setBtnInsertion(JButton btnInsertion) {
		this.btnInsertion = btnInsertion;
	}

	public JButton getBtnSelection() {
		return btnSelection;
	}

	public void setBtnSelection(JButton btnSelection) {
		this.btnSelection = btnSelection;
	}

	public JButton getBtnBubble() {
		return btnBubble;
	}

	public void setBtnBubble(JButton btnBubble) {
		this.btnBubble = btnBubble;
	}

	public JButton getBtnShell() {
		return btnShell;
	}

	public void setBtnShell(JButton btnShell) {
		this.btnShell = btnShell;
	}

	public JButton getBtnHeap() {
		return btnHeap;
	}

	public void setBtnHeap(JButton btnHeap) {
		this.btnHeap = btnHeap;
	}

	public JButton getBtnMerge() {
		return btnMerge;
	}

	public void setBtnMerge(JButton btnMerge) {
		this.btnMerge = btnMerge;
	}

	public JButton getBtnQuick() {
		return btnQuick;
	}

	public void setBtnQuick(JButton btnQuick) {
		this.btnQuick = btnQuick;
	}

	public JButton getBtnRadix() {
		return btnRadix;
	}

	public void setBtnRadix(JButton btnRadix) {
		this.btnRadix = btnRadix;
	}

}
