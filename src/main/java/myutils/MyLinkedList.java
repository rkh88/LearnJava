package myutils;

public class MyLinkedList<T> {


    private Node head;
    private int size = 0;

    public void add(T newData){
        Node node = new Node();
        node.data = newData;
        if(head == null){

            head = node;
        } else {
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = node;

        }
        size++;
    }

    public T get(int index){
        return null;
    }


    private static class Node<T>{
        T data;
        Node next;
    }
}
