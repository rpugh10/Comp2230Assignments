package com.ch15lists;

public class LinkedOrderList<T> extends LinkedList<T> {

    public LinkedOrderList(){
        super();
    }

    public void add(T element){
        if(!(element instanceof Comparable)){
            throw new RuntimeException("not comparable");
        }
        Comparable<T> comparable = (Comparable<T>)element;
        LinearNode<T> temp = new LinearNode<>(element);
        LinearNode<T> current = head;

        if(isEmpty()){
            head = tail = temp;
            count++;
            return;
        }

        if(comparable.compareTo(head.getElement()) <= 0){
            temp.setNext(head);
            head = temp;
            count++;
        }
        else if(comparable.compareTo(tail.getElement()) >= 0){
            tail.setNext(temp);
            tail = temp;
            count++;
        }
        else{
            while(comparable.compareTo(current.getNext().getElement()) >= 0){
                current = current.getNext();
            }

            temp.setNext(current.getNext());
            current.setNext(temp);
            count++;
        }
    }
}
