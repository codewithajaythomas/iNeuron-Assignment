package com.codewithajay.service;

import java.util.List;

import com.codewithajay.daofactory.BlogDaoFactory;
import com.codewithajay.dto.Blog;
import com.codewithajay.repository.IBlogDao;

public class BlogServiceImpl implements IBlogService {

	private IBlogDao blogDao = BlogDaoFactory.getBlogDao();

	@Override
	public String savePost(Blog post) {		
		return blogDao.savePost(post);
	}

	@Override
	public List<Blog> getAllPosts() {
		return blogDao.getAllPosts();
	}


}
