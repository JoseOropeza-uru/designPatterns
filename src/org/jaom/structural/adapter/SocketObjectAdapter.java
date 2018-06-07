package org.jaom.structural.adapter;

public class SocketObjectAdapter implements SocketAdapter {
	
	Socket socket = new Socket();
	@Override
	public Volt get120Volt() {
		return socket.getVolt();
	}

	@Override
	public Volt get12Volt() {
		Volt v = socket.getVolt();
		return convertVolt(v, 10);
	}

	@Override
	public Volt get3Volt() {
		Volt v = socket.getVolt();
		return convertVolt(v, 40);
	}

	public Volt convertVolt(Volt v, int i) {
		v.setVolt(v.getVolt()/i);
		return v;
	}
}
