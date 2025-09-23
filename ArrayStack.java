import java.util.Arrays;

public class ArrayStack<T> implements StackADT<T>{

    private final static int DEFAULT_CAPACITY = 100;
    private int top;
    private T[] stack;

    public ArrayStack(){
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ArrayStack(int initialCapacity){
        top = 0;
        stack = (T[])(new Object[initialCapacity]);
    }

    @Override
    public void push(T element){
        if(size() == stack.length){
            expandCapacity();
        }

        stack[top] = element;
        top++;
    }

    public void expandCapacity(){
        stack = Arrays.copyOf(stack, stack.length*2);
    }

    public T pop()throws EmptyCollectionException{
        if(isEmpty()){
            throw new EmptyCollectionException("stack");
        }

        top--;
        T result = stack[top];
        stack[top] = null;

        return result;
    }

    public T peek()throws EmptyCollectionException{
        if(isEmpty()){
            throw new EmptyCollectionException("stack");
        }

        return stack[top - 1];
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public int size(){
        return top;
    }

    public String toString(){
        if(isEmpty()){
            return "[]";
        }
        String result = "[";

        for(int i = 0; i < top; i++){
            result += stack[i];
            if(i < top - 1){
                result += ", ";
            }
        }

        result += "]";

        return result;
    }

}
