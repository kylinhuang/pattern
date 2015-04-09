package com.kylin.pattern.builder;

public class Mingong implements Builder {  
	  private  String window="";  
	  private  String floor="";  
	    
	  public  void makeWindow() {  
	    window=new String("window");  
	  }  
	  
	  public  void makeFloor(){  
	    floor=new String("floor");  
	  }  
	   
	  // 回交房子给房主  
	  public  Room  getRoom() {  
	    if((!window.equals(""))&&(!floor.equals(""))) {  
	      System.out.println("room ready!");  
	      return new Room();  
	    }  
	    else return null;  
	  }  
	}  
