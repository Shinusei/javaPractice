package Practice2.task3;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("qwerty","Pushkin",2004);
        System.out.println(book1);
        System.out.println(book1.getName());
        book1.setAuthor("Tolstoy");
        System.out.println(book1);
    }
}
