package com.codewithajay.service;

import java.util.List;

import com.codewithajay.daofactory.StudentDaoFactory;
import com.codewithajay.dto.Student;
import com.codewithajay.repository.IStudentDao;

public class StudentServiceImpl implements IStudentService {

	private IStudentDao stdDao;

	@Override
	public List<Student> searchStudent() {
		stdDao = StudentDaoFactory.getStudentDao();
		return stdDao.searchStudent();
	}

}
