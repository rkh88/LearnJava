package task27;


public class ArrayStack<T> implements Stack<T> {

        private T[] arrayStack;
        private int size;
        private int top = -1;

        public ArrayStack(int size) {
                arrayStack = (T[]) new ArrayStack[size];
                this.size = size;
        }
        @Override
        public void push(T i) {
                if (top < arrayStack.length) {
                        arrayStack[++top] = i;
                }
        }

        @Override
        public T pop() {
                if (top > -1) {
                        T last = arrayStack[top--];
                        return last;
                }
                return null;
        }

        @Override
        public boolean isEmpty() {
                if (top < 0){
                        return true;
                }
                return false;
        }
}