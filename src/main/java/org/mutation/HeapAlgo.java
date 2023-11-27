package org.mutation;

import java.util.Arrays;
import java.util.PriorityQueue;

public class HeapAlgo {
    public int kthLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq= new PriorityQueue<>((a,b)->b-a);
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        int f = k - 1 ;
        while (!pq.isEmpty() && f > 0) {
            pq.remove();
            f-- ;
        }
        if (pq.isEmpty()) {
            return -1;
        }
       return pq.peek();
    }

    public int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            pq.add(arr[i]);
        }
        int f = k - 1;
        while (!pq.isEmpty() && f > 0) {
            pq.remove();
            f-- ;
        }
        if (pq.isEmpty()) {
            return -1;
        }
        return pq.peek();
    }

    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char task : tasks) {
            freq[task - 'A']++;
        }
        Arrays.sort(freq);
        int maxFreq = freq[25] - 1;
        int idleSlots = maxFreq * n;
        for (int i = 24; i >= 0 && freq[i] > 0; i--) {
            idleSlots -= Math.min(maxFreq, freq[i]);
        }
        return idleSlots > 0 ? idleSlots + tasks.length : tasks.length;
    }

}
