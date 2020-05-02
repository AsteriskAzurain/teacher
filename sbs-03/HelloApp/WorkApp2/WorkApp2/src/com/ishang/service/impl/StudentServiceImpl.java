package com.ishang.service.impl;

import java.util.List;

import com.ishang.dao.StudentDao;
import com.ishang.dao.impl.StudentDaoImpl;
import com.ishang.entity.StudentTo;
import com.ishang.service.StudentService;

public class StudentServiceImpl implements StudentService{
	StudentDao studentDao = new StudentDaoImpl();

	@Override
	public boolean checkUser(String usercode) {
		StudentTo s = new StudentTo();
		s.setCode(usercode);;
		List<StudentTo> list = studentDao.SearchByEntity(s);
		return list.size()>0?true:false;
	}

}
