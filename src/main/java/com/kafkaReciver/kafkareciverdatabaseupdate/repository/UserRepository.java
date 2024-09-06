package com.kafkaReciver.kafkareciverdatabaseupdate.repository;

import com.kafkaReciver.kafkareciverdatabaseupdate.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}