package com.codewithajay.abstractclass;

public class Circle extends Shape{

	float radius;
	
	public Circle(float radius,String shapeName) {
		super(shapeName);
		this.radius = radius;
	}

	@Override
	public double area() {
		return 3.14*Math.pow(radius, 2);
	}

	@Override
	public double perimeter() {
		return 2*3.14*radius;
	}

}
