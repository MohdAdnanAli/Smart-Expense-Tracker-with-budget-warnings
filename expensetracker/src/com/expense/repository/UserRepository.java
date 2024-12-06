package com.expense.repository;

import com.expense.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserName(String userName); // Custom query to find a user by their username
}
