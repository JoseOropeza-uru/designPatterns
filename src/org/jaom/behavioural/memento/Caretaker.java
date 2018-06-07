package org.jaom.behavioural.memento;

public class Caretaker {
	private Object obj;

	public void save(Originator fileWriter) {
		this.obj = fileWriter.save();
	}

	public void undo(Originator fileWriter) {
		fileWriter.undoToLastSave(obj);
	}
}
