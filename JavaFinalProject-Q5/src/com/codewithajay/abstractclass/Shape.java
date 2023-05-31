package com.codewithajay.abstractclass;

/**
 * Abstract class are incomplete classes, which means that the classes which extends the abstract class has to give the implementation to the abstract methods.
 * Abstract class are not 100% abstract.
 * Abstract class can be extended using keyword extends.
 * 
 * @author Ajay Thomas
 *
 */
abstract class Shape {
	
	String shapeName;
	
	public Shape(String shapeName) {
		this.shapeName = shapeName;
	}
	
	abstract public double area();
	abstract public double perimeter();
}
