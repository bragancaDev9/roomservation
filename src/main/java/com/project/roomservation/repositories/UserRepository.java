package com.project.roomservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.project.roomservation.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	UserDetails findByLogin(String login);
}
