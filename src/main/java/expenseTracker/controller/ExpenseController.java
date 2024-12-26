package expenseTracker.controller;

import expenseTracker.entity.Expense;
import expenseTracker.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {
    @Autowired
    private ExpenseService expenseService;
    @GetMapping
    public List<Expense> getAllExpanses(){
       return expenseService.getAllExpenses();
    }
    @GetMapping("/{id}")
    public Expense getExpenseById(@PathVariable(value = "id") long id){
        return expenseService.getExpenseByUserId(id);
    }
    @DeleteMapping("/{id}")
    public void deleteExpenseById(@PathVariable("id") long id){
         expenseService.deleteExpenseById(id);

    }
    @PostMapping()
    public void saveExpenses(@RequestBody Expense expense){
        expenseService.saveExpense(expense);

    }
    @PutMapping("/{id}")
    public void modifyExpenses(@PathVariable Long id , @RequestBody Expense expense){
        expenseService.UpdateExpenses(id,expense);
    }
}
