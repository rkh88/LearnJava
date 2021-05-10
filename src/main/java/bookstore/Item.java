package bookstore;

public class Item {
    String name;
    int article;
    int price;
    int shelfNumber;
    String department;
    boolean sold;
    public Item(String name, int article, int price, int shelfNumber, String department, boolean sold){

        this.name = name;
        this.article = article;
        this.price = price;
        this.shelfNumber = shelfNumber;
        this.department=department;
        this.sold = sold;


    }

}
