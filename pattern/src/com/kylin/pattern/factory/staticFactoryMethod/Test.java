package com.kylin.pattern.factory.staticFactoryMethod;

import com.kylin.pattern.factory.Sender;

public class Test {
 
	public static void main(String[] args) {
        Sender sender = SendFactory.produceMail();  
        sender.Send();  
	}

}
