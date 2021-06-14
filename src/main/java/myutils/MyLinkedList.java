package myutils;

public class MyLinkedList<T> {


    private Node<T> head;
    private Node<T> last;
    private int size = 0;

    public void add(T newData){
        Node node = new Node();
        node.data = newData;
        if(head == null){
            last = head = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public T get(int index){
        Node<T> tmp = head;
        int i = 0;
        while (tmp.next != null &&  i < index){
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public Iterator<T> iterator(){
        return new Iterator<>(head);
    }

    private static class Node<T>{
        T data;
        Node next;
    }



    public static class Iterator<T>{

        private Node<T> cursor;

        public Iterator(Node<T> cursor) {
            this.cursor = cursor;
        }

        public T next(){
            T element = cursor.data;
            cursor = cursor.next;
            return element;
        }
        public boolean hasNext(){
            return cursor != null;
        }
    }
}
