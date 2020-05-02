package com.ishang.demo.admin.service;

import com.ishang.demo.admin.model.SysLoginLog;
import com.ishang.demo.core.service.CurdService;

/**
 * 登录日志
 * create by zhayao 2020年3月30日
 */
public interface SysLoginLogService extends CurdService<SysLoginLog> {

	/**
	 * 记录登录日志
	 * @param userName
	 * @param ip
	 * @return
	 */
	int writeLoginLog(String username, String ipAddr);

}
