package bookstore;

public class Item {
    String name;
    int article;
    int price;
    int shelfNumber;
    String departmentOfLocation;
    boolean sold;
    public Item(String name, int article, int price, int shelfNumber, String departmentOfLocation, boolean sold){
        this.name = name;
        this.article = article;
        this.price = price;
        this.shelfNumber = shelfNumber;
        this.departmentOfLocation=departmentOfLocation;
        this.sold = sold;


    }

}
