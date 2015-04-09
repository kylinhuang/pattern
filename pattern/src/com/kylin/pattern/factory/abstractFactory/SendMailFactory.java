package com.kylin.pattern.factory.abstractFactory;

import com.kylin.pattern.factory.MailSender;
import com.kylin.pattern.factory.Sender;

public class SendMailFactory implements Provider{

	@Override
	public Sender produce() {
		return new MailSender();  
	}

}
