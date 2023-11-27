package org.mutation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HeapTest {
    @Test
    public void kthLargestTest() {
        HeapAlgo heapAlgo = new HeapAlgo();
        int[] arr = {4, 3, 6, 7, 10};
        Assertions.assertEquals(heapAlgo.kthLargest(arr, 3), 6);
        Assertions.assertEquals(heapAlgo.kthLargest(arr, 10), -1);
        Assertions.assertEquals(heapAlgo.kthLargest(arr, 5), 3);
        Assertions.assertEquals(heapAlgo.kthLargest(arr, 1), 10);
    }

    @Test
    public void kthSmallestTest() {
        HeapAlgo heapAlgo = new HeapAlgo();
        int[] arr = {4, 3, 6, 7, 10};
        Assertions.assertEquals(heapAlgo.kthSmallest(arr, 3), 6);
        Assertions.assertEquals(heapAlgo.kthSmallest(arr, 10), -1);
        Assertions.assertEquals(heapAlgo.kthSmallest(arr, 5), 10);
        Assertions.assertEquals(heapAlgo.kthSmallest(arr, 1), 3);
    }

    @Test
    public void taskSchedulerTest1() {
        HeapAlgo heapAlgo = new HeapAlgo();
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        Assertions.assertEquals(heapAlgo.leastInterval(tasks, 0), 6);
        Assertions.assertEquals(heapAlgo.leastInterval(tasks, 2), 8);
    }

    @Test
    public void taskSchedulerTest2() {
        HeapAlgo heapAlgo = new HeapAlgo();
        char[] tasks = {'A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        Assertions.assertEquals(heapAlgo.leastInterval(tasks, 2), 16);
    }

    @Test
    public void taskSchedulerTest3() {
        HeapAlgo heapAlgo = new HeapAlgo();
        char[] tasks = {};
        Assertions.assertEquals(heapAlgo.leastInterval(tasks, 2), 0);
        Assertions.assertEquals(heapAlgo.leastInterval(tasks, 0), 0);
    }

    @Test
    public void taskSchedulerTest4() {
        HeapAlgo heapAlgo = new HeapAlgo();
        char[] tasks = {'A', 'A', 'A'};
        Assertions.assertEquals(heapAlgo.leastInterval(tasks, 2), 7);
        Assertions.assertEquals(heapAlgo.leastInterval(tasks, 0), 3);
    }
}
