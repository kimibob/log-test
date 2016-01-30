package com.zq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyLog2 {
	static final Logger log = LoggerFactory.getLogger(MyLog2.class);
	public void log() {
		log.debug("mylog 2 Debug message");
		log.info("mylog 2 Info message");
		log.warn("mylog 2 Warn message");
		log.error("mylog 2 Error message");
	}

}
