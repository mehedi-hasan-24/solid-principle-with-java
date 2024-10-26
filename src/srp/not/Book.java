package srp.not;

class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public void borrowBook() {
        isBorrowed = true;
        System.out.println("Book borrowed.");
    }

    public void returnBook() {
        isBorrowed = false;
        System.out.println("Book returned.");
    }

    public String getDetails() {
        return title + " by " + author;
    }

    public void logDetails() {
        System.out.println(" I am a Simple logger");
    }
}
