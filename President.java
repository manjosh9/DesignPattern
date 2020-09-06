package com.sinlgeton;

public class President {
	private static President instance;

	private President() {
	}

	public static getPresident(){
    if(instance == null)
      instance = new President();
     return instance;
	}
	
	public void show() {
		System.out.println("Hello from PRESIDENT!");
	}
}
