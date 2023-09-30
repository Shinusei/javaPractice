package Practice4.task3;

public class Book {
    private String name;
    private String author;
    private int year;

    public Book(String name, String author, int data) {
        this.name = name;
        this.author = author;
        this.year = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", data=" + year +
                '}';
    }

    public int getData() {
        return year;
    }

    public void setData(int data) {
        this.year = data;
    }
}
