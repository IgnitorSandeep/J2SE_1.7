package org.gyt.design.mvc;

/*
 * Model - Model represents an object or JAVA POJO carrying data. It can also have logic to update controller if its data changes.
 * Here Student object is acting as model.
 */
public class Student {
	private String name;
	private String roll;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoll() {
		return this.roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}
}
