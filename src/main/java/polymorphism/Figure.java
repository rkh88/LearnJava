package polymorphism;

import java.awt.*;

public abstract class Figure {

    /*
      Абстрактные методы - это методы без реализации
      Они должны быть в абстрактном классею НО
      В абстрактном классе может и не быть абстрактных методов
      Также в абстрактном классе могут быть обычные методы, поля, конструкторы

     */
    public Color color;

    public  abstract  void square();

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
