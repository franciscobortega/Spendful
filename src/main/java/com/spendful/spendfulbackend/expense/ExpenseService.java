package com.spendful.spendfulbackend.expense;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class ExpenseService {

    public List<Expense> getAllExpenses() {
        return List.of(
                new Expense(
                        1L,
                        24.97,
                        LocalDate.of(2023, Month.FEBRUARY, 9),
                        "Walmart",
                        "Groceries",
                        "Visa",
                        "First entry"
                )
        );
    }
}
