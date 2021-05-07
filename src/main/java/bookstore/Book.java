package bookstore;

public class Book {
    String author;
    String nameOfBook;
    int article;
    int price;
    int shelfNumber;
    String departmentOfLocation;
    boolean sold;

    public Book(String author, String nameOfBook, int article, int price, int shelfNumber, String departmentOfLocation, boolean sold) {
        this.author = author;
        this.nameOfBook = nameOfBook;
        this.article = article;
        this.price = price;
        this.shelfNumber = shelfNumber;
        this.departmentOfLocation = departmentOfLocation;
        this.sold = sold;
    }



}
