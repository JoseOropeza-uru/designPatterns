package org.jaom.creational.singleton;

public class ThreadSafe1 {

		private static ThreadSafe1  threadSafe1 = null;
		
		private ThreadSafe1 () {}
		
		public static synchronized ThreadSafe1 getInstance () {
			if(threadSafe1==null) {
				threadSafe1 = new ThreadSafe1();
			}
			return threadSafe1;
		}
		
}
