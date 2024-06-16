package com.myproject.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.project.entities.OrderItem;
import com.myproject.project.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
