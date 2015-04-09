package com.kylin.pattern.factory.staticFactoryMethod;

import com.kylin.pattern.factory.MailSender;
import com.kylin.pattern.factory.Sender;
import com.kylin.pattern.factory.SmsSender;

public class SendFactory {

	 public static Sender produceMail(){  
        return new MailSender();  
     }  
      
    public static Sender produceSms(){  
        return new SmsSender();  
    }  

}
