package com.codewithajay.shapes.impl;

import java.text.DecimalFormat;

import com.codewithajay.shapes.Shape;

public class Circle implements Shape {
	
	private float radius;
	private final float PI = 3.14f;
	private DecimalFormat df = new DecimalFormat("#.00"); 

	public Circle(float radius) {
		this.radius = radius;
	}

	@Override
	public String area() {
		return  df.format(PI*Math.pow(radius, 2));
	}

	@Override
	public String perimeter() {
		return  df.format(2*PI*radius);
	}

}
