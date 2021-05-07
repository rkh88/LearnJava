package bookstore;

public class Journal{
    String nameOfJournal;
    int articleNumber;
    int price;
    int shelfNumber;
    String departmentOfLocation;
    boolean sold;

    public Journal(String nameOfJournal, int articleNumber, int price, int shelfNumber, String departmentOfLocation, boolean sold) {
        this.nameOfJournal = nameOfJournal;
        this.articleNumber = articleNumber;
        this.price = price;
        this.shelfNumber = shelfNumber;
        this.departmentOfLocation = departmentOfLocation;
        this.sold = sold;
    }



}
