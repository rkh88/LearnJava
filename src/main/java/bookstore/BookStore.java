package bookstore;


import myutils.MyArrayList;

import java.util.ArrayList;
import java.util.List;

public class BookStore {

    String bookStoreName;
    Director director;
    private ArrayList<SalesManager> salesManagersList = new ArrayList();
    private ArrayList<Author> authorsList = new ArrayList();
    private ArrayList<Item> itemsList = new ArrayList<>();
    private ArrayList<Book> booksList = new ArrayList();
    private ArrayList<Journal> journalsList = new ArrayList();

    public BookStore(String bookStoreName, Director director) {
        this.bookStoreName = bookStoreName;
        this.director = director;
    }

    public void addDepartment(String department) {
        Department dep = new Department(department);


    }

    public void addSalesManager(String firstName, String lastName, int salesManagerNumber, String department, int sumOfSales) {
        SalesManager salesManager = new SalesManager(firstName, lastName, salesManagerNumber, department, sumOfSales);
        salesManagersList.add(salesManager);
    }

    public void addAuthor(String firstName, String lastName) {

      Author author = new Author(firstName, lastName);
      authorsList.add(author);

    }

    public void addBook(String firstName, String lastName, String name, int article, int price, int shelfNumber, String department, boolean sold) {
      Book book = new Book(name, article, price, shelfNumber, department, sold, firstName, lastName);
      booksList.add(book);

    }

    public void addJournal(String name, int article, int price, int shelfNumber, String department, boolean sold) {
      Journal journal = new Journal(name, article, price, shelfNumber, department, sold);
      journalsList.add(journal);
    }


    public void bookSales (int article, int salesManagerNumber){
        Item i = Item.getItemByArticle(article);
        SalesManager m = SalesManager.getSalesManagerByNumber (salesManagerNumber);
        int p = i.price;
        i.setSold(true);
        m.setSumOfSales(p);


    }



    public void printSalesManagers () {

        for (int i = 0; i < salesManagersList.size(); i++) {
            SalesManager m = SalesManager.getSalesManagerByNumber(i);
            System.out.println(m);
        }

    }

    public void printBooks () {

        for (int i = 0; i < booksList.size(); i++) {
            String n = Book.getBookNameByArticle(i);
            System.out.println(n);
        }
    }


}
