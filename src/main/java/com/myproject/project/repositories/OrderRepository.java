package com.myproject.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
