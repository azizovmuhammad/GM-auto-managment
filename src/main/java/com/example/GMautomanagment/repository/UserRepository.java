package com.example.GMautomanagment.repository;

import com.example.GMautomanagment.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
