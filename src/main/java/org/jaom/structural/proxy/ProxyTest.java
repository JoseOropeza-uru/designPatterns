package org.jaom.structural.proxy;

public class ProxyTest {
	public static void main(String[] args){
		CommandExecutor executor = new CommandExecutorProxy("pepe", "123456");
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::"+e.getMessage());
		}
		
	}
}
