package com.zheng.service.impl;

import com.zheng.service.HelloService;

public class HelloServiceImplStub implements HelloService {

	private HelloService helloService;
	
	public HelloServiceImplStub(HelloService helloService) {
		this.helloService = helloService;
	}
	
	@Override
	public String sayHello(String name) {
		System.out.println("prefore invoke remote method.....");
		return helloService.sayHello(name);
	}

}
