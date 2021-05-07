package lesson3;

public class Demo4 {

    public static void main(String[] args) {

       blablabla: for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 1){
                    break blablabla;
                }
                System.out.println("i = " + i + ", j = "+ j);
            }
        }

        engineControl("ON");
    }

    public static void engineControl(String str){
        switch (str) {
            case "ON":
                System.out.println("Engine works");
                break;
            case "OFF":
                System.out.println("Engine doesn't work");
                break;
            default:
                System.out.println("I don't know command");
        }
    }



}
