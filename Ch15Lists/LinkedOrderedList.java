package Ch15Lists;

public class LinkedOrderedList<T> extends LinkedList<T>{

    public LinkedOrderedList(){
        super();
    }
    
    public void add(T element){

         if(!(element instanceof Comparable)){
            throw new RuntimeException("Not comparable");
        }

        Comparable<T> comparableElement = (Comparable<T>)element;
        LinearNode<T> temp = new LinearNode<>(element);
        LinearNode<T> current = head;

        if(isEmpty()){
            head = tail = temp;
            count++;
            return;
        }

        if(comparableElement.compareTo(head.getElement()) < 0){
            temp.setNext(head);
            head = temp;
            count++;
            return;
        }
        else if(comparableElement.compareTo(tail.getElement()) > 0){
            tail.setNext(temp);
            tail = temp;
            count++;
            return;
        }
        else{
            while(comparableElement.compareTo(current.getNext().getElement()) > 0){
                current = current.getNext();
            }

            temp.setNext(current.getNext());
            current.setNext(temp);
            count++;
        }
    }
}
