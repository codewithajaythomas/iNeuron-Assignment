package com.codewithajay.service;

import com.codewithajay.daofactory.StudentDaoFactory;
import com.codewithajay.dto.Student;
import com.codewithajay.repository.IStudentDao;

public class StudentServiceImpl implements IStudentService {

	private IStudentDao stdDao;

	@Override
	public String addStudent(String sname, Integer sage, String saddress) {
		stdDao = StudentDaoFactory.getStudentDao();
		return stdDao.addStudent(sname, sage, saddress);
	}

	@Override
	public Student searchStudent(Integer sid) {
		stdDao = StudentDaoFactory.getStudentDao();
		return stdDao.searchStudent(sid);
	}

	@Override
	public String updateStudent(Integer sid, String sname, Integer sage, String saddress) {
		stdDao = StudentDaoFactory.getStudentDao();
		return stdDao.updateStudent(sid, sname, sage, saddress);
	}

	@Override
	public String deleteStudent(Integer sid) {
		stdDao = StudentDaoFactory.getStudentDao();
		return stdDao.deleteStudent(sid);
	}

}
