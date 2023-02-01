

package com.personal.course.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.personal.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
