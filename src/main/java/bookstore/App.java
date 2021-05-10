package bookstore;

public class App {
    public static void main(String[] args) {

        Director d1 = new Director("Vasya", "Vasechkin");
        BookStore bs1 = new BookStore("bs1", d1);
        bs1.addDepartment("Dep 1");
        bs1.addDepartment("Dep 2");
        bs1.addDepartment("Dep 3");


        bs1.addSalesManager("Petya", "Petrov", 1, "Dep 1", 0);
        bs1.addSalesManager( "Sergey", "Semenov", 2, "Dep 2", 0);
        bs1.addSalesManager("Senya", "Sidorov", 3, "Dep 3", 0);



        bs1.addAuthor("Lev", "Tolstoy");
        bs1.addAuthor("Aleksandr", "Pushkin");
        bs1.addAuthor("Fedor", "Dostoyevskiy");
        bs1.addAuthor("Karl", "Marks");
        bs1.addAuthor("Fridrich", "Engels");
        bs1.addAuthor("Nikolay", "Karamzin");

        bs1.addBook( "Lev", "Tolstoy", "Voskreseniye", 001, 500, 001, "Dep 1", false);
        bs1.addBook( "Lev", "Tolstoy", "Voyna i mir", 002, 500, 001, "Dep 1", false);
        bs1.addBook( "Lev", "Tolstoy", "Anna Karenina", 003, 500, 001, "Dep 1", false);
        bs1.addJournal("Narodnaya Volya", 004, 500, 002, "Dep 2", false);
        bs1.addJournal("Vestnik Evropy", 005, 500, 002, "Dep 2", false);
        bs1.addJournal("Russkaya Zhizn", 006, 500, 002, "Dep 2", false);




    }
}
