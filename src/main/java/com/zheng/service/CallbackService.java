package com.zheng.service;

/**
 * 参数回调接口
 * 
 * @author zhenglian
 *
 */
public interface CallbackService {
	public void addListener(String key, CallbackListener listener);
}
