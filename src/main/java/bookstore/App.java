package bookstore;

public class App {
    public static void main(String[] args) {

        Director d1 = new Director("Vasya", "Vasechkin");
        BookStore bs1 = new BookStore("bs1", d1);
        bs1.addDepartment("Fiction Literature");
        bs1.addDepartment("Historical Literature");
        bs1.addDepartment("Phylosofical Literature");
        bs1.addDepartment("Journals Department");

        bs1.addSalesManager("m1", "Petya", "Petrov", 1, "Fiction Literature", 0);
        bs1.addSalesManager("m2", "Sergey", "Semenov", 2, "Historical Literature", 0);
        bs1.addSalesManager("m3", "Senya", "Sidorov", 3, "Phylosofical Literature", 0);



        bs1.addAuthor("a1", "Lev", "Tolstoy");
        bs1.addAuthor("a2", "Aleksandr", "Pushkin");
        bs1.addAuthor("a3","Fedor", "Dostoyevskiy");
        bs1.addAuthor("a4","Karl", "Marks");
        bs1.addAuthor("a5", "Fridrich", "Engels");
        bs1.addAuthor("a6", "Nikolay", "Karamzin");

       // bs1.addBook("Lev Tolstoy", "Voskreseniye", 1, 500, 1, "Fiction Literature");


       // bs1.addJournal("Pravda", 001, 500, 100, "Phylosofical Literature");


       // Book.bookSales(1, 001);


    }
}
