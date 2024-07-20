package com.mateusmont.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateusmont.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
