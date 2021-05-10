package bookstore;


import myutils.MyArrayList;

import java.util.ArrayList;
import java.util.List;

public class BookStore {

    String bookStoreName;
    Director director;
    private MyArrayList<SalesManager> salesManagersList = new MyArrayList();
    private MyArrayList<Author> authorsList = new MyArrayList();
    private MyArrayList<Item> itemsList = new MyArrayList<>();
    private MyArrayList<Book> booksList = new MyArrayList();
    private MyArrayList<Journal> journalsList = new MyArrayList();

    public BookStore(String bookStoreName, Director director) {
        this.bookStoreName = bookStoreName;
        this.director = director;
    }

    public void addDepartment(String departmentName) {
        Department department = new Department(departmentName);


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
        Book b = Book.getBookByArticle(article);
        SalesManager m = SalesManager.getSalesManagerByNumber (salesManagerNumber);
        int p = b.price;
        b.setSold(true);
        m.setSumOfSales(p);


    }

    public void printSalesManagers () {

        for (int i = 0; i < salesManagersList.size(); i++) {
            SalesManager m = salesManagersList.get(i);
            m.printInformation();
        }

    }

    public void printBooks () {

        for (int i = 0; i < booksList.size(); i++) {
            SalesManager b = booksList.get(i);
            b.printInformation();
        }
    }


}
