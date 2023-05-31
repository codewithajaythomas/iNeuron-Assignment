package com.codewithajay.shapes.impl;

import java.text.DecimalFormat;

import com.codewithajay.shapes.Shape;

public class Triangle implements Shape {

	private float base;
	private float height;
	private float a;
	private float b;
	private float c;
	
	private DecimalFormat df = new DecimalFormat("#.00");
	
	/**
	 * 
	 * @param a This is side 1 of the triangle 
	 * @param b This is side 2 of the triangle 
	 * @param c This is side 3 of the triangle 
	 * @param base This is the base of the triangle 
	 * @param height This is the height of the triangle 
	 * 
	 *
	 */
	
	public Triangle(float a,float b,float c,float base, float height) {
		this.base = base;
		this.height = height;
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public String area() {
		return df.format(0.5*base*height);
	}

	@Override
	public String perimeter() {
		return df.format(a+b+c);
	}

}
