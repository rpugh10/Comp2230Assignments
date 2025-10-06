package LinkedStackPractice;

public class LinearNode<T>{

    protected LinearNode<T> node;

    private T element;

    //empty node
    public LinearNode(){
        element = null; 
        node = null;
    }

    //Creates a node for storing an element
    public LinearNode(T element){
        node = null;
        this.element = element;
    }

    public void setNext(LinearNode<T> node){
        this.node = node;
    }

    public LinearNode<T> getNext(){
        return node;
    }

    public void setElement(T element){
        this.element = element;
    }

    public T getElement(){
        return element;
    }

}
