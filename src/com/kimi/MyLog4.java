package com.kimi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyLog4 {
	static final Logger log = LoggerFactory.getLogger(MyLog4.class);

	public void log() {
		log.debug("mylog 4 Debug message");
		log.info("mylog 4 Info message");
		log.warn("mylog 4 Warn message");
		log.error("mylog 4 Error message");
	}
}
