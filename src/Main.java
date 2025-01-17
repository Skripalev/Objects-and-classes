public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Fedor", "Dostoevsky");
        System.out.println("author1.name = " + author1.getName());
        System.out.println("author1.lastName = " + author1.getLastName());

        Author author2 = new Author("Mihail", "Bulgakov");
        System.out.println("author2.name = " + author2.getName());
        System.out.println("author2.lastName = " + author2.getLastName());

        Book book1 = new Book("Crime and punishment", "Dostoevsky", 1866);
        System.out.println("book1.bookName = " + book1.getBookName());
        System.out.println("book1.authorBook = " + book1.getAuthorBook());
        System.out.println("book1.publicYear = " + book1.getPublicYear());

        Book book2 = new Book("Master and Margarita", "Bulgakov", 1940);
        System.out.println("book2.bookName = " + book2.getBookName());
        System.out.println("book2.authorBook = " + book2.getAuthorBook());
        System.out.println("book2.publicYear = " + book2.getPublicYear());

        book1.setPublicYear(1950);
        System.out.println("book1.publicYear = " + book1.getPublicYear());

        book2.setPublicYear(1950);
        System.out.println("book2.publicYear = " + book2.getPublicYear());
    }
}
