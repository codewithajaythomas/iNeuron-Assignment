package com.codewithajay.repository;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.codewithajay.dto.Blog;
import com.codewithajay.util.JdbcUtil;

public class BlogDaoImpl implements IBlogDao {

	Connection connection = null;
	PreparedStatement pstmt = null;
	ResultSet resultSet = null;

	@Override
	public String savePost(Blog post) {
		
		int status = 0;
		String response = "";

		String sqlSelectQuery = "insert into blog(title,description,content) values (?,?,?) ";

		try {
			connection = JdbcUtil.getJdbcConnection();

			if (connection != null)
				pstmt = connection.prepareStatement(sqlSelectQuery);

			if (pstmt != null) {
				
				pstmt.setString(1, post.getTitle());
				pstmt.setString(2, post.getDescription());
				pstmt.setString(3, post.getContent());
				
				status = pstmt.executeUpdate();
			}

			if (status > 0)
				response = "success";
			else
				response = "failure";

		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}

		return response;
	}
	
	@Override
	public List<Blog> getAllPosts() {
		
		Blog post = null;
		List<Blog> allPosts = new ArrayList<>();
		
		String sqlSelectQuery = "select title,description,content from blog";

		try {
			connection = JdbcUtil.getJdbcConnection();

			if (connection != null)
				pstmt = connection.prepareStatement(sqlSelectQuery);

			if (pstmt != null) {
				resultSet = pstmt.executeQuery();
			}

			if (resultSet != null) {

				while (resultSet.next()) {
					
					post = new Blog();
				
					post.setTitle(resultSet.getString(1));
					post.setDescription(resultSet.getString(2));
					post.setContent(resultSet.getString(3));
					
					allPosts.add(post);
				}
			}

		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}

		return allPosts;
	}
}
