package com.zq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.kimi.MyLog4;
import com.zq.sub1.MyLog3;

public class MyLog {

	static final Logger log = LoggerFactory.getLogger(MyLog.class);

	public void log() {
		log.debug("mylog 1 Debug message");
		log.info("mylog 1 Info message");
		log.warn("mylog 1 Warn message");
		log.error("mylog 1 Error message");
	}

	public static void main(String[] args) {
		MyLog test = new MyLog();
		test.log();
		MyLog2 test2 = new MyLog2();
		test2.log();
		MyLog3 test3 = new MyLog3();
		test3.log();
		MyLog4 test4 = new MyLog4();
		test4.log();
	}
}
