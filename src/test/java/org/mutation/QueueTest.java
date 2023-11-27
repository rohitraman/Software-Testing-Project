package org.mutation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void testArrayQueue() {

        MyQueue<Integer> queue = new ArrayQueue<>();
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());

        // Enqueue elements
        queue.enqueue(5);
        queue.enqueue(10);
        assertFalse(queue.isEmpty());
        assertEquals(2, queue.size());

        // Dequeue elements
        assertEquals(5, queue.dequeue());
        assertEquals(1, queue.size());
        assertFalse(queue.isEmpty());
        assertEquals(10, queue.dequeue());


    }



    @Test
    void testCircularQueue() {
        MyQueue<Character> queue = new CircularQueue<>(3);
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());

        // Enqueue elements in a circular manner
        queue.enqueue('A');
        queue.enqueue('B');
        assertFalse(queue.isEmpty());
        assertEquals(2, queue.size());

        // Dequeue elements from the circular queue
        assertEquals('A', queue.dequeue());
        assertEquals(1, queue.size());
        assertFalse(queue.isEmpty());
        queue.enqueue('C');
        assertEquals('B', queue.dequeue());
        assertEquals(1, queue.size());
        assertFalse(queue.isEmpty());
        assertEquals('C', queue.dequeue());



        // Test when capacity is reached
        queue.enqueue('D');
        queue.enqueue('E');
        queue.enqueue('F');
        assertFalse(queue.isEmpty());
        assertEquals(3, queue.size());

        // Test circular behavior after reaching capacity
        assertEquals('D', queue.dequeue());
        queue.enqueue('G');
        assertEquals('D', queue.dequeue());
        assertEquals('E', queue.dequeue());
        assertEquals('G', queue.dequeue());
        assertTrue(queue.isEmpty());
    }
}
