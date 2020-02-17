/*
 * Name: James Sigler
 * R#: R11481310
 * Assignment: Shape Dimensions
 * */

import java.util.*;

abstract class Shapes
{
	//Abstract perm and area
	public abstract double perimeter();
	public abstract double area();
	
	//Constant PI
	public final double PI = Math.PI;
}


class Circle extends Shapes
{
	//Circle Radius
	private double radius;
	
	//Radius set and get methods
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	//Perimeter of circle 2PIr
	public double perimeter() 
	{
		double perm = 2*PI*radius;
		return perm;
	}
	
	//Area of circle PIr^2
	public double area() 
	{
		double ar = PI * (radius * radius);
		return ar;
	}
}

class Rectangle extends Shapes
{
	//Rectangle width and length
	private double width;
	private double height;
	
	//Set and get methods for width and length
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	
	//Perimeter of rectangle 2*width+2*height
	public double perimeter() {
		double perm = (2*width) + (2*height);
		return perm;
	}
	
	//Area of rectangle width*height
	public double area() {
		double ar = width*height;
		return ar;
	}
}

public class TestShapes
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		//Testing Circle class
		Circle circ = new Circle();
		System.out.print("Enter radius of circle: ");
		double rad = input.nextDouble();
		circ.setRadius(rad);
		System.out.printf("Area of circle: %.2f\n",circ.area());
		System.out.printf("Perimeter of circle: %.2f\n", circ.perimeter());
		
		//Testing Rectangle class
		Rectangle rect = new Rectangle();
		System.out.print("Enter height of rectangle: ");
		double h = input.nextDouble();
		rect.setHeight(h);
		System.out.print("Enter width of rectangle: ");
		double w = input.nextDouble();
		rect.setWidth(w);
		System.out.printf("Area of rectangle: %.2f\n", rect.area());
		System.out.printf("Perimeter of rectangle: %.2f\n", rect.perimeter());
		
		input.close();
	}
}
