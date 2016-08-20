package com.zheng.service.impl;

import com.zheng.service.HelloService;

public class HelloServiceImplMock implements HelloService {

	@Override
	public String sayHello(String name) {
		System.out.println("execute mock handle ....");
		return "出错了!";
	}

}
