package com.sharnel.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.sharnel.demo.model.Order;

public interface OrderRepository extends CrudRepository<Order, Integer>{

}
