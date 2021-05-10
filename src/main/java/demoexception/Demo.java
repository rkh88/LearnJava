package demoexception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo {

    public static void main(String[] args) {


            String str = "5";
            int x = Integer.parseInt(str);
            System.out.println(x);


        System.out.println("Another algorithm");


        try {
            FileReader fr = new FileReader("f.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int aa[] = {1,2,3,4,5,6};
        for (int i = 0; i < aa.length ; i++) {

                System.out.println(aa[i]);

        }
    }
}
