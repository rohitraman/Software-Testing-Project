package org.mutation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {
    @Test
    public void binarySearchTests() {
        BinarySearchAlgo binarySearchAlgo = new BinarySearchAlgo();
        int[] arr = {1, 3, 5, 7};
        Assertions.assertEquals(binarySearchAlgo.binarySearch(arr, 5), 2);
        Assertions.assertEquals(binarySearchAlgo.binarySearch(arr, 7), 3);
        Assertions.assertEquals(binarySearchAlgo.binarySearch(arr, 1), 0);
        Assertions.assertEquals(binarySearchAlgo.binarySearch(arr, 2), -1);
    }

    @Test
    public void lowerBoundTests() {
        BinarySearchAlgo binarySearchAlgo = new BinarySearchAlgo();
        int[] arr = {1, 3, 5, 7};
        Assertions.assertEquals(binarySearchAlgo.lowerBound(arr, 4), 2);
        Assertions.assertEquals(binarySearchAlgo.lowerBound(arr, 6), 3);
        Assertions.assertEquals(binarySearchAlgo.lowerBound(arr, 1), 0);
        Assertions.assertEquals(binarySearchAlgo.lowerBound(arr, 7), 3);
    }

    @Test
    public void upperBoundTests() {
        BinarySearchAlgo binarySearchAlgo = new BinarySearchAlgo();
        int[] arr = {1, 3, 5, 7};
        Assertions.assertEquals(binarySearchAlgo.upperBound(arr, 4), 2);
        Assertions.assertEquals(binarySearchAlgo.upperBound(arr, 6), 3);
        Assertions.assertEquals(binarySearchAlgo.upperBound(arr, 1), 1);
        Assertions.assertEquals(binarySearchAlgo.upperBound(arr, 7), 4);
    }

    @Test
    public void peakElementTest1() {
        BinarySearchAlgo binarySearchAlgo = new BinarySearchAlgo();
        int[] arr = {1, 3, 5, 2, 0};
        Assertions.assertEquals(binarySearchAlgo.findPeakElement(arr), 2);
    }

    @Test
    public void peakElementTest2() {
        BinarySearchAlgo binarySearchAlgo = new BinarySearchAlgo();
        int[] arr = {1, 3, 4, 5, 2, 0};
        Assertions.assertEquals(binarySearchAlgo.findPeakElement(arr), 3);
    }

    @Test
    public void peakElementTest3() {
        BinarySearchAlgo binarySearchAlgo = new BinarySearchAlgo();
        int[] arr = {};
        Assertions.assertEquals(binarySearchAlgo.findPeakElement(arr), -1);
    }

    @Test
    public void peakElementTest4() {
        BinarySearchAlgo binarySearchAlgo = new BinarySearchAlgo();
        int[] arr = {1, 7, 5, 2, 0};
        Assertions.assertEquals(binarySearchAlgo.findPeakElement(arr), 1);
    }
}
