package com.myproject.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.project.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
