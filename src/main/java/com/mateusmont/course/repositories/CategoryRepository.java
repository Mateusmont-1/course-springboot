package com.mateusmont.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateusmont.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
