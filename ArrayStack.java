package Practice;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack<T> implements StackADT<T> {

    protected static final int CAPACITY = 5;
    protected T[] stack;
    protected int top;

    public ArrayStack(){
        this(CAPACITY);
    }

    public ArrayStack(int initialCapacity){
        top = 0;
        stack = (T[])(new Object[initialCapacity]);
    }

    public void push(T element){
        if(size() == stack.length){
            extendCapacity();
        }

       stack[top] = element;
       top++;

    }

    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        top--;
        T element = stack[top];
        stack[top] = null;
        return element;

    }

    public T peek(){
        return stack[top - 1];
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public int size(){
        return top;
    }

    public void extendCapacity(){
        stack = Arrays.copyOf(stack, stack.length * 2);
    }

    public String toString(){
        if(isEmpty()){
            return "[]";
        }

        String result = "[";

        for(int i = 0; i < stack.length; i++){
            result += stack[i];
            if(i < top){
                result += ", ";
            }
        }
        result += "]";

        return result;
    }

}
