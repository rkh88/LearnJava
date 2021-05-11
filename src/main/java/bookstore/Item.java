package bookstore;
import java.util.ArrayList;

public class Item {
    String name;
    int article;
    int price;
    int shelfNumber;
    String department;
    boolean sold;

    public Item(String name, int article, int price, int shelfNumber, String department, boolean sold) {

        this.name = name;
        this.article = article;
        this.price = price;
        this.shelfNumber = shelfNumber;
        this.department = department;
        this.sold = sold;


    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }


    public Item getItemByArticle(int article) {
        for (int i = 0; i < itemsList.size(); i++) {
            Item i = this.itemsList.get(i);
            if (article == i.getArticle()) {

                return i;
            }
        }
    }

    public int getArticle() {
        return article;
    }

}

