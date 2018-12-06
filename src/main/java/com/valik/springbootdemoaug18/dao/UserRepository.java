package com.valik.springbootdemoaug18.dao;

import com.valik.springbootdemoaug18.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
