package com.priscillacordeiro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priscillacordeiro.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
