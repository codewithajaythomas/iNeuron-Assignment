package com.codewithajay.main;

import com.codewithajay.shapes.Shape;
import com.codewithajay.shapes.impl.Circle;
import com.codewithajay.shapes.impl.Rectangle;
import com.codewithajay.shapes.impl.Square;
import com.codewithajay.shapes.impl.Triangle;

public class ShapesApp {
	
	public static void main(String[] args) {
		
		Shape shape = null;
		
		shape = new Circle(5);
		
		System.out.println("Perimeter of the Circle : "+ shape.perimeter());
		System.out.println("Area of the Circle : "+ shape.area());
		
		shape = new Square(5);
		
		System.out.println("Perimeter of the Square : "+ shape.perimeter());
		System.out.println("Area of the Circle : "+ shape.area());
		
		shape = new Rectangle(10,5);
		
		System.out.println("Perimeter of the Rectangle : "+ shape.perimeter());
		System.out.println("Area of the Rectangle : "+ shape.area());
		
		shape = new Triangle(5,10,10,5,10);
		
		System.out.println("Perimeter of the Triangle : "+ shape.perimeter());
		System.out.println("Area of the Triangle : "+ shape.area());
		
	}

}
