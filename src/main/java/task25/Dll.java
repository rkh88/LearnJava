package task25;


public class Dll<T> {

    public static class Node<T>{
        T data;
        Node<T> next;
        Node<T> prev;


    }

    private Node<T> head;

    private int size = 0;

    public T get(int index){
        Node<T> tmp = head;
        int i = 0;
        while (tmp.next != null &&  i < index){
            tmp = tmp.next;
            i++;
        }
        return tmp.data;
    }

   /* public Iterator<T> iterator(){
        return new Iterator<T>(head);
    }*/


    public static class Iterator<T>{

        private Node<T> cursor;

        public Iterator(Node<T> n) {
            this.cursor = n;
        }

        public T next(){
            T e = cursor.data;
            cursor = cursor.next;
            return e;
        }
        public boolean hasNext(){
            return cursor != null;
        }
    }


    public boolean add(T item) {
        if (item == null) {
            return false;
        } else {
            Node node = new Node();
            node.data = item;
            if (head == null) {
                head = node;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = node;
                node.prev = temp;


            }
            size++;
            return true;
        }
    }


    public boolean add(int index, T item){
        if (item == null  ||index < 0 || index > size - 1 ) {
            return false;
        }else {
            int i = 0;
            Node node = new Node();
            node.data = item;
            if(head == null){
                head = node;
            } else {
                Node temp = head;
                while(temp != null && i != index) {
                    temp = temp.next;
                    i++;
                }


                temp.next = node;
                node.prev = temp;
                if (temp.next != null) {
                    Node temp1 = temp.next;
                    node.next = temp1;
                    temp1.prev = node;
                }
            }
        }
        size++;
        return true;
    }


    public boolean add(Dll<T> list){
        if (list == null) {
            return false;
        } else {
            Node node = new Node();
            node.data = list;
            if (head == null) {
                head = node;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = node;
                node.prev = temp;


            }
            size++;
            return true;
        }
    }

    public boolean add(int index, Dll<T> list){
        if (list == null  ||index < 0 || index > size ) {
            return false;
        }else {
            int i = 0;
            Node node = new Node();
            node.data = list;
            if(head == null){
                head = node;
            } else {
                Node temp = head;
                while(i != index) {
                    temp = temp.next;
                }
                Node temp1 = temp.next;

                temp.next = node;
                node.prev = temp;
                node.next = temp1;
                temp1.prev = node;
                i++;
            }
        }
        size++;
        return true;


    }

    public boolean remove(T item){
        if (item == null){
            return false;
        } else {
            Node node = new Node();
            if (head == null){
                return false;
            } else {
                Node temp = head;
                while(temp.data != item) {
                    temp = temp.next;
                }
                Node temp1 = temp.prev;
                Node temp2 = temp.next;
                temp1.next = temp2;
                temp2.prev = temp1;
            }


        }
        size--;
        return true;
    }

    public T removeByIndex(int index){
        if (index < 0 || index > size - 1){
            return null;
        } else {
            int i = 0;
            Node node = new Node();
            if(head == null){
                return null;
            } else {
                if (index == 0){
                    Node tmp =head;
                    head = head.next;
                    size--;
                    return (T) tmp.data;
                } else {
                    Node<T> temp = head;
                    T  element = null;
                    while (i < index) {
                        temp = temp.next;
                        i++;
                    }
                    if (index == size - 1) {
                        element = temp.data;
                        temp.prev.next = null;
                    } else {
                        Node temp1 = temp.prev;
                        Node temp2 = temp.next;
                        temp1.next = temp2;
                        temp2.prev = temp1;
                        element = temp.data;
                    }
                    size--;
                    return element;
                }
            }

        }


    }
    public int size(){
        return size;
    }

    public void clear(){
        size = 0;
        head = null;
    }
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
}
