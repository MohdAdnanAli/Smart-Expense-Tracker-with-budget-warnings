package com.expense.repository;

import com.expense.entity.Funds;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FundsRepository extends JpaRepository<Funds, Integer> {
    List<Funds> findByUser_UserId(int userId); // Find funds by user ID
}
