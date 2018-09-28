package org.jaom.behavioural.observer;

public abstract class Observer {
		public Subject subject;
	//method to update the observer, used by subject
		public abstract void update();
}
