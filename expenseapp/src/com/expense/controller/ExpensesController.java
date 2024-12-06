package com.expense.controller;

import com.expense.entity.Expenses;
import com.expense.service.ExpensesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenses")
public class ExpensesController {

    @Autowired
    private ExpensesService expensesService;

    @PostMapping
    public Expenses addExpense(@RequestBody Expenses expense) {
        return expensesService.addExpense(expense);
    }

    @GetMapping("/{userId}")
    public List<Expenses> getExpensesByUserId(@PathVariable int userId) {
        return expensesService.getExpensesByUserId(userId);
    }

    @DeleteMapping("/{id}")
    public void deleteExpense(@PathVariable int id) {
        expensesService.deleteExpense(id);
    }
}
