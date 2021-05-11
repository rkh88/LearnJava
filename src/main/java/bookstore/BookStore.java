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
            int n = m.getSalesManagerNumber;
            System.out.println(n+" "+m.firstName+" " m.lastName);
        }

    }

    public void printBooks () {

        for (int i = 0; i < booksList.size(); i++) {
            String n = Book.getBookNameByArticle(i);
            System.out.println(n);
        }
    }

    public void printJournals () {

        for (int i = 0; i < journalsList.size()List.size(); i++) {
            String n = Journal.getJournalNameByArticle(i);
            System.out.println(n);
        }
    }


    public void bestSalesManagerNumber (){
        SalesManager m0 = SalesManager.getSalesManagerByNumber(0);
        int bestSum = m0.getSumOfSales;
        int iBest = 0;
        for (int i = 1; i < salesManagersList.size(); i++) {

            SalesManager m = SalesManager.getSalesManagerByNumber(i);
            int sum = m.getSumOfSales;
                if (sum>bestSum) {
                    bestSum = sum;
                    m0 = SalesManager.getSalesManagerByNumber(i);
                }

        }
        int bestNum = m0.getSalesManagerNumber;
        String fN = m0.getFirstName;
        String lN = m0.getLastName;
        System.out.println(bestNum + " " + fN + " " + lN);


    }

    public void averageSales () {
        int sum = 0;
        for (int i = 0; i < salesManagersList.size(); i++) {
            SalesManager m = SalesManagers.getSalesManagerByNumber(i);
            int sum1 = m.getSumOfSales;
            sum = sum + sum1;
        }
        int avSum = sum/ salesManagersList.size();
        System.out.println(avSum);


    }


}
