package org.jaom.creational.prototype;

public class PrototypeTest {
	public static void main(String[] args) {
	      ShapeCached.loadCache();

	      Shape clonedShape = (Shape) ShapeCached.getShape("1");
	      System.out.println("Shape : " + clonedShape.getType());		

	      Shape clonedShape2 = (Shape) ShapeCached.getShape("2");
	      System.out.println("Shape : " + clonedShape2.getType());		

	      Shape clonedShape3 = (Shape) ShapeCached.getShape("3");
	      System.out.println("Shape : " + clonedShape3.getType());		
	   }
}
