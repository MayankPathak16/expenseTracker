package expenseTracker.service;

import expenseTracker.entity.Expense;
import expenseTracker.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseServiceImpl implements ExpenseService {
    @Autowired
    private ExpenseRepository expenseRepository;

    /**
     * @return
     */
    @Override
    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Expense getExpenseByUserId(long id) {
        //First need to check whether It is present or not
        Optional<Expense> expense = expenseRepository.findById(id);
        if (expense.isPresent()) {
            return expense.get();
        }
        throw new RuntimeException("Expense not found with id: " + id);


    }

    /**
     * @param id
     * @return
     */
    @Override
    public void deleteExpenseById(Long id) {
        expenseRepository.deleteById(id);

    }

    /**
     * @return
     */
    @Override
    public Expense saveExpense(Expense expense) {
       return  expenseRepository.save(expense);
    }

    /**
     * @param id
     * @param expense
     * @return
     */
    @Override
    public Expense UpdateExpenses(Long id, Expense expense) {
        Expense existingExpense = getExpenseByUserId(id);
        existingExpense.setName(expense.getName()!=null?expense.getName():existingExpense.getName());
        existingExpense.setDescription(expense.getDescription()!=null?expense.getDescription():existingExpense.getDescription());
        existingExpense.setAmount(expense.getAmount()!=null?expense.getAmount():existingExpense.getAmount());
        existingExpense.setCategory(expense.getCategory()!=null?expense.getCategory():existingExpense.getCategory());
        existingExpense.setDate(expense.getDate()!=null?expense.getDate():existingExpense.getDate());
        return expenseRepository.save(existingExpense);

    }

}
