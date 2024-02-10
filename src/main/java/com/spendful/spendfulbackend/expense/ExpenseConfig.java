package com.spendful.spendfulbackend.expense;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;
import java.util.List;

@Configuration
public class ExpenseConfig {

    @Bean
    CommandLineRunner commandLineRunner(ExpenseRepository repository){
        return args -> {
            // Clear the database
            repository.deleteAll();

            Expense testExpense1 = new Expense(90.0, new Date(), "Grocery Store", "Pizza", "Credit Card", "Groceries for week 1");
            Expense testExpense2 = new Expense(30.0, new Date(), "Electronics Store", "Electronics", "Cash", "New computer");

            // Save to Spendful database
            repository.saveAll(
                    List.of(testExpense1, testExpense2)
            );
        };
    }
}
