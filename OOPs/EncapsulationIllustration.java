package com.OOPs;

public class EncapsulationIllustration {
	
	//declaring the variable private
	//for security purpose, so that any object can not access them directly
	
	//that is, encapsulating or hiding the sensitive data
	private String name;
	
	private int number;

	
	//Writing getters and setters for accessing the attribute and
	//setting the value to the attribute
	
	//We can remove the setter methods if we want them to be read only.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
	
}
