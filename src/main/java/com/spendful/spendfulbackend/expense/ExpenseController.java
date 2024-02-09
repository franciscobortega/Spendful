package com.spendful.spendfulbackend.expense;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/expenses")
public class ExpenseController {

    @GetMapping
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
