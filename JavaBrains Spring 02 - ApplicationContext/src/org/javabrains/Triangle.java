package org.javabrains;

public class Triangle {
	
	private String type;
	private int height;
		


	//setter
	public void setType(String type) {
		this.type = type;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public String getType() {
		return type;
	}
	
	public int getHeight() {
		return height;
	}

	public void draw(){
		System.out.println(getType() + " triangle drawn");
		System.out.println("The Height is " + getHeight());
	}




}
