package com.zheng.service;

import com.zheng.domain.Person;

/**
 * 事件调用
 * 
 * @author zhenglian
 *
 */
public interface EventService {
	public Person get(String username, int age);
}
