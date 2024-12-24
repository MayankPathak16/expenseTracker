package expenseTracker.service;

import expenseTracker.entity.Expense;
import expenseTracker.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService{
    @Autowired
    private ExpenseRepository expenseRepository;

    /**
     * @return
     */
    @Override
    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }
}
