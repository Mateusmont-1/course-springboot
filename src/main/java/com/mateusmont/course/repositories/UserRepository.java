package com.mateusmont.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateusmont.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
