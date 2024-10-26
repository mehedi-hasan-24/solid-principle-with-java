package srp.yes;

class LibraryService {
    public void borrowBook(Book book) {
        // logic for borrowing
        System.out.println(book.getDetails() + " has been borrowed.");
    }

    public void returnBook(Book book) {
        // logic for returning
        System.out.println(book.getDetails() + " has been returned.");
    }
}
