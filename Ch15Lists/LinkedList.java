package Ch15Lists;

// Class is abstract because, this serves as a base class to be extended by more subclasses (OrderedList, UnorderedList).
public abstract class LinkedList<T> extends ListADT<T>{

    protected int count;
    protected LinearNode<T> head, tail;
    protected int modCount;

    public LinkedList(){
        count = 0;
        head = tail = null;
        modCount = 0;
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public T removeFirst(){
        if(isEmpty()){
            throw new EmptyCollectionException("LinkedList");
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
            throw new EmptyCollectionException("LinkedList");
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

        T element = tail.getNext.getElement();
        current.setNext(null);
        tail = current;
        count--;
        
        return element;
    }

    public T first(){
        if(isEmpty()){
            throw new EmptyCollectionException("LinkedList");
        }

        return head.getElement();
    }

    public T last(){
        if(isEmpty()){
            throw new EmptyCollectionException("LinkedList");
        }

        return tail.getElement();
    }

    public int size(){
        return count;
    }

    public boolean contains(T element){
        
        if(isEmpty()){
            return false;
        }
        else{
            LinearNode<T> temp = head;
            while(temp != null){
                T currentElement = temp.getElement();

                if(currentElement.getElement().equals(element) && currentElement != null){
                    return true;
                }
                
                temp = temp.getNext();
            }
        }
        return false;
    }

    public String toString(){
        if(isEmpty()){
            return "[]";

            String result = "[";

            LinearNode<T> start = head;

            for(int i = 0; i < size(); i++){
                result += start.getElement();
                start.getNext();
                if(i < size()){
                    result += ", ";
                }
            }

            result += "]";
            return result;
        }
    }



}
