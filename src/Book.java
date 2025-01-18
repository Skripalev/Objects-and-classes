public class Book {
    private String bookName;
    private Author authorBook;
    private int publicYear;


    public Book(String bookName, Author authorBook, int publicYear) {
        this.bookName = bookName;
        this.authorBook = authorBook;
        this.publicYear = publicYear;
    }

    String getBookName() {
        return this.bookName;
    }

    Author getAuthorBook() {
        return authorBook;
    }

    int getPublicYear() {
        return this.publicYear;
    }

    public void setPublicYear(int publicYear) {
        this.publicYear = publicYear;

    }

    public String toString() {
        return bookName + " by " + authorBook.toString() + ", published in " + publicYear;

    }
}

