package bookstore;

import java.util.ArrayList;
import java.util.List;

public class BookStore {

    String bookStoreName;
    Director director;
    private List<Item> items = new ArrayList<>();

    public BookStore(String bookStoreName, Director director) {
        this.bookStoreName = bookStoreName;
        this.director = director;
    }

    public void addDepartment(String departmentName) {
        Department department = new Department(departmentName);


    }

    public void addSalesManager(String salesManagerName, String firstName, String lastName, int salesManagerNumber, String department, int sumOfSales) {
        SalesManager salesManager = new SalesManager(salesManagerName, firstName, lastName, salesManagerNumber, department, sumOfSales);

    }

    public void addAuthor(String shortName, String firstName, String lastName) {

      //  Author author = new Author();

    }

    public void addBook(String author, String nameOfBook, int article, int price, int shelfNumber, String departmentOfLocation, boolean sold) {
      //  Book book = new Book();
        //реализовать добавление книги в список items

    }

    public void addJournal(String nameOfJournal, int articleNumber, int price, int shelfNumber, String departmentOfLocation, boolean sold) {
      //  Journal journal = new Journal();
    }


    public void bookSales (int article){

        //this.book.sold = true;
        //прибавление продажи менеджеру
        //получить номер менеджера через данные о товаре
        //изменить sumOfSales у менеджера на соответствующую сумму

    }


}
