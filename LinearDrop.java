package LinkedStackPractice;

public class LinearDrop<T> extends LinearStack<T>{

    public LinearDrop(){
        super();
    }

    public void push(T element){
        
        if(counter < CAPACITY){
             super.push(element);
        }else{

            LinearNode<T> node = top;

             while(node.getNext().getNext() != null){
                node = node.getNext();
             }

            node.setNext(null);

            LinearNode<T> temp = new LinearNode<>(element);

            temp.setNext(top);
            top = temp;
        }

        
    }

}
