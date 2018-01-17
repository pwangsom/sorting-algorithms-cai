package com.sit.cai.sorting.helper;

public enum SortingEnum {
	
	INSERTION_SORT(1, "Insertion Sort", 1),
	SELECTION_SORT(2, "Selection Sort", 1),
	BUBBLE_SORT(3, "Bubble Sort", 1),
	SHELL_SORT(4, "Shell Sort", 1),
	HEAP_SORT(5, "Heap Sort", 3),
	MERGE_SORT(6, "Merge Sort", 2),
	QUICK_SORT(7, "Quick Sort", 1),
	RADIX_SORT(8, "Radix Sort", 1);
	
	private int id;
	private String sortName;
	private int inputType;
	
	SortingEnum(int id, String sortName, int inputType){
		this.id = id;
		this.sortName = sortName;
		this.inputType = inputType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSortName() {
		return sortName;
	}

	public void setSortName(String sortName) {
		this.sortName = sortName;
	}

	public int getInputType() {
		return inputType;
	}

	public void setInputType(int inputType) {
		this.inputType = inputType;
	}
	
}
