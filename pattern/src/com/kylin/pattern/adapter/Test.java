package com.kylin.pattern.adapter;

public class Test {
	
	 public static void main(String[] args) {
        //狼
        Wolf wolf = new Wolf();
        //披着羊皮的狼
        Sheep sheep = new SheepAdapter(wolf);
         
        sheep.run();
        sheep.ho();
	 }
	 
}
