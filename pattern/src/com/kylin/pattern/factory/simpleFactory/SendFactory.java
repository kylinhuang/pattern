package com.kylin.pattern.factory.simpleFactory;

import com.kylin.pattern.factory.MailSender;
import com.kylin.pattern.factory.Sender;
import com.kylin.pattern.factory.SmsSender;

public class SendFactory {
	
	public Sender produce(String type) {  
        if ("mail".equals(type)) {  
            return new MailSender();  
        } else if ("sms".equals(type)) {  
            return new SmsSender();  
        } else {  
            System.out.println("请输入正确的类型!");  
            return null;  
        }  
    }  

}
