package org.jaom.creational.singleton;

public class ThreadSafe2 {
	private static ThreadSafe2  threadSafe2 = null;
	
	private ThreadSafe2 () {}
	
	public static ThreadSafe2 getInstance () {
		
		if(threadSafe2==null) {
			
			synchronized (ThreadSafe2.class) {
				
	            if(threadSafe2 == null){
	            	threadSafe2 = new ThreadSafe2();
	            }
	        }
			
		}
		return threadSafe2;
	}
}
