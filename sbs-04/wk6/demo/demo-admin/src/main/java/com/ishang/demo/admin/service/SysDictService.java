package com.ishang.demo.admin.service;

import java.util.List;

import com.ishang.demo.admin.model.SysDict;
import com.ishang.demo.core.service.CurdService;

/**
 * 字典管理
 * create by zhayao 2020年3月30日
 */
public interface SysDictService extends CurdService<SysDict> {

	/**
	 * 根据名称查询
	 * @param lable
	 * @return
	 */
	List<SysDict> findByLable(String lable);
}
