package com.kylin.pattern.factory.abstractFactory;

import com.kylin.pattern.factory.Sender;

public class Test {

 
	public static void main(String[] args) {
		 Provider provider = new SendMailFactory();  
	     Sender sender = provider.produce();  
	     sender.Send();

	}

}
