package bookstore;

public class Book extends Item {
    String firstName;
    String lastName;
    int article;

    public Book(String name, int article, int price, int shelfNumber, String department, boolean sold, String firstName, String lastName) {
        super(name, article, price, shelfNumber, department, sold);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getArticle() {
        return article;
    }








}
