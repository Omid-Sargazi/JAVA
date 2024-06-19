package SOLID.BookClass;

import java.util.List;

public interface BorrowRecordRepository {
    void addBorrowRecord(BorrowRecord record);

    BorrowRecord finBorrowRecord(String isbn, String memberId);

    List<BorrowRecord> getAllBorrowRecords();
}
