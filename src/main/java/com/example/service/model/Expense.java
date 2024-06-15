package com.example.service.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "expenses")
public class Expense {
    @Id
    private String id;
    private String userId;
    private String date;
    private double amount;

    public Expense() {
    }

    public Expense(String userId, String date, double amount) {
        this.userId = userId;
        this.date = date;
        this.amount = amount;
    }

}
