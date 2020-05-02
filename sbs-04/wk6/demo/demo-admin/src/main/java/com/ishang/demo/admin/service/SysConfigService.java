package com.ishang.demo.admin.service;

import java.util.List;

import com.ishang.demo.admin.model.SysConfig;
import com.ishang.demo.core.service.CurdService;

 
/**
 * 系统配置管理
 * 
 *
 * create by zhayao 2020年3月30日
 */
public interface SysConfigService extends CurdService<SysConfig> {

	/**
	 * 根据名称查询
	 * @param lable
	 * @return
	 */
	List<SysConfig> findByLable(String lable);
}
