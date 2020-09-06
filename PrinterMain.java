package com.sinlgeton;

public class PrinterMain {

	public static void main(String[] args) {
		Printer printer1 = Printer.getPrinter();
		printer1.print();
		
		Printer printer2 = Printer.getPrinter();
		printer2.print();
		
		if(printer1 ==printer2) {
			System.out.println("Singleton design pattern implemented");
		}
	}

}
