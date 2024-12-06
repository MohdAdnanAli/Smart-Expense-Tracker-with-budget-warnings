package com.expense.repository;

import com.expense.entity.Expenses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpensesRepository extends JpaRepository<Expenses, Integer> {
    List<Expenses> findByUser_UserId(int userId); // Find expenses by user ID
}
