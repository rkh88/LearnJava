package bookstore;


import java.util.ArrayList;


public class BookStore {

    String bookStoreName;
    Director director;
    //private ArrayList<SalesManager> salesManager
    private ArrayList<Person> salesManagersList = new ArrayList<>();
    private ArrayList<Person> authorsList = new ArrayList();
    private ArrayList<Item> itemsList = new ArrayList<>();
    private ArrayList<Item> booksList = new ArrayList();
    private ArrayList<Item> journalsList = new ArrayList();

    public BookStore(String bookStoreName, Director director) {
        this.bookStoreName = bookStoreName;
        this.director = director;
    }


    public void addDepartment(String department) {
        Department dep = new Department(department);
    }

    public void addSalesManager(String firstName, String lastName,
                                int salesManagerNumber, String department, int sumOfSales) {


        SalesManager salesManager = new SalesManager(firstName, lastName, salesManagerNumber, department, sumOfSales);
       salesManagersList.add(salesManager);
    }

    public void addAuthor(String firstName, String lastName) {

        Author author = new Author(firstName, lastName);
        authorsList.add(author);

    }

    public void addBook(String firstName, String lastName,
                        String name, int article, int price, int shelfNumber, String department, boolean sold) {

        Book book = new Book(name, article, price, shelfNumber, department, sold, firstName, lastName);
        booksList.add(book);
        itemsList.add(book);


    }

    public void addJournal(String name, int article, int price, int shelfNumber, String department, boolean sold) {
        Journal journal = new Journal(name, article, price, shelfNumber, department, sold);
        journalsList.add(journal);
        itemsList.add(journal);
    }


    public void bookSales (int article, int salesManagerNumber){
        Item iTem = getItemByArticle(article);
        SalesManager m = getSalesManagerByNumber (salesManagerNumber);
        int p = iTem.getPrice();
        iTem.setSold(true);
        m.setSumOfSales(p);


    }



    public void printSalesManagers () {

        for (int i = 1; i < salesManagersList.size(); i++) {
            SalesManager m = (SalesManager) salesManagersList.get(i);
            int n = m.getSalesManagerNumber();
            System.out.println(n+" "+m.getFirstName()+" "+ m.getLastName());
        }

    }

    public void printBooks() {

        for (int i = 0; i < booksList.size(); i++) {
            Book b = (Book) booksList.get(i);
            String n = b.getName();
            System.out.println(n);
        }
    }

    public void printJournals () {

        for (int i = 0; i < journalsList.size(); i++) {
            Journal j = (Journal) journalsList.get(i);
            String n = j.getName();
            System.out.println(n);
        }
    }


    public void bestSalesManagerNumber (){
        SalesManager m0 = getSalesManagerByNumber(1);
        int bestSum = m0.getSumOfSales();
        int iBest = 0;
        for (int i = 0; i < salesManagersList.size(); i++) {

            SalesManager m = (SalesManager) salesManagersList.get(i);//getSalesManagerByNumber(i);
            int sum = m.getSumOfSales();
                if (sum>bestSum) {
                    bestSum = sum;
                    iBest = i;
                    m0 = getSalesManagerByNumber(i);
                }

        }
        int bestNum = m0.getSalesManagerNumber();
        String fN = m0.getFirstName();
        String lN = m0.getLastName();
        System.out.println(bestNum + " " + fN + " " + lN + " " + bestSum);


    }

    public void richestItem () {
        Item iTem = itemsList.get(0);
        int p = iTem.getPrice();
        for (int i = 1; i <= itemsList.size(); i++) {
            Item iTem1 = getItemByArticle(i);
            int p1 = iTem1.getPrice();
            if (p1 > p) {
             iTem = iTem1;
            }


        }
        System.out.println(iTem.getArticle() + " " + iTem.getName() + " " + iTem.getPrice());
    }

    public void averageSales () {
        int sum = 0;
        for (int i = 1; i < salesManagersList.size(); i++) {
            SalesManager m = getSalesManagerByNumber(i);
            int sum1 = m.getSumOfSales();
            sum = sum + sum1;
        }
        int avSum = sum/ salesManagersList.size();
        System.out.println(avSum);


    }



    public Item getItemByArticle(int article) {

        for (int i = 0; i < itemsList.size(); i++) {
            Item iTem = itemsList.get(i);
            if (article == iTem.getArticle()) {

                return iTem;
            }
        }
        return null;
    }

    public Book getBookByArticle(int article){
        for (int i = 0; i < booksList.size(); i++) {
            Book b = (Book)booksList.get(i);//TOO BAD// FIXME
            if (article==b.getArticle()){

                return  b;
            }
        }

        return  null;
    }

    public String getBookNameByArticle(int article){
        for (int i = 0; i < booksList.size(); i++) {
            Book b = (Book)booksList.get(i);//FIXME
            if (article==b.getArticle()){
                String n = b.getName();
                return  n;
            }
        }

        return  null;
    }



    public SalesManager getSalesManagerByNumber (int salesManagerNumber){
        for (int i = 0; i < salesManagersList.size(); i++) {
            SalesManager m = (SalesManager) salesManagersList.get(i);
            if (salesManagerNumber==m.getSalesManagerNumber()){
                return  m;
            }
        }
        return  null;


    }

    public Journal getJournalByArticle(int article) {
        for (int i = 0; i < journalsList.size(); i++) {
            Journal j =(Journal) journalsList.get(i);
            if (article == j.getArticle()) {

                return j;
            }
        }
        return null;
    }

    public String getJournalNameByArticle(int article){
        for (int i = 0; i < journalsList.size(); i++) {
            Journal j = getJournalByArticle(i);
            if (article==j.getArticle()){
                String n = j.getName();
                return  n;
            }
        }

        return  null;
    }



}
