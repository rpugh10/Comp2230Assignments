package com.ch15lists;

public interface ListADT<T> {
    public T removeFirst();

    public T removeLast();

    public T first();

    public T last();

    public boolean isEmpty();

    public int size();

    public String toString();
}

