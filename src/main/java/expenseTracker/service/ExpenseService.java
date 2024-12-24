package expenseTracker.service;

import expenseTracker.entity.Expense;

import java.util.List;

public interface ExpenseService {
    //Body of the method
    List<Expense> getAllExpenses();
}
