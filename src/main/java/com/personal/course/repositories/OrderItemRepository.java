package com.personal.course.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.personal.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
