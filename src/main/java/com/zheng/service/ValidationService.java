package com.zheng.service;

import javax.validation.constraints.Min;

import com.zheng.domain.Person;

public interface ValidationService {
	
	@interface Descs{}
	public String descs(Person person);
	
	void delete(@Min(1) int id);
}
