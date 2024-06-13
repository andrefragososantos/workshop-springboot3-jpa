package com.myproject.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
