package lambda;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(-87);
        list.add(-3);
        list.stream().filter(x -> x <0).forEach(System.out::println);

        DemoFunctionalInterface demo = (x,y) -> x + y;
        System.out.println(demo.method(5,6));





        }


}
