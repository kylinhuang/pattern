package com.kylin.pattern.builder;

public class Test {
	
  public static void main(String[] args) {    
     Builder mingong = new Mingong();    
     Designer  designer = new  Designer();    
     designer.order(mingong);    
     mingong.getRoom();    
  }
}
