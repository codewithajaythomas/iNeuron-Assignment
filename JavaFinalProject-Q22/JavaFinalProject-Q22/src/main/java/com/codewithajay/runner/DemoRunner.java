package com.codewithajay.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.codewithajay.dao.IUserDao;
import com.codewithajay.model.Orders;
import com.codewithajay.model.User;

@Component
public class DemoRunner implements CommandLineRunner {
	
	@Autowired
	private IUserDao userDao;

	@Override
	public void run(String... args) throws Exception {
		
		User user = new User();
		user.setName("Ajay Thomas");
		user.setAddress("Kerala");
		
		Orders orders = new Orders();
		orders.setItemName("Football");
		orders.setQuantity(5);
		orders.setUser(user);
		List<Orders> ordersList = new ArrayList<>();
		ordersList.add(orders);
		user.setUserOrders(ordersList);	
		userDao.save(user);
	}

}
