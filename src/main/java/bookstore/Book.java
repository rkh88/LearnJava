package bookstore;

import java.util.ArrayList;

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

    public Book getBookByArticle(int article){
        for (int i = 0; i < booksList.size(); i++) {
            Book b = this.booksList.get(i);
            if (article==b.getArticle()){

                return  b;
            }
        }

        return  null;
    }

    public Book getBookNameByArticle(int article){
        for (int i = 0; i < booksList.size(); i++) {
            Book b = getBookByArticle(i);
            if (article==b.getArticle()){
                String n = this.name;
                return  n;
            }
        }

        return  null;
    }






}
