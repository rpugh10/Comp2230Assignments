package LinkedStackPractice;

public interface StackADT<T> {

    public void push(T element);

    public T pop();

    public T peek();

    public int size();

    public boolean isEmpty();

    public String toString();
}
