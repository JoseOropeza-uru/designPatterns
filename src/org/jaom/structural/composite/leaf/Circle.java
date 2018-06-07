package org.jaom.structural.composite.leaf;

import org.jaom.structural.composite.Shape;

public class Circle implements Shape{
	@Override
	public void draw(String fillColor) {
		System.out.println("Drawing Circle with color "+fillColor);
	}
}
