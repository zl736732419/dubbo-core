package com.zheng.service;

import java.io.InputStream;

import com.zheng.domain.FileWrapper;

/**
 * hessian协议传递文件流
 * @author zhenglian
 */
public interface FileService {
	public InputStream getFileStream();
	
	public FileWrapper getFileStreams();
}
