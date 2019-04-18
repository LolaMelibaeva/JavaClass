package com.class24_2;

public class GameConsole {

	int numberOfController;
	String controller;
	String powerSource;
	boolean cd;
	boolean ifTvNeeded;
	;
	
	void ableToPlay () {
		System.out.println("I can play games");
	}
	void readDisk() {
		System.out.println("I can read disk");
	}
	boolean surfWeb() {
		return true;
	}
	boolean portable () {
		return false;
	}
	}
