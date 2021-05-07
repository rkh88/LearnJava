package lesson3;

public class Demo3 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if( i==7){
                break;
            }
            if(i == 4){
                continue;
            }
            System.out.println(i);
        }
    }
}
