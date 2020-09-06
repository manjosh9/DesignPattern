package com.sinlgeton;

public class Printer {
	private static Printer printer;
	
	private Printer(){
		System.out.println("Singleton object of Printer created");
	}
	
	public synchronized static Printer getPrinter() {
		if(printer == null)
			printer = new Printer();
		return printer;
	}
	
	public void print() {
		System.out.println("Printing your documents...");
	}
}
