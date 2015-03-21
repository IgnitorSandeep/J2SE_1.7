package org.gyt.design.mvc;

/*
 * Controller - Controller acts on both Model and view. It controls the data flow into model object and updates the view whenever data changes. It keeps View and Model separate.
 */
public class StudentController {

	private Student model;
	private StudentView view;

	public StudentController(Student model, StudentView view) {
		this.model = model;
		this.view = view;

	}

	public void setStudentName(String name) {
		model.setName(name);
	}

	public String getStudentName() {
		return model.getName();
	}

	public void setStudentRoll(String roll) {
		model.setRoll(roll);
	}

	public String getStudentRoll() {
		return model.getRoll();
	}

	public void updatedView() {
		view.printDetail(model.getName(), model.getRoll());
	}

}
