package com.codewithajay.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithajay.model.Orders;

public interface IOrdersDao extends JpaRepository<Orders, Integer>{

}
