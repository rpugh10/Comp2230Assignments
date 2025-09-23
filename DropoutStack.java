import java.util.Arrays;

public class DropoutStack<T> implements StackADT<T>{

    private final static int DEFAULT_CAPACITY = 5;
    private int top;
    private T[] stack;
    private int counter;

    public DropoutStack(){
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public DropoutStack(int initialCapacity){
        top = 0;
        counter = 0;
        stack = (T[])(new Object[initialCapacity]);
    }

    public void push(T element){
       stack[top] = element;
       top = (top + 1) % stack.length;

       if(counter < stack.length){
            counter++;
       }
       
    }

    public void expandCapacity(){
        stack = Arrays.copyOf(stack, stack.length*2);
    }

    public T pop()throws EmptyCollectionException{
        if(isEmpty()){
            throw new EmptyCollectionException("stack");
        }

        top = (top - 1 + stack.length) % stack.length;
        T result = stack[top];
        stack[top] = null;
        counter--;
        return result;
    }

    public T peek()throws EmptyCollectionException{
        if(isEmpty()){
            throw new EmptyCollectionException("stack");
    }
        int index = (top - 1 + stack.length) % stack.length;
        return stack[index];
    }

     public boolean isEmpty(){
        return counter == 0;
    }

    public int size(){
        return counter;
    }

    public String toString(){
        if (counter == 0) {
        return "[]";
    }

    String result = "[";
    int start = (top - counter + stack.length) % stack.length;

    for (int i = 0; i < counter; i++) {
        int index = (start + i) % stack.length;
        result += stack[index];

        if (i < counter - 1) {
            result += ", ";
        }
    }

    result += "]";
    return result;
    }
}
