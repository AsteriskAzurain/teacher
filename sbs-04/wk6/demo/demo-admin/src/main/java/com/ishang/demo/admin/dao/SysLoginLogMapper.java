package com.ishang.demo.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ishang.demo.admin.model.SysLog;
import com.ishang.demo.admin.model.SysLoginLog;

public interface SysLoginLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysLoginLog record);

    int insertSelective(SysLoginLog record);

    SysLoginLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysLoginLog record);

    int updateByPrimaryKey(SysLoginLog record);
    
    List<SysLog> findPage();
    
    List<SysLog> findPageByUserName(@Param(value="userName") String userName);
    
    List<SysLog> findPageByStatus(@Param(value="status") String status);

    /**
     * 
     * @param userName
     * @param statusOnline
     * @return
     * create by zhayao 2020年4月1日
     */
	List<SysLoginLog> findByUserNameAndStatus(String userName, String statusOnline);
}