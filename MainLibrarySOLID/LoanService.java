package MainLibrarySOLID;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class LoanService {
    private List<Loan> loans = new ArrayList<>();

    public void recordBookLoan(String loanId, String userId, String bookIsbn, Date loanDate, Date dueDate) {
        Loan newLoan = new Loan(loanId, userId, bookIsbn, loanDate, dueDate);
        loans.add(newLoan);
    }

    public void recordBookReturn(String loanId) {
        for (Loan loan : loans) {
            if (loan.getLoanId().equals(loanId)) {
                loan.setReturned(true);
                break;
            }
        }
    }

    public void trackLoanStatus(String loanId) {
        // Implement tracking logic
    }

    public void sendDueDateReminders() {
        // Implement reminder logic
    }

    public void sendOverdueNotifications() {
        // Implement notification logic
    }

    public void calculateLateFees(String loanId) {
        // Implement fee calculation
    }

    public void payLateFees(String loanId) {
        // Implement fee payment
    }

    public List<Loan> viewCurrentLoans(String userId) {
        List<Loan> userLoans = new ArrayList<>();
        for (Loan loan : loans) {
            if (loan.getUserId().equals(userId) && !loan.isReturned()) {
                userLoans.add(loan);
            }
        }
        return userLoans;
    }

    public List<Loan> viewLoanHistory(String userId) {
        List<Loan> userLoans = new ArrayList<>();
        for (Loan loan : loans) {
            if (loan.getUserId().equals(userId)) {
                userLoans.add(loan);
            }
        }
        return userLoans;
    }

    public void extendLoanPeriod(String loanId, Date newDueDate) {
        for (Loan loan : loans) {
            if (loan.getLoanId().equals(loanId)) {
                loan.setDueDate(newDueDate);
                break;
            }
        }
    }
}
