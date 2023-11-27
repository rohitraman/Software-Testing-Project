package org.mutation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DPTest {
    @Test
    public void climbingStairsTest() {
        DPAlgo dpAlgo = new DPAlgo();
        Assertions.assertEquals(dpAlgo.climbingStairs(0), 1);
        Assertions.assertEquals(dpAlgo.climbingStairs(1), 1);
        Assertions.assertEquals(dpAlgo.climbingStairs(2), 2);
        Assertions.assertEquals(dpAlgo.climbingStairs(5), 8);
        Assertions.assertEquals(dpAlgo.climbingStairs(10), 89);
    }

    @Test
    public void frogJumpWithDistanceKTest1() {
        DPAlgo dpAlgo = new DPAlgo();
        int[] heights = {30, 10, 60, 10, 60, 50};
        Assertions.assertEquals(dpAlgo.frogJumpWithDistanceK(heights, 2), 40);
        Assertions.assertEquals(dpAlgo.frogJumpWithDistanceK(heights, 0), Integer.MAX_VALUE);
        Assertions.assertEquals(dpAlgo.frogJumpWithDistanceK(heights, 1), 180);
    }

    @Test
    public void frogJumpWithDistanceKTest2() {
        DPAlgo dpAlgo = new DPAlgo();
        int[] heights =  {30};
        Assertions.assertEquals(dpAlgo.frogJumpWithDistanceK(heights, 3), 0);
        Assertions.assertEquals(dpAlgo.frogJumpWithDistanceK(heights, 1), 0);
    }

    @Test
    public void frogJumpWithDistanceKTest3() {
        DPAlgo dpAlgo = new DPAlgo();
        int[] heights = {30, 20};
        Assertions.assertEquals(dpAlgo.frogJumpWithDistanceK(heights, 3), 10);
        Assertions.assertEquals(dpAlgo.frogJumpWithDistanceK(heights, 1), 10);
    }

    @Test
    public void frogJumpWithDistanceKTest4() {
        DPAlgo dpAlgo = new DPAlgo();
        int[] heights = {};
        Assertions.assertEquals(dpAlgo.frogJumpWithDistanceK(heights, 3), -1);
        Assertions.assertEquals(dpAlgo.frogJumpWithDistanceK(heights, 1), -1);
    }

    @Test
    public void uniquePathsTests() {
        DPAlgo dpAlgo = new DPAlgo();
        Assertions.assertEquals(dpAlgo.uniquePaths(1, 1), 1);
        Assertions.assertEquals(dpAlgo.uniquePaths(2, 2), 2);
        Assertions.assertEquals(dpAlgo.uniquePaths(3, 1), 1);
        Assertions.assertEquals(dpAlgo.uniquePaths(1, 3), 1);
        Assertions.assertEquals(dpAlgo.uniquePaths(3, 2), 3);
        Assertions.assertEquals(dpAlgo.uniquePaths(3, 4), 10);
    }

    @Test
    public void subsetSumTests1() {
        DPAlgo dpAlgo = new DPAlgo();
        int[] arr = {1, 4, 5, 6};
        Assertions.assertTrue(dpAlgo.subsetSumToK(9, arr));
        Assertions.assertTrue(dpAlgo.subsetSumToK(0, arr));
        Assertions.assertFalse(dpAlgo.subsetSumToK(20, arr));
    }

    @Test
    public void subsetSumTests2() {
        DPAlgo dpAlgo = new DPAlgo();
        int[] arr =  {};
        Assertions.assertFalse(dpAlgo.subsetSumToK(20, arr));
        Assertions.assertTrue(dpAlgo.subsetSumToK(0, arr));
    }

    @Test
    public void editDistanceTests() {
        DPAlgo dpAlgo = new DPAlgo();
        Assertions.assertEquals(dpAlgo.editDistance("", ""), 0);
        Assertions.assertEquals(dpAlgo.editDistance("ABCD", ""), 4);
        Assertions.assertEquals(dpAlgo.editDistance("", "ABCD"), 0);
        Assertions.assertEquals(dpAlgo.editDistance("ABCD", "ABCD"), 0);
        Assertions.assertEquals(dpAlgo.editDistance("ABCC", "ABCD"), 1);
        Assertions.assertEquals(dpAlgo.editDistance("ACCC", "BCACE"), 3);
        Assertions.assertEquals(dpAlgo.editDistance("BCABC", "ABCD"), 3);
    }

    @Test
    public void lisTest1() {
        DPAlgo dpAlgo = new DPAlgo();
        int[] arr = {-1, 0, 4, 6, 3};
        Assertions.assertEquals(dpAlgo.longestIncreasingSubsequence(arr), 4);
    }

    @Test
    public void lisTest2() {
        DPAlgo dpAlgo = new DPAlgo();
        int[] arr = {-1};
        Assertions.assertEquals(dpAlgo.longestIncreasingSubsequence(arr), 1);
    }

    @Test
    public void lisTest3() {
        DPAlgo dpAlgo = new DPAlgo();
        int[] arr = {};
        Assertions.assertEquals(dpAlgo.longestIncreasingSubsequence(arr), 0);
    }

    @Test
    public void lisTest4() {
        DPAlgo dpAlgo = new DPAlgo();
        int[] arr = {-1, -2, -3, -4};
        Assertions.assertEquals(dpAlgo.longestIncreasingSubsequence(arr), 1);
    }

    @Test
    public void lisTest5() {
        DPAlgo dpAlgo = new DPAlgo();
        int[] arr = {1, 2, 3, 4, 5};
        Assertions.assertEquals(dpAlgo.longestIncreasingSubsequence(arr), 5);
    }

    @Test
    public void costOfCutsTest1() {
        DPAlgo dpAlgo = new DPAlgo();
        ArrayList<Integer> cuts = new ArrayList<>(Arrays.asList(3, 5, 1, 4));
        Assertions.assertEquals(dpAlgo.costOfCuts(7, cuts.size(), cuts), 16);
    }

    @Test
    public void costOfCuts2Test2() {
        DPAlgo dpAlgo = new DPAlgo();
        ArrayList<Integer> cuts = new ArrayList<>();
        Assertions.assertEquals(dpAlgo.costOfCuts(7, 0, cuts), 0);
    }

    @Test
    public void costOfCutsTest3() {
        DPAlgo dpAlgo = new DPAlgo();
        ArrayList<Integer> cuts = new ArrayList<>(Arrays.asList(3, 5, 1, 4));
        Assertions.assertEquals(dpAlgo.costOfCuts(0, cuts.size(), cuts), 11);
    }

    @Test
    public void costOfCutsTest4() {
        DPAlgo dpAlgo = new DPAlgo();
        ArrayList<Integer> cuts = new ArrayList<>();
        Assertions.assertEquals(dpAlgo.costOfCuts(0, 0, cuts), 0);
    }

    @Test
    public void costOfCutsTest5() {
        DPAlgo dpAlgo = new DPAlgo();
        ArrayList<Integer> cuts = new ArrayList<>(List.of(1));
        Assertions.assertEquals(dpAlgo.costOfCuts(6, 1, cuts), 6);
    }

    @Test
    public void testCanPartitionBasicCae() {
        int[] arr = {1, 5, 11, 5};
        boolean expected = true; // Expected result for an array that can be partitioned

        boolean result = DPAlgo.canPartition(arr);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCanPartitionNPartitionPossible() {
        int[] arr = {1, 2, 3, 5};
        boolean expected = false; // Expected result when no partition is possible

        boolean result = DPAlgo.canPartition(arr);
        Assertions.assertEquals(expected, result);
    }


    @Test
    public void testCanPartitionAllEqualValues() {
        int[] arr = {3, 3, 3, 3};
        boolean expected = true; // Expected result for an array with all equal values

        boolean result = DPAlgo.canPartition(arr);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testWordBreakBasicCase() {
        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet", "code");
        boolean expected = true; // Expected result for a basic scenario

        boolean result = DPAlgo.wordBreak(s, wordDict);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testWordBreakEmptyString() {
        String s = "";
        List<String> wordDict = Arrays.asList("a", "b", "c");
        boolean expected = true; // Expected result for an empty string

        boolean result = DPAlgo.wordBreak(s, wordDict);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testWordBreakNoWordMatch() {
        String s = "applepenapple";
        List<String> wordDict = Arrays.asList("apple", "pen");
        boolean expected = true; // Expected result when no word matches

        boolean result = DPAlgo.wordBreak(s, wordDict);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testWordBreakRepeatedWords() {
        String s = "aaaaaaa";
        List<String> wordDict = Arrays.asList("aaaa", "aaa");
        boolean expected = true; // Expected result for repeated words

        boolean result = DPAlgo.wordBreak(s, wordDict);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testWordBreakDifferentCases() {
        String s = "catsandog";
        List<String> wordDict = Arrays.asList("cats", "dog", "sand", "and", "cat");
        boolean expected = false; // Expected result for a different case

        boolean result = DPAlgo.wordBreak(s, wordDict);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testJobSchedulingBasicCase() {
        int[] startTime = {1, 2, 3, 3};
        int[] endTime = {3, 4, 5, 6};
        int[] profit = {50, 10, 40, 70};
        int expected = 120; // Expected maximum profit for a basic scenario

        int result = DPAlgo.jobScheduling(startTime, endTime, profit);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testJobSchedulingNJobs() {
        int[] startTime = {};
        int[] endTime = {};
        int[] profit = {};
        int expected = 0; // Expected result when there are no jobs

        int result = DPAlgo.jobScheduling(startTime, endTime, profit);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testJobSchedulingSingleJob() {
        int[] startTime = {1};
        int[] endTime = {3};
        int[] profit = {5};
        int expected = 5; // Expected result for a single job

        int result = DPAlgo.jobScheduling(startTime, endTime, profit);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testJobSchedulingEqualProfits() {
        int[] startTime = {1, 2, 3};
        int[] endTime = {3, 4, 5};
        int[] profit = {10, 10, 10};
        int expected = 20; // Expected result for equal profits

        int result = DPAlgo.jobScheduling(startTime, endTime, profit);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testJobSchedulingLargeProfits() {
        int[] startTime = {1, 2, 3, 4, 5};
        int[] endTime = {3, 4, 5, 6, 7};
        int[] profit = {100, 200, 300, 400, 500};
        int expected = 900; // Expected result for large profits

        int result = DPAlgo.jobScheduling(startTime, endTime, profit);
        Assertions.assertEquals(expected, result);
    }




    @Test
    public void testJobSchedulingNoJobs() {
        int[] startTime = {};
        int[] endTime = {};
        int[] profit = {};
        int expected = 0; // Expected result when there are no jobs

        int result = DPAlgo.jobScheduling(startTime, endTime, profit);
        Assertions.assertEquals(expected, result);
    }




    @Test
    public void testOptimalStrategyOfGameBasicCase() {
        int[] arr = {8, 15, 3, 7};
        int n = arr.length;
        int expected = 22; // Expected result for a basic scenario

        int result = DPAlgo.optimalStrategyOfGame(arr, n);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testOptimalStrategyOfGameAllEqualValues() {
        int[] arr = {5, 5, 5, 5, 5};
        int n = arr.length;
        int expected = 15; // Expected result for an array with all equal values

        int result = DPAlgo.optimalStrategyOfGame(arr, n);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testOptimalStrategyOfGameTwoElements() {
        int[] arr = {9, 15};
        int n = arr.length;
        int expected = 15; // Expected result for an array with only two elements

        int result = DPAlgo.optimalStrategyOfGame(arr, n);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testOptimalStrategyOfGameThreeElements() {
        int[] arr = {6, 4, 2};
        int n = arr.length;
        int expected = 8; // Expected result for an array with three elements

        int result = DPAlgo.optimalStrategyOfGame(arr, n);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testOptimalStrategyOfGameFourElements() {
        int[] arr = {4, 2, 10, 5};
        int n = arr.length;
        int expected = 14; // Expected result for an array with four elements

        int result = DPAlgo.optimalStrategyOfGame(arr, n);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testMaxSumISBasicCase() {
        int[] arr = {1, 101, 2, 3, 100, 4, 5};
        int n = arr.length;
        int expected = 106; // Expected maximum sum of increasing subsequence

        int result = DPAlgo.maxSumIS(arr, n);
        Assertions.assertEquals(expected, result);
    }


    @Test
    public void testMaxSumISSingleElementArray() {
        int[] arr = {5};
        int n = arr.length;
        int expected = 5; // Expected result for an array with a single element

        int result = DPAlgo.maxSumIS(arr, n);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testMaxSumISDecreasingArray() {
        int[] arr = {5, 4, 3, 2, 1};
        int n = arr.length;
        int expected = 5; // Expected result for a decreasing array

        int result = DPAlgo.maxSumIS(arr, n);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testMaxSumISAscendingArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int expected = 15; // Expected result for an already ascending array

        int result = DPAlgo.maxSumIS(arr, n);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCanPartitionBasicCase() {
        int[] arr = {1, 5, 11, 5};
        boolean expected = true; // Expected result for an array that can be partitioned

        boolean result = DPAlgo.canPartition(arr);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCanPartitionSingleElementArray() {
        int[] arr = {10};
        boolean expected = false; // Expected result for an array with a single element

        boolean result = DPAlgo.canPartition(arr);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCanPartitionEmptyArray() {
        int[] arr = {};
        boolean expected = true; // Expected result for an empty array

        boolean result = DPAlgo.canPartition(arr);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCanPartitionNoPartitionPossible() {
        int[] arr = {3, 4, 5, 6};
        boolean expected = true; // Expected result for an array with no partition possible

        boolean result = DPAlgo.canPartition(arr);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCanPartitionLargeArray() {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        boolean expected = false; // Expected result for a large array that can be partitioned

        boolean result = DPAlgo.canPartition(arr);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testLCSBasicCase() {
        String s1 = "ABCDGH";
        String s2 = "AEDFHR";
        int expected = 3; // Expected length of the longest common subsequence

        int result = DPAlgo.lcs(s1, s2);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testLCSOneEmptyString() {
        String s1 = "hello";
        String s2 = "";
        int expected = 0; // Expected length when one string is empty

        int result = DPAlgo.lcs(s1, s2);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testLCSSameStrings() {
        String s1 = "same";
        String s2 = "same";
        int expected = 4; // Expected length when both strings are the same

        int result = DPAlgo.lcs(s1, s2);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testLCSNoCommonSubsequence() {
        String s1 = "abc";
        String s2 = "def";
        int expected = 0; // Expected length when no common subsequence exists

        int result = DPAlgo.lcs(s1, s2);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testLCSLongStrings() {
        String s1 = "abcdefghijkl";
        String s2 = "mnopqrstuvwxyz";
        int expected = 0; // Expected length when no common subsequence exists in long strings

        int result = DPAlgo.lcs(s1, s2);
        Assertions.assertEquals(expected, result);
    }


    @Test
    public void testCoinChangeBasicCase() {
        int[] coins = {1, 2, 5};
        int amount = 11;
        int expected = 3; // Expected minimum number of coins to make up the amount

        int result = DPAlgo.coinChange(coins, amount);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCoinChangeNoSolution() {
        int[] coins = {2};
        int amount = 3;
        int expected = -1; // Expected result when no solution is possible

        int result = DPAlgo.coinChange(coins, amount);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCoinChangeZeroAmount() {
        int[] coins = {1, 2, 5};
        int amount = 0;
        int expected = 0; // Expected result when amount is zero

        int result = DPAlgo.coinChange(coins, amount);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCoinChangeSameCoinValue() {
        int[] coins = {1, 1, 1, 1, 1};
        int amount = 3;
        int expected = 3; // Expected result when multiple coins of the same value are used

        int result = DPAlgo.coinChange(coins, amount);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCoinChangeLargeAmount() {
        int[] coins = {1, 2, 5};
        int amount = 100;
        int expected = 20; // Expected result for a large amount with available coin denominations

        int result = DPAlgo.coinChange(coins, amount);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testKnapsackBasicCase() {
        int[] weights = {2, 3, 4, 5};
        int[] values = {3, 7, 2, 9};
        int n = 4;
        int maxWeight = 5;
        int expected = 10; // Expected maximum value for given weights and values

        int result = DPAlgo.knapsack(weights, values, n, maxWeight);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testKnapsackEmptyInput() {
        int[] weights = {};
        int[] values = {};
        int n = 0;
        int maxWeight = 10;
        int expected = 0; // Expected result for an empty input

        int result = DPAlgo.knapsack(weights, values, n, maxWeight);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testKnapsackMaxWeightZero() {
        int[] weights = {1, 2, 3};
        int[] values = {5, 3, 7};
        int n = 3;
        int maxWeight = 0;
        int expected = 0; // Expected result when maximum weight is zero

        int result = DPAlgo.knapsack(weights, values, n, maxWeight);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testKnapsackAllItemsFit() {
        int[] weights = {1, 2, 3};
        int[] values = {5, 3, 7};
        int n = 3;
        int maxWeight = 6;
        int expected = 15; // Expected result when all items fit into the knapsack

        int result = DPAlgo.knapsack(weights, values, n, maxWeight);
        Assertions.assertEquals(expected, result);
    }


    @Test
    public void testRodCutting() {
        int[] prices = {1, 5, 8, 9};
        int n = 4;

        int expected = 10;
        int result = DPAlgo.rodCutting(prices, n);

        Assertions.assertEquals(expected, result);

        // Edge case
        prices = new int[0];
        n = 0;

        expected = 0;
        result = DPAlgo.rodCutting(prices, n);
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void testSubsetSum() {
        int[] arr = {3, 4, 5};
        int sum = 9;

        boolean expected = true;
        boolean result = DPAlgo.subsetSum(arr, sum);
        Assertions.assertEquals(expected, result);

        arr = new int[]{1, 2, 3, 8};
        sum = 6;
        expected = true;
        result = DPAlgo.subsetSum(arr, sum);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testPartitionProblem() {
        int n = 4;
        int expected = 14;

        int result = DPAlgo.partitionProblem(n);
        Assertions.assertEquals(expected, result);

        n = 2;
        expected = 2;

        result = DPAlgo.partitionProblem(n);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testMaxRibbonCut() {
        int[] ribbons = {2,3,5};
        int n = 3;
        int maxLength = 5;
        int expected = 2;

        int result = DPAlgo.maxRibbonCut(ribbons, n, maxLength);
        Assertions.assertEquals(expected, result);

        ribbons = new int[]{2,4};
        n = 2;
        maxLength = 7;
        expected = 2;

        result = DPAlgo.maxRibbonCut(ribbons, n, maxLength);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testMaximumChocolates() {
        int[][] matrix = {{2, 3, 1, 2},
                        {3, 4, 2, 2},
                        {5, 6, 3, 5}};
        int n = 3, m = 4;
        DPAlgo dpAlgo = new DPAlgo();
        Assertions.assertEquals(dpAlgo.maximumChocolates(n, m, matrix), 21);
    }

    @Test
    public void testWildcardMatching() {
        String S1 = "ab*cd";
        String S2 = "abdefcd";
        DPAlgo dpAlgo = new DPAlgo();
        Assertions.assertTrue(dpAlgo.wildcardMatching(S1, S2));
    }

    @Test
    public void testBurstBalloons() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(3, 1, 5, 8));
        DPAlgo dpAlgo = new DPAlgo();
        Assertions.assertEquals(dpAlgo.maxCoins(a), 167);
    }

    @Test
    public void testMaxSumAfterPartitioning() {
        int[] num = {1, 15, 7, 9, 2, 5, 10};
        int k = 3;
        DPAlgo dpAlgo = new DPAlgo();
        Assertions.assertEquals(dpAlgo.maxSumAfterPartitioning(num, 3), 84);
    }
}
