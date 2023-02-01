package com.personal.course.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.personal.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
