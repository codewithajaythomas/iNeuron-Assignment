package com.codewithajay.repository;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.codewithajay.dto.Student;
import com.codewithajay.util.JdbcUtil;

public class StudentDaoImpl implements IStudentDao {

	Connection connection = null;
	PreparedStatement pstmt = null;
	ResultSet resultSet = null;

	
	@Override
	public List<Student> searchStudent() {
		String sqlSelectQuery = "select sid,sname,sage,saddress from student";
		Student student = null;
		List<Student> allStudents = new ArrayList<>();

		try {
			connection = JdbcUtil.getJdbcConnection();

			if (connection != null)
				pstmt = connection.prepareStatement(sqlSelectQuery);

			if (pstmt != null) {
				resultSet = pstmt.executeQuery();
			}

			if (resultSet != null) {

				while (resultSet.next()) {
					student = new Student();
					
					// copy resultSet data to student object
					student.setSid(resultSet.getInt(1));
					student.setSname(resultSet.getString(2));
					student.setSage(resultSet.getInt(3));
					student.setSaddress(resultSet.getString(4));
					
					allStudents.add(student);
				}
			}

		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}

		return allStudents;
	}
}
