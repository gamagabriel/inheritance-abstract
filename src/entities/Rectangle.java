package entities;

import entities.enums.Color;

public class Rectangle extends Shape {

		private Double width;
		private Double height;
		
	public Rectangle () {}
	
	public Rectangle(Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	
	public Double getWeith() {
		return width;
	}

	public void setWeith(Double weith) {
		this.width = weith;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public double area() {
	return width*height;	
	}

		
}
