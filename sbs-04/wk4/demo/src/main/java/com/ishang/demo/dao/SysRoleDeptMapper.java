package com.ishang.demo.dao;

import com.ishang.demo.model.SysRoleDept;

public interface SysRoleDeptMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysRoleDept record);

    int insertSelective(SysRoleDept record);

    SysRoleDept selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRoleDept record);

    int updateByPrimaryKey(SysRoleDept record);
}