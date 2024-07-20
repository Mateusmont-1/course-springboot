package com.mateusmont.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateusmont.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
