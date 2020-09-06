package com.sinlgeton

class President{
  private static President instance;
  
  private President(){}
  
  public static getPresident(){
    if(instance == null)
      instance = new President();
     return instance;
  }
}
