package org.mutation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SlidingWindowTest {
    @Test
    public void longestSSTest1() {
        SlidingWindowAlgo slidingWindowAlgo = new SlidingWindowAlgo();
        Assertions.assertEquals(slidingWindowAlgo.longestSSWithNoRepeatingCharacters("ABCABCD"), 3);
        Assertions.assertEquals(slidingWindowAlgo.longestSSWithNoRepeatingCharacters("ABCD"), 4);
        Assertions.assertEquals(slidingWindowAlgo.longestSSWithNoRepeatingCharacters("AAAAA"), 1);
        Assertions.assertEquals(slidingWindowAlgo.longestSSWithNoRepeatingCharacters("A"), 1);
        Assertions.assertEquals(slidingWindowAlgo.longestSSWithNoRepeatingCharacters(""), 0);
    }

    @Test
    public void longestConsecutiveOnes1() {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        SlidingWindowAlgo slidingWindowAlgo = new SlidingWindowAlgo();
        Assertions.assertEquals(slidingWindowAlgo.longestOnes(nums, k), 6);
    }

    @Test
    public void longestConsecutiveOnes2() {
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        SlidingWindowAlgo slidingWindowAlgo = new SlidingWindowAlgo();
        Assertions.assertEquals(slidingWindowAlgo.longestOnes(nums, k), 10);
    }

    @Test
    public void longestConsecutiveOnes3() {
        int[] nums = {};
        int k = 3;
        SlidingWindowAlgo slidingWindowAlgo = new SlidingWindowAlgo();
        Assertions.assertEquals(slidingWindowAlgo.longestOnes(nums, k), 0);
    }

    @Test
    public void characterReplacement1() {
        String s = "ABAB";
        int k = 2;
        SlidingWindowAlgo slidingWindowAlgo = new SlidingWindowAlgo();
        Assertions.assertEquals(slidingWindowAlgo.characterReplacement(s, k), 3);
    }

    @Test
    public void characterReplacement2() {
        String s = "AABABBA";
        int k = 1;
        SlidingWindowAlgo slidingWindowAlgo = new SlidingWindowAlgo();
        Assertions.assertEquals(slidingWindowAlgo.characterReplacement(s, k), 2);
    }

    @Test
    public void characterReplacement3() {
        String s = "";
        int k = 1;
        SlidingWindowAlgo slidingWindowAlgo = new SlidingWindowAlgo();
        Assertions.assertEquals(slidingWindowAlgo.characterReplacement(s, k), 0);
    }

    @Test
    public void noOfSubArrays1() {
        String s = "abcabc";
        SlidingWindowAlgo slidingWindowAlgo = new SlidingWindowAlgo();
        Assertions.assertEquals(slidingWindowAlgo.numberOfSubstrings(s), 10);
    }

    @Test
    public void noOfSubArrays2() {
        String s = "aaacb";
        SlidingWindowAlgo slidingWindowAlgo = new SlidingWindowAlgo();
        Assertions.assertEquals(slidingWindowAlgo.numberOfSubstrings(s), 3);
    }

    @Test
    public void noOfSubArrays3() {
        String s = "";
        SlidingWindowAlgo slidingWindowAlgo = new SlidingWindowAlgo();
        Assertions.assertEquals(slidingWindowAlgo.numberOfSubstrings(s), 0);
    }

    @Test
    public void noOfSubArrays4() {
        String s = "abc";
        SlidingWindowAlgo slidingWindowAlgo = new SlidingWindowAlgo();
        Assertions.assertEquals(slidingWindowAlgo.numberOfSubstrings(s), 1);
    }
}
