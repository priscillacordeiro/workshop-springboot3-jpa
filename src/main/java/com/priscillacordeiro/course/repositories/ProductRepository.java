package com.priscillacordeiro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priscillacordeiro.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
