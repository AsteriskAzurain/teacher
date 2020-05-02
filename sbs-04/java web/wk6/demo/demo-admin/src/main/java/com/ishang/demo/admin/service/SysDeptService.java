package com.ishang.demo.admin.service;

import java.util.List;

import com.ishang.demo.admin.model.SysDept;
import com.ishang.demo.core.service.CurdService;

 
/**
 * 机构管理
 * 
 *
 * create by zhayao 2020年3月30日
 */
public interface SysDeptService extends CurdService<SysDept> {

	/**
	 * 查询机构树
	 * @param userId 
	 * @return
	 */
	List<SysDept> findTree();
}
