package com.example.service.controller;

import com.example.service.model.Budget;
import com.example.service.service.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BudgetController {

    @Autowired
    private BudgetService budgetService;

    @GetMapping("/budgets")
    public List<Budget> getAllBudgets() {
        return budgetService.getAllBudgets();
    }

    @PostMapping("/budgets")
    public Budget addBudget(@RequestBody Budget budget) {
        return budgetService.addBudget(budget);
    }
}
