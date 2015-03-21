package org.gyt.design.factory;

public class ShapeFactory {

	public Shape getShape(String shape){
		if(shape == null){
			return null;
		}
		if(shape.equalsIgnoreCase("circle")){
			return new Circle();
		} else if(shape.equalsIgnoreCase("rectangle")){
			return new Rectangle();
		} else if(shape.equalsIgnoreCase("square")){
			return new Square();
		}
		return null;
		
	}
}
