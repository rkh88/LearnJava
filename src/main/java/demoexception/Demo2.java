package demoexception;

import java.util.List;

public class Demo2 {

    public static void main(String[] args) {

        try {

            List<String> stringList = null;

            stringList.add("String");
            String str = "5";
            int x = Integer.parseInt(str);
            System.out.println(x);
        } catch (Exception  ex){
            ex.printStackTrace();
        }
        System.out.println("!");
    }
}
