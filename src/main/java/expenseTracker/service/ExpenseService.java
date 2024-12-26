package expenseTracker.service;

import expenseTracker.entity.Expense;

import java.util.List;

public interface ExpenseService {
    //Get all Expenses
    List<Expense> getAllExpenses();
    //Get Expenses by User Id
    Expense getExpenseByUserId(long id);
    //Delete Expenses using id
    void deleteExpenseById(Long id);
    //Saving a value using Post mapping
    Expense saveExpense(Expense expense);
    //Update the expense
    Expense UpdateExpenses(Long id, Expense expense);

}
