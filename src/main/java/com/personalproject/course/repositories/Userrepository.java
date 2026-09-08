package com.personalproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personalproject.course.entities.User;

public interface Userrepository extends JpaRepository<User, Long> {

}
