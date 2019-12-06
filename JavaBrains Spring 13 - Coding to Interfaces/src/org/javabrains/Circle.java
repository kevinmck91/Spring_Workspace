package org.javabrains;

public class Circle implements Shape {
	
	private Point center;
	
	public void draw() {
		
		System.out.println("triangle drawing : ");
		System.out.println("circle : Point is (" + center.getX() + "," + center.getY() + ")");
		
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}



}
