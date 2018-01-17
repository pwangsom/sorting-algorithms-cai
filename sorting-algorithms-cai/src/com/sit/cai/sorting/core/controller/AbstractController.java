package com.sit.cai.sorting.core.controller;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.Method;
import java.util.ArrayList;

import com.sit.cai.sorting.core.model.AbstractModel;
import com.sit.cai.sorting.core.view.AbstractPanel;

public abstract class AbstractController implements PropertyChangeListener, ControllerInterface {

	private ArrayList<AbstractPanel> registeredViews;
	private ArrayList<AbstractModel> registeredModels;

	public AbstractController() {
		registeredViews = new ArrayList<AbstractPanel>();
		registeredModels = new ArrayList<AbstractModel>();
	}

	/* (non-Javadoc)
	 * @see com.sit.cai.sorting.controller.ControllerInterface#addModel(com.sit.cai.sorting.model.AbstractModel)
	 */
	@Override
	public void addModel(AbstractModel model) {
		registeredModels.add(model);
		model.addPropertyChangeListener(this);
	}

	/* (non-Javadoc)
	 * @see com.sit.cai.sorting.controller.ControllerInterface#removeModel(com.sit.cai.sorting.model.AbstractModel)
	 */
	@Override
	public void removeModel(AbstractModel model) {
		registeredModels.remove(model);
		model.removePropertyChangeListener(this);
	}

	/* (non-Javadoc)
	 * @see com.sit.cai.sorting.controller.ControllerInterface#addView(com.sit.cai.sorting.view.AbstractView)
	 */
	@Override
	public void addView(AbstractPanel view) {
		registeredViews.add(view);
	}

	/* (non-Javadoc)
	 * @see com.sit.cai.sorting.controller.ControllerInterface#removeView(com.sit.cai.sorting.view.ViewInterface)
	 */
	@Override
	public void removeView(AbstractPanel view) {
		registeredViews.remove(view);
	}

	// Use this to observe property changes from registered models
	// and propagate them on to all the views.

	/* (non-Javadoc)
	 * @see com.sit.cai.sorting.controller.ControllerInterface#propertyChange(java.beans.PropertyChangeEvent)
	 */
	@Override
	public void propertyChange(PropertyChangeEvent event) {

		for (AbstractPanel view : registeredViews) {
			view.modelPropertyChange(event);
		}
	}

	/**
	 * This is a convenience method that subclasses can call upon to fire
	 * property changes back to the models. This method uses reflection to
	 * inspect each of the model classes to determine whether it is the owner of
	 * the property in question. If it isn't, a NoSuchMethodException is thrown,
	 * which the method ignores.
	 *
	 * @param propertyName
	 *            = The name of the property.
	 * @param newValue
	 *            = An object that represents the new value of the property.
	 */
	protected void setModelProperty(String propertyName, Object newValue) {

		for (AbstractModel model : registeredModels) {
			try {

				Method method = model.getClass().getMethod("set" + propertyName, new Class[] { newValue.getClass() }

				);
				method.invoke(model, newValue);

			} catch (Exception ex) {
				// Handle exception.
			}
		}
	}

}
