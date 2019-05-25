package com.sharnel.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sharnel.demo.model.Order;
import com.sharnel.demo.services.OrderServices;


@Controller
public class AppController {
	
	@Autowired
	private OrderServices orderService;
	
	@RequestMapping("/welcome")
	public String welcome(HttpServletRequest request) {
		
		request.setAttribute("mode", "MODE_HOME");
		return "welcome";
	}
	
	@RequestMapping("/addOrder") 
	public String addition(HttpServletRequest request) {
		
		request.setAttribute("mode", "MODE_ADDPRODUCT");
		return "welcome";
	}
	
	@PostMapping("/save-order")
	public String addOrder(@ModelAttribute Order order , BindingResult bindingResult , HttpServletRequest request ) {
		orderService.savemyorder(order);
	request.setAttribute("mode", "MODE_HOME");	
		return "welcome";
		
	}
	
	@GetMapping("/show-orders")
	public String showAllOrders(HttpServletRequest request) {
		request.setAttribute("orders", orderService.showAllOrders());
		request.setAttribute("mode", "ALL_ORDERS");
		return "welcome"; 
	}
	
	@RequestMapping("/delete-order")
	public String deleteOrder(@RequestParam int OrderId , HttpServletRequest request) {
		orderService.deletemyOrder(OrderId);
		request.setAttribute("orders", orderService.showAllOrders());
		request.setAttribute("mode", "ALL_ORDERS");
		return "welcome";
	}
	
	@RequestMapping("/edit-order")
	public String editProduct(@RequestParam int Orderid , HttpServletRequest request) {
		//request.setAttribute("order", productService.editOrder());
		request.setAttribute("mode", "MODE_UPDATE");
		return "welcome";
	}
	

}