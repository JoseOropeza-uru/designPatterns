package org.jaom.behavioural.command;

public class LinuxFileSystem implements FileSystemReceiver{

	@Override
	public void openFile() {
		System.out.println("Opening file in linux OS");
	}

	@Override
	public void writeFile() {
		System.out.println("Writing file in linux OS");
	}

	@Override
	public void closeFile() {
		System.out.println("Closing file in linux OS");
	}
}
