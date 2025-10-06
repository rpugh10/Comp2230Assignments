package LinkedStackPractice;

import java.util.EmptyStackException;

public class LinearStack<T> implements StackADT<T>{

    protected final static int CAPACITY = 5;
    protected LinearNode<T> top;
    protected int counter;

    public LinearStack(){
        this(CAPACITY);
    }

    public LinearStack(int initialCapacity){
        top = null;
        counter = 0;
    }

    public void push(T element){
        LinearNode<T> node = new LinearNode<>(element);

        node.setNext(top);
        top = node;
        counter++;
    }

    public T pop(){

        if(isEmpty()){
            throw new EmptyStackException();
        }
       
        T element = top.getElement();
        top.getNext();
        counter--;
        return element;
    }

    public T peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        return top.getElement();
    }

    public int size(){
        return counter;
    }

    public boolean isEmpty(){
        return counter == 0;
    }

    public String toString(){
        if(counter == 0){
            return "[]";
        }
        String result = "[";

        LinearNode<T> temp = top;

        while(temp != null){
            result += temp.getElement();
            temp.getNext();
            if(temp != null){
                result += ", ";
            }
        }

        result += "]";
        return result;
    }


}
