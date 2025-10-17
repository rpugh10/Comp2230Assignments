package com.ch15lists;

public class LinkedList<T> implements ListADT<T> {

    protected LinearNode<T> head, tail;
    protected int modCount;
    protected int count;

    public LinkedList(){
        count = 0;
        head = tail = null;
        modCount = 0;
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public int size(){
        return count;
    }

    public String toString(){
        if(isEmpty()){
            return "[]";
        }

        String result = "[";
        LinearNode<T> current = head;

        for(int i = 0; i < size(); i++){
            result += current.getElement();
            current = current.getNext();
            if(i < size() - 1){
                result += ", ";
            }
        }
        result += "]";
        return result;
    }

    public T first(){
        if(isEmpty()){
            throw new EmptyCollectionException("List");
        }
        return head.getElement();
    }

    public T last(){
        if(isEmpty()){
            throw new EmptyCollectionException("List");
        }
        return tail.getElement();
    }

    public boolean contains(T element){
        if(isEmpty()){
            return false;
        }

        LinearNode<T> current = head;

        while(current.getNext() != null){
            if(current.getElement().equals(element)){
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public T removeFirst(){
        if(isEmpty()){
            throw new EmptyCollectionException("list");
        }

        T element = head.getElement();
        head = head.getNext();
        count--;

        if(isEmpty()){
            tail = null;
        }

        return element;
    }

    public T removeLast(){
        if(isEmpty()){
            throw new EmptyCollectionException("list");
        }

        if(head == tail){
            T element = tail.getElement();
            head = tail = null;
            count--;
            return element;
        }

        LinearNode<T> current = head;

        while(current.getNext().getNext() != null){
            current = current.getNext();
        }

        T element = tail.getElement();
        current.setNext(null);
        tail = current;
        count--;
        return element;
    }

}
