package com.codewithajay.repository;

import java.util.List;

import com.codewithajay.dto.Student;

public interface IStudentDao {
	public List<Student> searchStudent();
}
