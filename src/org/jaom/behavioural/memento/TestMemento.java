package org.jaom.behavioural.memento;

public class TestMemento {
	public static void main(String[] args) {

		Caretaker caretaker = new Caretaker();

		Originator fileWriter = new Originator("data.txt");
		fileWriter.write("First Set of Data\n");
		System.out.println(fileWriter + "\n\n");

		// lets save the file
		caretaker.save(fileWriter);
		// now write something else
		fileWriter.write("Second Set of Data\n");

		// checking file contents
		System.out.println(fileWriter + "\n\n");

		// lets undo to last save
		caretaker.undo(fileWriter);

		// checking file content again
		System.out.println(fileWriter + "\n\n");

	}
}
