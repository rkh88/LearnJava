package bookstore;

import bank.Customer;
import myutils.MyArrayList;

import java.util.ArrayList;
import java.util.List;

public class BookStore {

    String bookStoreName;
    Director director;
    private SalesManagersList<SalesManager> salesManagersList = new salesManagersList();
    private AuthorsList<Author> authorsList = new authorsList();
    private ItemsList<Item> itemsList = new itemsList<>();
    private BooksList<Book> booksList = new booksList();
    private JournalsList<Journal> journalsList = new journalsList();

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

      Author author = new Author();
      authorsList.add(author);

    }

    public void addBook(String firstName, String lastName, String name, int article, int price, int shelfNumber, String department, boolean sold) {
      Book book = new Book();
      booksList.add(book);

    }

    public void addJournal(String name, int article, int price, int shelfNumber, String department, boolean sold) {
      Journal journal = new Journal();
      journalsList.add(journal);
    }


    public void bookSales (int article, int salesManagerNumber){



    }


}
