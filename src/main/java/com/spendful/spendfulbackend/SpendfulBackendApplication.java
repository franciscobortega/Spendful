package com.spendful.spendfulbackend;

import com.spendful.spendfulbackend.expense.Expense;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class SpendfulBackendApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpendfulBackendApplication.class, args);
	}

	@GetMapping
	public List<Expense> testingExpenses() {
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
