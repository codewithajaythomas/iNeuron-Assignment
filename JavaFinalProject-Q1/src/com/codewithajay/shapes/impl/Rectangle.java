package com.codewithajay.shapes.impl;

import java.text.DecimalFormat;

import com.codewithajay.shapes.Shape;

public class Rectangle implements Shape {
	
	private float length;
	private float width;
	private DecimalFormat df = new DecimalFormat("#.00"); 

	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public String area() {
		return df.format(length*width);
	}

	@Override
	public String perimeter() {
		return df.format(2*(length+width));
	}

}
