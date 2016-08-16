package com.zheng.domain;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 用于验证dubbo参数验证功能
 * 
 * @author zhenglian
 *
 */
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	@NotNull
	private String username;

	@Min(18)
	@Max(100)
	private int age;

	public Person() {
	}
	
	public Person(String username, int age) {
		super();
		this.username = username;
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("username", username).append("age", age).build();
	}

}
