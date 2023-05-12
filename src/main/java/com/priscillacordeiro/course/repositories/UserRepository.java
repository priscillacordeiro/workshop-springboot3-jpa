package com.priscillacordeiro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priscillacordeiro.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
