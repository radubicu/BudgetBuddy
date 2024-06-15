package com.example.service.service;

import com.example.service.model.Budget;
import com.example.service.repository.BudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetService {

    @Autowired
    private BudgetRepository budgetRepository;

    public List<Budget> getAllBudgets() {
        return budgetRepository.findAll();
    }

    public Budget addBudget(Budget budget) {
        return budgetRepository.save(budget);
    }
}
