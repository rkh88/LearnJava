//package exercises;
//
//public class Suleimanov21task {
//
//    public static void main(String[] args) {
//        String[] strs  = new String[10];
//
//        strs[0] = "test0";
//        strs[1] = "test1";
//        strs[2] = "test2";
//        strs[3] = "test3";
//        strs[4] = "test4";
//        strs[5] = "test5";
//        strs[6] = "test6";
//        strs[7] = "test7";
//        strs[8] = "test8";
//        strs[9] = "test9";
//
//        System.out.println(search2(strs));
//
//    }
//
//
//    public String search1(String[] strs){
//
//        char currentChar = "t";
//        for (int i = 0; ; i++) {
//            boolean boolT;
//            for (int j = 0; j < strs.length; j++) {
//                boolT = (strs[j].charAt(i) == currentChar);
//            }
//                if (boolT == true){
//                    char currentChar = "e";
//                    boolean boolE;
//                    for (int k = 0; k < strs.length; k++) {
//                        boolE = (strs[k].charAt(i+1) == currentChar);
//                    }
//                    if (boolE ==true){
//                        char currentChar = "s";
//                        boolean boolS;
//                        for (int l = 0; l < strs.length; l++) {
//                            boolS = (strs[l].charAt(i+2) == currentChar);
//                        }
//                        if (boolS == true){
//                            char currentChar = "t";
//                            boolean boolT;
//                            for (int m = 0; m < strs.length; m++) {
//                                boolS = (strs[m].charAt(i+3) == currentChar);
//                            }
//                            if (boolT == true){
//                                return "test";
//                            }
//                        }
//
//                    }
//
//                }
//                return "";
//        }
//
//
//    }
//
//    public String search2(String[] strs){
//        for (int i = 0; i < strs.length; i++) {
//            for (int j = 0; j < strs[i].length(); j++) {
//                if (strs[i].charAt(j) == "t"){
//                    if (strs[i].charAt(j+1) == "e"){
//                        if (strs[i].charAt(j+2) == "s"){
//                            if (strs[i].charAt(j+3) == "t"){
//                                return "test";
//                            }
//                        }
//                    }
//                }
//            }
//
//        }
//
//    return "";
//    }
//
//
//}
