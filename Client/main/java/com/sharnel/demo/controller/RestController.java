package com.sharnel.demo.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sharnel.demo.model.Order;
import com.sharnel.demo.services.OrderServices;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	private OrderServices orderService;
	
	
	
	
	@GetMapping("saveorder")
	public String saveOrder(@RequestParam int OrderId ,@RequestParam int UserId,@RequestParam String CustomerName, @RequestParam int ProductId,@RequestParam String content , @RequestParam float Amount,@RequestParam Date OrderDate ) {
		
		Order order = new Order(OrderId,UserId,CustomerName,ProductId,Amount,OrderDate );
		 orderService.savemyorder(order);
		return "Order Saved!!";
		
	}
}
