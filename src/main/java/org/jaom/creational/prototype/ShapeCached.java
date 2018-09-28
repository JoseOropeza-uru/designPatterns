package org.jaom.creational.prototype;

import java.util.HashMap;

public class ShapeCached {
	private static HashMap<String, Shape> shapeMap  = new HashMap<String, Shape>();

	   public static Shape getShape(String shapeId) {
	      Shape cachedShape = shapeMap.get(shapeId);
	      return (Shape) cachedShape.clone();
	   }

	   // for each shape run database query and create shape
	   // shapeMap.put(shapeKey, shape);
	   // for example, we are adding three shapes
	   
	   public static void loadCache() {
	      Circle circle = new Circle();
	      circle.setId("1");
	      shapeMap.put(circle.getId(),circle);

	      Triangle triangle = new Triangle();
	      triangle.setId("2");
	      shapeMap.put(triangle.getId(),triangle);

	      Rectangle rectangle = new Rectangle();
	      rectangle.setId("3");
	      shapeMap.put(rectangle.getId(), rectangle);
	   }
}
