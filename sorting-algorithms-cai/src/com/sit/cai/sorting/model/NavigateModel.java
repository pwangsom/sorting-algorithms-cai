package com.sit.cai.sorting.model;

public class NavigateModel {
	
	public enum NavigateState {
		HOME,
		SORT,
		DATA_ONE,
		DATA_TWO,
		DATA_THREE;
	}
	
	private NavigateState currentState;
	private NavigateState nextState;

	public NavigateState getCurrentState() {
		return currentState;
	}

	public void setCurrentState(NavigateState state) {
		this.currentState = state;
	}

	public NavigateState getNextState() {
		return nextState;
	}

	public void setNextState(NavigateState nextState) {
		this.nextState = nextState;
	}
	
	

}
