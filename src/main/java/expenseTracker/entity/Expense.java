package expenseTracker.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_expenses")
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
    @Column(name ="expense_name" )
private String name;
    @Column(name = "description")
private String description;
    @Column(name = "expense_amount")
private BigDecimal amount;
    @Column(name = "category")
private String category;
    @Column(name = "date")
private Date date;
}
