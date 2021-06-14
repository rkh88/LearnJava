package myutils;

public class MyArrayList<T> {

    private T[] elements;

    private int size = 0;
    public MyArrayList(){
        elements =(T[]) new Object[2];
    }


    public void add(T c){
        if (size < elements.length) {
            elements[size++] = c;
        } else {
            T []elements1 =  (T[]) new Object[2*size];
            for (int i = 0; i < size; i++) {
                elements1[i]= elements[i];
            }
            elements1[size++] = c;
            elements = elements1;
        }
    }

    public T get(int index){
        return elements[index];
    }

    public int size(){
        return size;
    }

}
