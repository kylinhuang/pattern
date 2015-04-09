package com.kylin.pattern.factory.abstractFactory;

import com.kylin.pattern.factory.Sender;
import com.kylin.pattern.factory.SmsSender;

public class SendSmsFactory  implements Provider {

	@Override
	public Sender produce() {
		return new SmsSender();
	}

}
