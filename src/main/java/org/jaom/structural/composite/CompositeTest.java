package org.jaom.structural.composite;

import org.jaom.structural.composite.composite.Drawing;
import org.jaom.structural.composite.leaf.Circle;
import org.jaom.structural.composite.leaf.Triangle;

public class CompositeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape tri = new Triangle();
		Shape tri1 = new Triangle();
		Shape cir = new Circle();
		
		Drawing drawing = new Drawing();
		drawing.add(tri1);
		drawing.add(tri1);
		drawing.add(cir);
		
		drawing.draw("Red");
		//al dibujar todos quedan color Rojo
		drawing.clear();
		
		drawing.add(tri);
		drawing.add(cir);
		drawing.draw("Green");
		//al dibujar todos quedan color Verde
	}

}
