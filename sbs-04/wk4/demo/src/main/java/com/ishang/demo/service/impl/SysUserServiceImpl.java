package com.ishang.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ishang.demo.dao.SysUserMapper;
import com.ishang.demo.model.SysUser;
import com.ishang.demo.service.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService {
	
	@Autowired
	private SysUserMapper  sysUserMapper;

	@Override
	public List<SysUser> findAll() {
		 
		return sysUserMapper.findAll();
	}

}
