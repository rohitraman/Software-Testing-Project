package org.mutation;

import java.util.ArrayList;
import java.util.NoSuchElementException;

// ArrayQueue implementation
public class ArrayQueue<T> implements MyQueue<T> {
    private ArrayList<T> elements;

    public ArrayQueue() {
        elements = new ArrayList<>();
    }

    public void enqueue(T element) {
        elements.add(element);
    }

    public T dequeue() {
        return elements.remove(0);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int size() {
        return elements.size();
    }
}
