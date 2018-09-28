package org.jaom.behavioural.observer;

public class ObserverTest {
	public static void main(String[] args) {
		Subject subject = new MyTopic();

	      new HexObserver(subject);
	      new BinaryObserver(subject);

	      System.out.println("First state change: 15");	
	      subject.setState(15);
	      System.out.println("Second state change: 10");	
	      subject.setState(10);
	}
}
