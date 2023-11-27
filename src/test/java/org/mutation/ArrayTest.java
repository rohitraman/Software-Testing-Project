package org.mutation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTest {
    @Test
    public void twoSumTest1() {
        ArrayAlgo arrayAlgo = new ArrayAlgo();
        int[] arr = {1, 5, 2, 3};
        Assertions.assertTrue(arrayAlgo.twoSum(arr, 4));
    }

    @Test
    public void twoSumTest2() {
        ArrayAlgo arrayAlgo = new ArrayAlgo();
        int[] arr = {5, 3, 2, 1};
        Assertions.assertTrue(arrayAlgo.twoSum(arr, 4));
    }

    @Test
    public void twoSumTest3() {
        ArrayAlgo arrayAlgo = new ArrayAlgo();
        int[] arr = {5, 3, 2, 1};
        Assertions.assertFalse(arrayAlgo.twoSum(arr, 0));
    }

    @Test
    public void majorityElementTest1() {
        ArrayAlgo arrayAlgo = new ArrayAlgo();
        int[] arr = {4, 1, 2, 6, 1, 1, 1};
        Assertions.assertEquals(arrayAlgo.majorityElement(arr), 1);
    }

    @Test
    public void majorityElementTest2() {
        ArrayAlgo arrayAlgo = new ArrayAlgo();
        int[] arr = {4, 1, 2, 6, 1, 7, 5};
        Assertions.assertEquals(arrayAlgo.majorityElement(arr), -1);
    }

    @Test
    public void maxSubarraySumTest1() {
        ArrayAlgo arrayAlgo = new ArrayAlgo();
        int[] arr = {4, -1, 2, 6, -1, 7, 5};
        Assertions.assertEquals(arrayAlgo.maxSubarraySum(arr), 22);
    }

    @Test
    public void maxSubarraySumTest2() {
        ArrayAlgo arrayAlgo = new ArrayAlgo();
        int[] arr = {4, 1, 2};
        Assertions.assertEquals(arrayAlgo.maxSubarraySum(arr), 7);
    }

    @Test
    public void maxSubarraySumTest3() {
        ArrayAlgo arrayAlgo = new ArrayAlgo();
        int[] arr = {-4, 1, 2};
        Assertions.assertEquals(arrayAlgo.maxSubarraySum(arr), 3);
    }

    @Test
    public void maxProfitTest1() {
        ArrayAlgo arrayAlgo = new ArrayAlgo();
        int[] arr = {10, 20, 40 ,50};
        Assertions.assertEquals(arrayAlgo.maxProfit(arr), 40);
    }

    @Test
    public void trappingRainWaterTest1() {
        ArrayAlgo arrayAlgo = new ArrayAlgo();
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        Assertions.assertEquals(arrayAlgo.trappingRainWater(arr), 6);
    }

    @Test
    public void trappingRainWaterTest2() {
        ArrayAlgo arrayAlgo = new ArrayAlgo();
        int[] arr = {};
        Assertions.assertEquals(arrayAlgo.trappingRainWater(arr), 0);
    }

    @Test
    public void trappingRainWaterTest3() {
        ArrayAlgo arrayAlgo = new ArrayAlgo();
        int[] arr = {0};
        Assertions.assertEquals(arrayAlgo.trappingRainWater(arr), 0);
    }

    @Test
    public void trappingRainWaterTest4() {
        ArrayAlgo arrayAlgo = new ArrayAlgo();
        int[] arr = {0, 1, 0};
        Assertions.assertEquals(arrayAlgo.trappingRainWater(arr), 0);
    }

    @Test
    public void trappingRainWaterTest5() {
        ArrayAlgo arrayAlgo = new ArrayAlgo();
        int[] arr = {1};
        Assertions.assertEquals(arrayAlgo.trappingRainWater(arr), 0);
    }

    @Test
    public void testGetLongestSubarrayProblem() {
        // Test case 1: Regular array with a subarray summing up to k
        int[] arr1 = {1, 2, 3, 4, 5};
        int k1 = 9;
        Assertions.assertEquals(3, ArrayAlgo.getLongestSubarray(arr1, k1));

        // Test case 2: Array where k is not possible to achieve
        int[] arr2 = {3, 4, 5, 6};
        int k2 = 20;
        Assertions.assertEquals(0, ArrayAlgo.getLongestSubarray(arr2, k2));

        // Test case 3: Array where the entire array sums up to k
        int[] arr3 = {2, 2, 2, 2, 2};
        int k3 = 10;
        Assertions.assertEquals(5, ArrayAlgo.getLongestSubarray(arr3, k3));

        // Test case 4: Array with negative numbers
        int[] arr4 = {4, -1, 2, 1};
        int k4 = 2;
        Assertions.assertEquals(3, ArrayAlgo.getLongestSubarray(arr4, k4));

        // Test case 5: Array with all elements as zero
        int[] arr5 = {0, 0, 0, 0};
        int k5 = 0;
        Assertions.assertEquals(4, ArrayAlgo.getLongestSubarray(arr5, k5));

        // Test case 6: Array with a single element
        int[] arr6 = {5};
        int k6 = 5;
        Assertions.assertEquals(1, ArrayAlgo.getLongestSubarray(arr6, k6));

        // Test case 7: Array with no elements
        int[] arr7 = {};
        int k7 = 10;
        Assertions.assertEquals(0, ArrayAlgo.getLongestSubarray(arr7, k7));
    }


    @Test
    public void testGetLongestSubarray() {

        // Test case 2: Array with alternating positive and negative numbers
        int[] arr2 = {2, -3, 2, -4, 2};
        long k2 = -1;
        Assertions.assertEquals(2, ArrayAlgo.getLongestSubarray(arr2, k2));

        // Test case 3: Array with a single element and k=0
        int[] arr3 = {0};
        long k3 = 0;
        Assertions.assertEquals(1, ArrayAlgo.getLongestSubarray(arr3, k3));

        // Test case 4: Array with only one negative number and k=0
        int[] arr4 = {-5};
        long k4 = 0;
        Assertions.assertEquals(0, ArrayAlgo.getLongestSubarray(arr4, k4));

        // Test case 5: Array with increasing sequence
        int[] arr5 = {1, 2, 3, 4, 5};
        long k5 = 12;
        Assertions.assertEquals(3, ArrayAlgo.getLongestSubarray(arr5, k5));

        // Test case 6: Array with decreasing sequence
        int[] arr6 = {5, 4, 3, 2, 1};
        long k6 = 3;
        Assertions.assertEquals(2, ArrayAlgo.getLongestSubarray(arr6, k6));


        // Test case 8: Array with all elements as zero and k=0
        int[] arr8 = {0, 0, 0, 0};
        long k8 = 0;
        Assertions.assertEquals(4, ArrayAlgo.getLongestSubarray(arr8, k8));

        // Test case 9: Array with random elements
        int[] arr9 = {4, 5, -2, 1, 2, 3, -6, 7};
        long k9 = 7;
        Assertions.assertEquals(0, ArrayAlgo.getLongestSubarray(arr9, k9));


    }



    @Test
    public void testFindUnion() {
        // Test case 1: Regular arrays with no common elements
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        ArrayList<Integer> expected1 = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            expected1.add(i);
        }
        Assertions.assertEquals(expected1, ArrayAlgo.FindUnion(arr1, arr2, arr1.length, arr2.length));

        // Test case 2: Arrays with some common elements
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = {3, 4, 5, 6, 7};
        ArrayList<Integer> expected2 = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            expected2.add(i);
        }
        Assertions.assertEquals(expected2, ArrayAlgo.FindUnion(arr3, arr4, arr3.length, arr4.length));

        // Test case 3: Arrays with all elements being the same
        int[] arr5 = {1, 1, 1, 1, 1};
        int[] arr6 = {1, 1, 1, 1, 1};
        ArrayList<Integer> expected3 = new ArrayList<>();
        expected3.add(1);
        Assertions.assertEquals(expected3, ArrayAlgo.FindUnion(arr5, arr6, arr5.length, arr6.length));

        // Test case 4: Arrays with empty input
        int[] arr7 = {};
        int[] arr8 = {};
        ArrayList<Integer> expected4 = new ArrayList<>();
        Assertions.assertEquals(expected4, ArrayAlgo.FindUnion(arr7, arr8, arr7.length, arr8.length));

        // Test case 5: Arrays with negative numbers
        int[] arr9 = {-3, -2, -1};
        int[] arr10 = {-2, -1, 0};
        ArrayList<Integer> expected5 = new ArrayList<>();
        for (int i = -3; i <= 0; i++) {
            expected5.add(i);
        }
        Assertions.assertEquals(expected5, ArrayAlgo.FindUnion(arr9, arr10, arr9.length, arr10.length));
    }

    @Test
    public void testMissingNumber() {
        int[] arr6 = {2, 3, 4, 5, 6};
        int N6 = 6;
        Assertions.assertEquals(1, ArrayAlgo.missingNumber(arr6, N6));



        int[] arr7 = {};
        int N7 = 0;
        Assertions.assertEquals(-1, ArrayAlgo.missingNumber(arr7, N7));
    }

    @Test
    public void testMaxProductSubarray() {
        int[] nums = {1,2,-3,0,-4,-5};
        ArrayAlgo arrayAlgo = new ArrayAlgo();
        Assertions.assertEquals(arrayAlgo.maxProductSubArray(nums), 20);
    }

    @Test
    public void testMajorityElement() {
        int[] arr = {11, 33, 22, 33, 11, 33, 11};
        ArrayAlgo arrayAlgo = new ArrayAlgo();
        List<Integer> ans = arrayAlgo.majorityElementNBy3(arr);
        Assertions.assertEquals(ans, Arrays.asList(11, 33));
    }

    @Test
    public void testRepeatAndMissing() {
        int[] a = {3, 1, 2, 5, 4, 6, 7, 5};
        ArrayAlgo arrayAlgo = new ArrayAlgo();
        int[] ans = arrayAlgo.findMissingRepeatingNumbers(a);
        Assertions.assertEquals(ans[0], 5);
        Assertions.assertEquals(ans[1], 8);
    }
}
