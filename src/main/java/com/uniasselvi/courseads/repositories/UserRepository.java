package com.uniasselvi.courseads.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uniasselvi.courseads.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
