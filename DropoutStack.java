package Practice;

import java.util.EmptyStackException;

public class DropoutStack<T> extends ArrayStack<T>{

    private int counter;
    
    public DropoutStack(){
        super();
        counter = 0;
    }

    public void push(T element){

        stack[top] = element;
        top = (top + 1) % CAPACITY;
        if(counter < stack.length){
            counter++;
        }
    }

    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        
        top = (top - 1 + CAPACITY) % CAPACITY;
        T element = stack[top];
        stack[top] = null;
        counter--;
        return element;
    }

    public void undoPush(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        top = (top - 1 + CAPACITY) %CAPACITY;
        stack[top] = null;
        counter--;
    }

    public boolean isEmpty(){
        return counter ==0;
    }

    public String toString(){
        String result = "[";
        int start = (top - counter + CAPACITY) % CAPACITY;

        for(int i = 0; i < counter; i++){
            int index = (start + i) % stack.length;
            result += stack[index];

            if(i < counter - 1){
                result += ", ";
            }
        }

        result += "]";
        return result;
    }

}
