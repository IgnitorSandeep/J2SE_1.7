package org.gyt.design.mvc;

/*
 * View - View represents the visualization of the data that model contains
 * 
 */
public class StudentView {
	
	public void printDetail(String studentName,String studentRoll){
		System.out.println("Student:");
		System.out.println("Name : "+studentName);
		System.out.println("Roll : "+studentRoll);
	}

}
