

package com.personal.course.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.personal.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
