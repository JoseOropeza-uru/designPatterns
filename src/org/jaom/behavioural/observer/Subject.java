package org.jaom.behavioural.observer;

public interface Subject {

	//methods to register and unregister observers
	public int getState();
	public void setState(int state);
	
	//method to notify observers of change
	public void notifyAllObservers();
	
	//method to get updates from subject
	public void attach(Observer obj);
}
