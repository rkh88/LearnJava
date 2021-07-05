package task27;
import  task25.*;

public class ListStack<T> implements Stack<T>{

    AdvancedDll<T> listStack = new AdvancedDll<T>();


    @Override
    public void push(T i) {
        listStack.addLast(i);

    }

    @Override
    public T pop() {
        return listStack.removeLast();
    }

    @Override
    public boolean isEmpty() {
        return listStack.size() == 0;
    }

    public T peekLast(){
        return  listStack.get(listStack.size() - 1);
    }




}
