public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Fedor", "Dostoevsky");
        System.out.println("author1 = " + author1);

        Author author2 = new Author("Mihail", "Bulgakov");
        System.out.println("author2 = " + author2);

        Book book1 = new Book("Crime and punishment", author1, 1866);
        System.out.println("book1 = " + book1);

        Book book2 = new Book("Master and Margarita", author2, 1940);
        System.out.println("book2 = " + book2);

        book1.setPublicYear(1950);
        System.out.println("book1.publicYear = " + book1.getPublicYear());

        book2.setPublicYear(1950);
        System.out.println("book2.publicYear = " + book2.getPublicYear());
    }
}
