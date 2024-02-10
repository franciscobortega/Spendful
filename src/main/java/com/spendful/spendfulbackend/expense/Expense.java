package com.spendful.spendfulbackend.expense;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Date;

@Document("spendful")
public class Expense {

    @Id
    private String id;
    private double amount;
    private Date expenseDate;
    private String merchant;
    private String budgetCategory;
    private String paymentMethod;
    private String description;

    // Constructors

    public Expense() {
    }

    public Expense(String id, double amount, Date expenseDate, String merchant, String budgetCategory, String paymentMethod, String description) {
        this.id = id;
        this.amount = amount;
        this.expenseDate = expenseDate;
        this.merchant = merchant;
        this.budgetCategory = budgetCategory;
        this.paymentMethod = paymentMethod;
        this.description = description;
    }

    public Expense(double amount, Date expenseDate, String merchant, String budgetCategory, String paymentMethod, String description) {
        this.amount = amount;
        this.expenseDate = expenseDate;
        this.merchant = merchant;
        this.budgetCategory = budgetCategory;
        this.paymentMethod = paymentMethod;
        this.description = description;
    }

    // Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(Date expenseDate) {
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
