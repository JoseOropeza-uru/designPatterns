package org.jaom.creational.singleton;

public class EagerInitialization {
	private static final EagerInitialization EAGER_INITIALIZATION = new EagerInitialization();
	
	//Private constructor
	private EagerInitialization() {}
	
	
	public static EagerInitialization getInstance () {
		return EAGER_INITIALIZATION;
	}
}
