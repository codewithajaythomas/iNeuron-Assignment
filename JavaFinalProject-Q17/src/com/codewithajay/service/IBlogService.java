package com.codewithajay.service;

import java.util.List;

import com.codewithajay.dto.Blog;

public interface IBlogService {

	String savePost(Blog post);
	List<Blog> getAllPosts();

}
