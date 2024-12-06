package com.expense.service;

import com.expense.entity.Expenses;
import com.expense.repository.ExpensesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpensesService {

    @Autowired
    private ExpensesRepository expensesRepository;

    public Expenses addExpense(Expenses expense) {
        return expensesRepository.save(expense);
    }

    public List<Expenses> getExpensesByUserId(int userId) {
        return expensesRepository.findByUser_UserId(userId);
    }

    public void deleteExpense(int id) {
        expensesRepository.deleteById(id);
    }
}
