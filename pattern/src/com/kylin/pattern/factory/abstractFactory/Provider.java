package com.kylin.pattern.factory.abstractFactory;

import com.kylin.pattern.factory.Sender;

public interface Provider {
	public Sender produce();  
}
