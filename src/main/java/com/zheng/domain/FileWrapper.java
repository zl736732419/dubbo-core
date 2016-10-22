package com.zheng.domain;

import java.io.Serializable;
import java.util.List;

import com.google.common.collect.Lists;

public class FileWrapper implements Serializable {
	List<byte[]> inputs = Lists.newArrayList();

	public List<byte[]> getInputs() {
		return inputs;
	}

	public void setInputs(List<byte[]> inputs) {
		this.inputs = inputs;
	}

}
