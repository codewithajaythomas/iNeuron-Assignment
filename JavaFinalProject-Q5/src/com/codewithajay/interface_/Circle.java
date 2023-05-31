package com.codewithajay.interface_;

public class Circle implements Shape{

	float radius;
	
	public Circle(float radius,String shapeName) {
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
