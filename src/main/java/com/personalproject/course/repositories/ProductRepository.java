package com.personalproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personalproject.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
