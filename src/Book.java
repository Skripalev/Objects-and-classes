public class Book {
    private String bookName;
    private String authorBook;
    private int publicYear;


    public Book(String bookName, String authorBook, int publicYear) {
        this.bookName = bookName;
        this.authorBook = authorBook;
        this.publicYear = publicYear;
    }

    String getBookName() {
        return this.bookName;
    }

    String getAuthorBook() {
        return this.authorBook;
    }

    int getPublicYear() {
        return this.publicYear;
    }

    public void setPublicYear(int publicYear) {
        this.publicYear = publicYear;

    }

}

