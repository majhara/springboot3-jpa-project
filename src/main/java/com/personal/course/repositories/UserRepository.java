package com.personal.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.personal.course.entities.User;

@EnableJpaRepositories()
public interface UserRepository extends JpaRepository<User, Long> {

}
