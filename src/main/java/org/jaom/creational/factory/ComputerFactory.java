package org.jaom.creational.factory;

public class ComputerFactory {
	public static Computer getComputer(String type,String ram,String hdd,String cpu) {
		switch(type) {
		case "PC": return new PC(ram,hdd,cpu);
			
		case "Server" : return new Server(ram,hdd,cpu);
		}
		return null;
	}
}
