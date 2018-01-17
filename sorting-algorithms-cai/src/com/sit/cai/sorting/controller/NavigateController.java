package com.sit.cai.sorting.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.sit.cai.sorting.model.NavigateModel;
import com.sit.cai.sorting.ui.SortingAlgorithmUI;

public class NavigateController implements ActionListener {
	
	private NavigateModel model;
	private SortingAlgorithmUI ui;
	
	public NavigateController(NavigateModel model, SortingAlgorithmUI ui){
		this.model = model;
		this.ui = ui;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	} 

}
