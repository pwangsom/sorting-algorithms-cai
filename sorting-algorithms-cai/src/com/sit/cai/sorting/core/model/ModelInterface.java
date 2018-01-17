package com.sit.cai.sorting.core.model;

import java.beans.PropertyChangeListener;

public interface ModelInterface {

	void addPropertyChangeListener(PropertyChangeListener listener);

	void removePropertyChangeListener(PropertyChangeListener listener);

}