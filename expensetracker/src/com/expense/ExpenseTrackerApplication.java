package com.expense;

import com.expense.dto.ExpenseDTO;
import com.expense.service.ExpenseService;
import com.expense.util.InputUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ExpenseTrackerApplication implements CommandLineRunner {

    @Autowired
    private ExpenseService expenseService;

    public static void main(String[] args) {
        SpringApplication.run(ExpenseTrackerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        while (true) {
            showMenu();
            int choice = InputUtil.getIntInput("Enter your choice: ");

            switch (choice) {
                case 1:
                    addExpense();
                    break;
                case 2:
                    viewExpense();
                    break;
                case 3:
                    viewAllExpenses();
                    break;
                case 4:
                    updateExpense();
                    break;
                case 5:
                    deleteExpense();
                    break;
                case 9:
                    System.out.println("Exiting the system...");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private void showMenu() {
        System.out.println("\n===== Expense Tracker Menu =====");
        System.out.println("1. To Create a List of Items as Expense");
        System.out.println("2. To View an Expense");
        System.out.println("3. To View All Expenses");
        System.out.println("4. To Update an Expense");
        System.out.println("5. To Delete an Expense");
        System.out.println("9. To Exit");
    }

    private void addExpense() {
        System.out.println("\n--- Add a New Expense ---");
        String description = InputUtil.getStringInput("Enter expense description: ");
        double amount = InputUtil.getDoubleInput("Enter expense amount: ");
        String date = InputUtil.getStringInput("Enter expense date (YYYY-MM-DD): ");

        ExpenseDTO expenseDTO = new ExpenseDTO(description, amount, date);
        expenseService.addExpense(expenseDTO);
        System.out.println("Expense added successfully.");
    }

    private void viewExpense() {
        int id = InputUtil.getIntInput("\nEnter the expense ID to view: ");
        ExpenseDTO expenseDTO = expenseService.getExpenseById(id);
        if (expenseDTO != null) {
            System.out.println("\nExpense Details:");
            System.out.println("ID: " + expenseDTO.getId());
            System.out.println("Description: " + expenseDTO.getDescription());
            System.out.println("Amount: " + expenseDTO.getAmount());
            System.out.println("Date: " + expenseDTO.getDate());
        } else {
            System.out.println("Expense not found with ID: " + id);
        }
    }

    private void viewAllExpenses() {
        List<ExpenseDTO> expenses = expenseService.getAllExpenses();
        if (expenses.isEmpty()) {
            System.out.println("No expenses found.");
        } else {
            System.out.println("\nAll Expenses:");
            for (ExpenseDTO expenseDTO : expenses) {
                System.out.println("ID: " + expenseDTO.getId() + ", Description: " + expenseDTO.getDescription() + 
                                   ", Amount: " + expenseDTO.getAmount() + ", Date: " + expenseDTO.getDate());
            }
        }
    }

    private void updateExpense() {
        int id = InputUtil.getIntInput("\nEnter the expense ID to update: ");
        ExpenseDTO expenseDTO = expenseService.getExpenseById(id);
        if (expenseDTO != null) {
            String description = InputUtil.getStringInput("Enter new description (leave empty to keep current): ");
            double amount = InputUtil.getDoubleInput("Enter new amount (leave empty to keep current): ");
            String date = InputUtil.getStringInput("Enter new date (leave empty to keep current): ");

            if (!description.isEmpty()) expenseDTO.setDescription(description);
            if (amount > 0) expenseDTO.setAmount(amount);
            if (!date.isEmpty()) expenseDTO.setDate(date);

            expenseService.updateExpense(expenseDTO);
            System.out.println("Expense updated successfully.");
        } else {
            System.out.println("Expense not found with ID: " + id);
        }
    }

    private void deleteExpense() {
        int id = InputUtil.getIntInput("\nEnter the expense ID to delete: ");
        boolean success = expenseService.deleteExpense(id);
        if (success) {
            System.out.println("Expense deleted successfully.");
        } else {
            System.out.println("Expense not found with ID: " + id);
        }
    }
}
