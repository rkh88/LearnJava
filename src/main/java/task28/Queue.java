package task28;

public interface Queue<T> {
    void enque(T i);
    T dequeue();
    boolean isEmpty();
}
