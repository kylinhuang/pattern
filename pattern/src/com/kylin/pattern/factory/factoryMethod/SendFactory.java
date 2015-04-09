package com.kylin.pattern.factory.factoryMethod;

import com.kylin.pattern.factory.MailSender;
import com.kylin.pattern.factory.Sender;
import com.kylin.pattern.factory.SmsSender;

public class SendFactory {
	 public Sender produceMail(){  
	    return new MailSender();  
	 }  
	      
    public Sender produceSms(){  
        return new SmsSender();  
    }  
}
