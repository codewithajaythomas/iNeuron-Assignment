package com.codewithajay.daofactory;

import com.codewithajay.repository.IStudentDao;
import com.codewithajay.repository.StudentDaoImpl;

public class StudentDaoFactory {

	private StudentDaoFactory() {}

	private static IStudentDao studentDao = null;

	public static IStudentDao getStudentDao() {
		if (studentDao == null) {
			studentDao = new StudentDaoImpl();
		}
		return studentDao;
	}
}
