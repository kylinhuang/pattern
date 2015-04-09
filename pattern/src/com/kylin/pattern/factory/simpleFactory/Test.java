package com.kylin.pattern.factory.simpleFactory;

import com.kylin.pattern.factory.Sender;

public class Test {
	public static void main(String[] args) {  
        SendFactory factory = new SendFactory();  
        Sender sender = factory.produce("sms");  
        sender.Send();  
    } 
}
