package polymorphism;

public class Circle  extends  Figure implements Plotter {

    @Override
    public void square() {
        System.out.println("Square of Triange");
    }

    @Override
    public void printFigure() {

    }
}
