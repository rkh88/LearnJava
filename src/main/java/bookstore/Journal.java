package bookstore;
import java.util.ArrayList;

public class Journal extends Item{


    public Journal(String name, int article, int price, int shelfNumber, String department, boolean sold) {
        super(name, article, price, shelfNumber, department, sold);
    }


    public Journal getBookByArticle(int article){
        for (int i = 0; i < journalsList.size(); i++) {
            Journal j = this.journalsList.get(i);
            if (article==j.getArticle()){

                return  j;
            }
        }

    public String getBookNameByArticle(int article){
        for (int i = 0; i < journalsList.size(); i++) {
            Journal b = getJournalByArticle(i);
            if (article==b.getArticle()){
                String n = this.name;
                return  n;
            }
        }

        return  null;
    }



}
