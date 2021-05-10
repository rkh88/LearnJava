package bookstore;

import bank.Customer;

public class Book extends Item {
    String firstName;
    String lastName;
    int article;

    public Book(String name, int article, int price, int shelfNumber, String department, boolean sold, String firstName, String lastName) {
        super(name, article, price, shelfNumber, department, sold);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public getBookPriceByArticle(int article){
        for (int i = 0; i < booksList.size(); i++) {
            Book b = this.booksList.get(i);
            if (article==b.getId()){
                int p = bookList[i].price;
                return  p;
            }
        }
        return  null;
    }




}
