package task25;

public class AdvancedDll<T> extends Dll<T>{

    public boolean addFirst(T item){
        return add(0, item);

    }

    public boolean addLast(T item){
        return add(item);

    }

    public T removeFirst(){
        return removeByIndex(0);


    }

    public T removeLast(){
        int index = size() - 1;
        return removeByIndex(index);


    }


}
