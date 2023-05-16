package com.priscillacordeiro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priscillacordeiro.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
