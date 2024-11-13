package desafioprojetos;

import java.util.*;

public class ExpenseManager {
    private List<Expense> expenses;
    private EmailService emailService;

    public ExpenseManager(EmailService emailService) {
        this.expenses = new ArrayList<>();
        this.emailService = emailService;
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
        emailService.sendEmail("Nova despesa adicionada: " + expense);
    }

    public void updateExpense(Expense expense) {
        // Atualize a despesa aqui
        emailService.sendEmail("Despesa atualizada: " + expense);
    }

    // Outros métodos de gerenciamento de despesas
}
