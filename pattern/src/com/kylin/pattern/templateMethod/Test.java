package com.kylin.pattern.templateMethod;

public class Test {
    public static void main(String[] args) {  
    	Tea tea = new Tea();  
    	Coffee coffee = new Coffee();  
    	  
    	tea.prepareRecipe();  
    	  
    	coffee.prepareRecipe();  
    }  
}
