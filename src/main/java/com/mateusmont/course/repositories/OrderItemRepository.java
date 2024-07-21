package com.mateusmont.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateusmont.course.entities.OrderItem;
import com.mateusmont.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}