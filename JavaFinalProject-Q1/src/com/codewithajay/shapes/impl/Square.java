package com.codewithajay.shapes.impl;

import java.text.DecimalFormat;

import com.codewithajay.shapes.Shape;

public class Square implements Shape {
	
	private float side;
	private DecimalFormat df = new DecimalFormat("#.00"); 
	
	public Square(float side) {
		this.side = side;
	}

	@Override
	public String area() {
		return df.format(Math.pow(side, 2));
	}

	@Override
	public String perimeter() {
		return df.format(4*side);
	}

}
