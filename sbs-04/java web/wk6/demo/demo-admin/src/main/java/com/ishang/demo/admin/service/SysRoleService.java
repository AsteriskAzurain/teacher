package com.ishang.demo.admin.service;

import java.util.List;

import com.ishang.demo.admin.model.SysMenu;
import com.ishang.demo.admin.model.SysRole;
import com.ishang.demo.admin.model.SysRoleMenu;
import com.ishang.demo.core.service.CurdService;

/**
 * 角色管理
 *  create by zhayao 2020年3月30日
 */
public interface SysRoleService extends CurdService<SysRole> {

	/**
	 * 查询全部
	 * @return
	 */
	List<SysRole> findAll();

	/**
	 * 查询角色菜单集合
	 * @return
	 */
	List<SysMenu> findRoleMenus(Long roleId);

	/**
	 * 保存角色菜单
	 * @param records
	 * @return
	 */
	int saveRoleMenus(List<SysRoleMenu> records);

	/**
	 * 根据名称查询
	 * @param name
	 * @return
	 */
	List<SysRole> findByName(String name);

}
