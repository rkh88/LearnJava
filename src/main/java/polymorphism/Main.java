package polymorphism;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Type  reference = new Objeect();
        Figure triangle = new Rectangle ();
        triangle.square();

        List<Figure> list = new ArrayList<>();
       // list.add(new Figure());
        list.add(new Rectangle());
        list.add(new Triangle());
        for (int i = 0; i < list.size(); i++) {
            list.get(i).square();
        }

        List<Triangle> list2 = new LinkedList<>();
        //list2.add(new Figure());

        Plotter c = new Circle();
        //c.square();
        c.printFigure();
    }
}
