package com.spendful.spendfulbackend.expense;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;

    @Autowired
    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public List<Expense> getAllExpenses() {
        List<Expense> expenses = expenseRepository.findAll();
        System.out.println("Retrieved expenses: " + expenses);
        return expenses;
    }

    public Expense saveExpense(Expense expense) {
        return expenseRepository.save(expense);
    }
}
