package MainLibrarySOLID;

import java.util.Date;

import java.util.Date;

public class Loan {
    private String loanId;
    private String userId;
    private String bookIsbn;
    private Date loanDate;
    private Date dueDate;
    private boolean isReturned;

    // Constructor
    public Loan(String loanId, String userId, String bookIsbn, Date loanDate, Date dueDate) {
        this.loanId = loanId;
        this.userId = userId;
        this.bookIsbn = bookIsbn;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
        this.isReturned = false;
    }

    // Getters and Setters
    // Other methods
}
