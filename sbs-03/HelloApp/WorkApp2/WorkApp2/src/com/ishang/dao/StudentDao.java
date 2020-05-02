package com.ishang.dao;

import java.util.List;

import com.ishang.entity.StudentTo;

public interface StudentDao {
	
	public List<StudentTo> SearchByEntity(StudentTo t);

}
