
public class LinkedDropout<T> implements StackADT<T>{

    private final static int CAPACITY = 5;
    private LinearNode<T> top;
    private int counter;

    public LinkedDropout(){
        top = null; 
        counter = 0;
    }

    public void push(T elem){
        if(counter < CAPACITY){
            LinearNode<T> temp = new LinearNode<>(elem);
            temp.setNext(top);
            top = temp;
            counter++;
        }

    }

    public T pop(){

    }

    public boolean isEmpty(){

    }

    public int size(){

    }

    public T peek(){

    }

    public String toString(){

    }
}
