package com.samoilovich.spring_boot.spring_boot.dao;

import com.samoilovich.spring_boot.spring_boot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Long> {
}