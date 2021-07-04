package task28;

public class ArrayQueue<T> {

    private T[] arrayQueue;
    private int size;
    private int head = 0;
    private int tail = -1;
    private int nElem = 0;

    public ArrayQueue(int size) {
        this.size = size;
        arrayQueue = (T[]) new ArrayQueue<T>()[size];
    }

    public void enque(T i) {
        if (++tail == size){
            arrayQueue[tail] = i;
            nElem++;
        }
    }


    public T dequeue() {
        T temp = arrayQueue[head++];
        if (head == size){
            head = 0;
        }
            nElem--;
            return temp;
    }

    public T getHead() {
        return arrayQueue[head];
    }

    public T getTail() {
        return arrayQueue[tail];
    }

    public boolean isFull() {
        return (nElem == size - 1);
    }

    public boolean isEmpty() {
        return (nElem == 0);
    }

    public int getSize() {
        return nElem;
    }


}
