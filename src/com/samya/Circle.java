package com.samya;

import java.awt.Point;

public class Circle implements Shape 
{
	
	private Point center;
	int Diameater;
	
	

	


	public int getDiameater() {
		return Diameater;
	}


	public Point getCenter() {
		return center;
	}


	public void setCenter(Point center) {
		this.center = center;
	}


	@Override
	public void draw() 
	{
		System.out.println("Drawing Circle with diameter: "  +getDiameater());
		
			
	}
	
	public Circle(int Diameater)
	{
		this.Diameater=Diameater;
	}

}
