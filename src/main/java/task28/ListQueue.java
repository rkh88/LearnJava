package task28;
import task25.*;

public class ListQueue<T> {

    AdvancedDll<T> listQueue = new AdvancedDll<T>();


    public void enque(T i) {
        listQueue.addLast(i);
    }


    public T dequeue() {

        listQueue.removeFirst();

    }


    public boolean isEmpty() {

        return listQueue.size() == 0;
    }
}