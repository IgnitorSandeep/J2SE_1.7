package org.gyt.design.factory;

public class FactoryPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape circle = shapeFactory.getShape("circle");
		circle.draw();
		Shape square = shapeFactory.getShape("square");
		square.draw();
		Shape rectangle = shapeFactory.getShape("rectangle");
		rectangle.draw();
		
		//Shape sandeep = shapeFactory.getShape("sandeep");
		//sandeep.draw();

	}

}
