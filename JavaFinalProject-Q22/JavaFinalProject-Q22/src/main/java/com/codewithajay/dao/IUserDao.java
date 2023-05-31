package com.codewithajay.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithajay.model.User;

public interface IUserDao extends JpaRepository<User, Integer> {

}
