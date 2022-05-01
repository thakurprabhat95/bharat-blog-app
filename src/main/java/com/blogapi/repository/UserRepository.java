package com.blogapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogapi.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
