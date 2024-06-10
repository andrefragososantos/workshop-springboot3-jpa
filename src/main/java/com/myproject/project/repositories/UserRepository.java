package com.myproject.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
