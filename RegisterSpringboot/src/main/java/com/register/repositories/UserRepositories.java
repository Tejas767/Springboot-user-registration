package com.register.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.register.entities.User;
import java.util.List;


public interface UserRepositories extends JpaRepository<User, Integer> {
User findByEmail(String email);
}
