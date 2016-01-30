package com.zq.sub1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MyLog3 {
	static final Logger log = LoggerFactory.getLogger(MyLog3.class);

	public void log() {
		log.debug("mylog 3 Debug message");
		log.info("mylog 3 Info message");
		log.warn("mylog 3 Warn message");
		log.error("mylog 3 Error message");
	}
}
