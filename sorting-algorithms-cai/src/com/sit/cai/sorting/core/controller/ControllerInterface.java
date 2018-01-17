package com.sit.cai.sorting.core.controller;

import java.beans.PropertyChangeEvent;

import com.sit.cai.sorting.core.model.AbstractModel;
import com.sit.cai.sorting.core.view.AbstractPanel;

public interface ControllerInterface {

	public void addModel(AbstractModel model);

	public void removeModel(AbstractModel model);

	public void addView(AbstractPanel view);

	public void removeView(AbstractPanel view);

	public void propertyChange(PropertyChangeEvent event);

}