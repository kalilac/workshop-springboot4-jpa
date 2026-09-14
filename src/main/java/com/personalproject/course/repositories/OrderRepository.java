package com.personalproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personalproject.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
