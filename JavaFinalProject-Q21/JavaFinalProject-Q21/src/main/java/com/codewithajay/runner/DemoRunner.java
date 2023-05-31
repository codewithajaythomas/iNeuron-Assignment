package com.codewithajay.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.codewithajay.dao.IStudentDao;
import com.codewithajay.model.Student;

@Component
public class DemoRunner implements CommandLineRunner {
	
	@Autowired
	private IStudentDao studentDao;

	@Override
	public void run(String... args) throws Exception {
		
		Student student = new Student();
		student.setSname("Chacko");
		student.setSage(23);
		student.setSaddress("Kerala");
		Student result = studentDao.save(student);
		System.out.println(result);

	}

}
