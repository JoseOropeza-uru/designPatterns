package org.jaom.structural.proxy;

public class CommandExecutorImpl implements CommandExecutor{
	
	@Override
	public void runCommand(String cmd) throws Exception {
		// TODO Auto-generated method stub
		Runtime.getRuntime().exec(cmd);
		System.out.println("Command '"+cmd+"' Excecuted");
	}

}
