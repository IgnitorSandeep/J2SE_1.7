package org.gyt.design.mvc;

public class MVCPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student model = getStudent();

		StudentView studentView = new StudentView();
		StudentController controller = new StudentController(model, studentView);

		controller.updatedView();

		controller.setStudentName("Sandeep");

		controller.updatedView();

	}

	private static Student getStudent() {
		Student model = new Student();
		model.setName("John");
		model.setRoll("1213");
		return model;
	}

}
