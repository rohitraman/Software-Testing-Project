package org.mutation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackTest {
    @Test
    public void ngeTest1() {
        int[] arr = {1, 5, 3, 4, 2};
        StackAlgo stackAlgo = new StackAlgo();
        int[] nges = stackAlgo.nextGreaterElements(arr);
        int[] ans = {5, -1, 4, -1, -1};
        boolean flag = true;
        for (int i = 0; i < ans.length; i++) {
            if (nges[i] != ans[i]) {
                flag = false;
                break;
            }
        }
        Assertions.assertTrue(flag);
    }
    @Test
    public void ngeTest2() {
        int[] arr = {};
        StackAlgo stackAlgo = new StackAlgo();
        int[] nges = stackAlgo.nextGreaterElements(arr);
        Assertions.assertEquals(0, nges.length);
    }

    @Test
    public void asteroidCollisionTest1() {
        int[] arr = {5,10,-5};
        StackAlgo stackAlgo = new StackAlgo();
        int[] ans = stackAlgo.asteroidCollision(arr);
        int[] expectedAns = {5,10};
        boolean flag = true;
        for (int i = 0; i < ans.length; i++) {
            if (expectedAns[i] != ans[i]) {
                flag = false;
                break;
            }
        }
        Assertions.assertTrue(flag);
    }

    @Test
    public void asteroidCollisionTest2() {
        int[] arr = {8, -8};
        StackAlgo stackAlgo = new StackAlgo();
        int[] ans = stackAlgo.asteroidCollision(arr);
        Assertions.assertEquals(0, ans.length);
    }

    @Test
    public void asteroidCollisionTest3() {
        int[] arr = {10, 2, -5};
        StackAlgo stackAlgo = new StackAlgo();
        int[] ans = stackAlgo.asteroidCollision(arr);
        int[] expectedAns = {10};
        boolean flag = true;
        for (int i = 0; i < ans.length; i++) {
            if (expectedAns[i] != ans[i]) {
                flag = false;
                break;
            }
        }
        Assertions.assertTrue(flag);
    }

    @Test
    public void asteroidCollisionTest4() {
        int[] arr = {-8, -8};
        StackAlgo stackAlgo = new StackAlgo();
        int[] ans = stackAlgo.asteroidCollision(arr);
        Assertions.assertEquals(2, ans.length);
    }

    @Test
    public void subArrayRangesTest1() {
        int[] arr = {1, 2, 3};
        StackAlgo stackAlgo = new StackAlgo();
        Assertions.assertEquals(stackAlgo.subArrayRanges(arr), 4);
    }

    @Test
    public void subArrayRangesTest2() {
        int[] arr = {1, 3, 3};
        StackAlgo stackAlgo = new StackAlgo();
        Assertions.assertEquals(stackAlgo.subArrayRanges(arr), 4);
    }

    @Test
    public void subArrayRangesTest3() {
        int[] arr = {4,-2,-3,4,1};
        StackAlgo stackAlgo = new StackAlgo();
        Assertions.assertEquals(stackAlgo.subArrayRanges(arr), 59);
    }

    @Test
    public void removeKDigitsTest() {
        StackAlgo stackAlgo = new StackAlgo();
        Assertions.assertEquals(stackAlgo.removeKDigits("1432219", 3), "1219");
        Assertions.assertEquals(stackAlgo.removeKDigits("10200", 1), "200");
        Assertions.assertEquals(stackAlgo.removeKDigits("10", 2), "0");
        Assertions.assertEquals(stackAlgo.removeKDigits("1211", 2), "11");
    }

    @Test
    public void largestHistogramTest1() {
        StackAlgo stackAlgo = new StackAlgo();
        int[] arr = {2,1,5,6,2,3};
        Assertions.assertEquals(stackAlgo.largestRectangleArea(arr), 10);
    }

    @Test
    public void largestHistogramTest2() {
        StackAlgo stackAlgo = new StackAlgo();
        int[] arr = {2,4};
        Assertions.assertEquals(stackAlgo.largestRectangleArea(arr), 4);
    }

    @Test
    public void largestHistogramTest3() {
        StackAlgo stackAlgo = new StackAlgo();
        int[] arr = {};
        Assertions.assertEquals(stackAlgo.largestRectangleArea(arr), 0);
    }
}
