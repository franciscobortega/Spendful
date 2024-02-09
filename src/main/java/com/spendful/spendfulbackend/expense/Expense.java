package com.spendful.spendfulbackend.expense;

import java.time.LocalDate;

public class Expense {

    private Long id;
    private double amount;
    private LocalDate expenseDate;
    private String merchant;
    private String budgetCategory;
    private String paymentMethod;
    private String description;

    // Constructors

    public Expense() {
    }

    public Expense(Long id, double amount, LocalDate expenseDate, String merchant, String budgetCategory, String paymentMethod, String description) {
        this.id = id;
        this.amount = amount;
        this.expenseDate = expenseDate;
        this.merchant = merchant;
        this.budgetCategory = budgetCategory;
        this.paymentMethod = paymentMethod;
        this.description = description;
    }

    public Expense(double amount, LocalDate expenseDate, String merchant, String budgetCategory, String paymentMethod, String description) {
        this.amount = amount;
        this.expenseDate = expenseDate;
        this.merchant = merchant;
        this.budgetCategory = budgetCategory;
        this.paymentMethod = paymentMethod;
        this.description = description;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(LocalDate expenseDate) {
        this.expenseDate = expenseDate;
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public String getBudgetCategory() {
        return budgetCategory;
    }

    public void setBudgetCategory(String budgetCategory) {
        this.budgetCategory = budgetCategory;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "id=" + id +
                ", amount=" + amount +
                ", expenseDate=" + expenseDate +
                ", merchant='" + merchant + '\'' +
                ", budgetCategory='" + budgetCategory + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
