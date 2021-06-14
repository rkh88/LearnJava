package demostring;

public class DemoString {

    public static void main(String[] args) {
        String s = "Blabla";
        System.out.println("Length " + s.length());
        System.out.println("Uppercase " + s.toUpperCase());
        System.out.println(s);
        //immutable
        String st = s.toUpperCase();
        System.out.println(s.charAt(1));
        System.out.println(s.replace("a", "O"));
        String se = "Blabla";
        System.out.println(se.substring(1,3));
        System.out.println(s==se);
        System.out.println(s.hashCode() == se.hashCode());
        //String Pool
        String s1 = new String("Blabla");
        System.out.println(s.hashCode() == s1.hashCode());
        System.out.println(s == s1);
        String srt = "A";
        String stry = "B";
        String f = srt + stry;
        String fff = "" + 5;
        String rrrt = "A";
//        for (int i= 0; i < 10;i++){
//            rrrt += "A";
//            System.out.println(rrrt.hashCode());
//        }

        StringBuilder sb = new StringBuilder("A");
        StringBuffer sb1 = new StringBuffer("A");

        for (int i = 0; i < 10; i++) {
            sb1.append("A");
            System.out.println(sb1.hashCode());
        }

        StringBuilder sb22 = new StringBuilder("Helllo");
        System.out.println(sb22.reverse());
        System.out.println(sb22);


    }
}
