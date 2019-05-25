package com.sharnel.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.sharnel.demo.model.Order;
import com.sharnel.demo.repository.OrderRepository;

@Service
@Transactional
public class OrderServices {

	private final OrderRepository orderRepository;
	
	public OrderServices(OrderRepository orderRepository) {
		
		this.orderRepository = orderRepository;
	}
	
	public void savemyorder(Order order) {
		
		orderRepository.save(order);
	}
	
	public List<Order>showAllOrders(){
		
		List<Order>orders = new ArrayList<Order>();
		for(Order order : orderRepository.findAll()) {
			
			orders.add(order); 
			
		}
		
		return orders;
	}
	
	public void deletemyOrder(int OrderId) {
		
		orderRepository.deleteById(OrderId);
	}
	
	public void editOrder(int OrderId) {
		
		orderRepository.findById(OrderId); 
	}
}
