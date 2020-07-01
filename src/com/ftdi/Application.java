package com.ftdi;

public class Application {

	public static void main(String[] args) throws FTD2XXException {
		for (FTDevice d : FTDevice.getDevices(true)) {
			System.out.println(d);
		}
	}
}
