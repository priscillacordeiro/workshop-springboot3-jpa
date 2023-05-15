package com.priscillacordeiro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priscillacordeiro.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
