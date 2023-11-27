package org.mutation;

// Interface for Queue
// Interface for Queue
public interface MyQueue<T> {
    void enqueue(T element);

    T dequeue();

    boolean isEmpty();

    int size();
}
