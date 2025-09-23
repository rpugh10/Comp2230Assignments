public interface StackADT<T> {

    public void push(T element);

    public T pop();

    public boolean isEmpty();

    public int size();

    public T peek();

    public String toString();
}
