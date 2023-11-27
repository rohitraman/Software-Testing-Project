package org.mutation;

import java.util.*;

import static java.util.Arrays.binarySearch;

public class DPAlgo {
    public int climbingStairs(int n) {
        int prev2 = 1;
        int prev = 1;

        for(int i = 2; i <= n; i++){
            int cur_i = prev2 + prev;
            prev2 = prev;
            prev= cur_i;
        }
        return prev;
    }

    public int frogJumpWithDistanceK(int[] height, int k) {
        int n = height.length;
        if (n == 0) {
            return -1;
        }
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        for (int i = 1; i < n; i++) {
            int mmSteps = Integer.MAX_VALUE;

            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {
                    int jump = dp[i - j] + Math.abs(height[i] - height[i - j]);
                    mmSteps = Math.min(jump, mmSteps);
                }
            }
            dp[i] = mmSteps;
        }
        return dp[n - 1];
    }

    public int uniquePaths(int m, int n) {
        int[] prev = new int[n];

        for (int i = 0; i < m; i++) {
            int[] temp = new int[n];

            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    temp[j] = 1;
                    continue;
                }
                int up = 0;
                int left = 0;

                if (i > 0)
                    up = prev[j];
                if (j > 0)
                    left = temp[j - 1];
                temp[j] = up + left;
            }
            prev = temp;
        }
        return prev[n - 1];
    }

    public boolean subsetSumToK(int k, int[] arr) {
        int n = arr.length;
        if (n == 0) {
            return k == 0;
        }
        boolean[] prev = new boolean[k + 1];
        prev[0] = true;
        if (arr[0] <= k) {
            prev[arr[0]] = true;
        }

        for (int ind = 1; ind < n; ind++) {
            boolean[] cur = new boolean[k + 1];
            cur[0] = true;
            for (int target = 1; target <= k; target++) {
                boolean notTaken = prev[target];

                boolean taken = false;
                if (arr[ind] <= target) {
                    taken = prev[target - arr[ind]];
                }
                cur[target] = notTaken || taken;
            }
            prev = cur;
        }
        return prev[k];
    }
    public int editDistance(String S1, String S2) {
        int n = S1.length();
        int m = S2.length();

        int[] prev = new int[m + 1];
        int[] cur = new int[m + 1];

        for (int j = 0; j <= m; j++)
            prev[j] = j;
        for (int i = 1; i <= n; i++) {
            cur[0] = i;
            for (int j = 1; j <= m; j++) {
                if (S1.charAt(i - 1) == S2.charAt(j - 1)) {
                    cur[j] = prev[j - 1];
                } else {
                    cur[j] = 1 + Math.min(prev[j - 1], Math.min(prev[j], cur[j - 1]));
                }
            }
            prev = cur.clone();
        }
        return cur[m];
    }

    public int longestIncreasingSubsequence(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            return 0;
        }
        List<Integer> temp = new ArrayList<>();
        temp.add(arr[0]);

        int len = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] > temp.get(temp.size() - 1)) {

                temp.add(arr[i]);
                len++;
            } else {
                int ind = Collections.binarySearch(temp, arr[i]);

                if (ind < 0) {
                    ind = -ind - 1;
                }

                temp.set(ind, arr[i]);
            }
        }

        return len;
    }
    public int costOfCuts(int n, int c, ArrayList<Integer> cuts) {
        cuts.add(n);
        cuts.add(0);
        Collections.sort(cuts);
        int[][] dp = new int[c + 2][c + 2];
        for (int[] row : dp) {
            Arrays.fill(row, 0);
        }
        for (int i = c; i >= 1; i--) {
            for (int j = 1; j <= c; j++) {
                if (i > j) continue;
                int mini = Integer.MAX_VALUE;
                for (int ind = i; ind <= j; ind++) {
                    int ans = cuts.get(j + 1) - cuts.get(i - 1) + dp[i][ind - 1] + dp[ind + 1][j];
                    mini = Math.min(mini, ans);
                }
                dp[i][j] = mini;
            }
        }
        return dp[1][c];
    }

    // 0-1 Knapsack problem
    public static int knapsack(int[] weights, int[] values, int n, int maxWeight) {
        int[][] dp = new int[n+1][maxWeight+1];

        for(int i=1; i<=n; i++) {
            for(int j=0; j<=maxWeight; j++) {
                if(weights[i-1] <= j)
                    dp[i][j] = Math.max(values[i-1] + dp[i-1][j-weights[i-1]], dp[i-1][j]);
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][maxWeight];
    }

    // Rod cutting problem
    public static int rodCutting(int[] prices, int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;

        for(int i=1; i<=n; i++) {
            int max = Integer.MIN_VALUE;
            for(int j=0; j<i; j++)
                max = Math.max(max, prices[j] + dp[i-j-1]);
            dp[i] = max;
        }
        return dp[n];
    }

    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for(int i=0; i<=amount; i++) {
            for(int j=0; j<coins.length; j++) {
                if(coins[j] <= i)
                    dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
            }
        }
        return (dp[amount] > amount) ? -1 : dp[amount];
    }


    // Longest Common Subsequence
    public static int lcs(String s1, String s2) {
        int[][] dp = new int[s1.length()+1][s2.length()+1];

        for(int i=1; i<=s1.length(); i++){
            for(int j=1; j<=s2.length(); j++){
                if(s1.charAt(i-1) == s2.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i][j-1],  dp[i-1][j]);
            }
        }
        return dp[s1.length()][s2.length()];
    }



    // Subset Sum Problem
    public static boolean subsetSum(int[] arr, int sum){
        boolean[] dp = new boolean[sum+1];
        dp[0] = true;

        for(int i=0; i<arr.length; i++){
            for(int j=sum; j>=arr[i]; j--){
                dp[j] |= dp[j-arr[i]];
            }
        }
        return dp[sum];
    }

    // Partition Equal Subset Sum
    public static boolean canPartition(int[] arr) {
        int sum = 0;
        for (int i : arr)
            sum += i;

        if (sum % 2 != 0)
            return false;

        return subsetSum(arr, sum / 2);
    }

    // Maximum Ribbon Cut
    public static int maxRibbonCut(int[] ribbons, int n, int maxLength) {
        int[] dp = new int[maxLength+1];

        for(int i=0; i<n; i++) {
            for(int len=maxLength; len>=ribbons[i]; len--) {
                dp[len] = Math.max(dp[len], dp[len - ribbons[i]] + 1);
            }
        }
        return dp[maxLength];
    }

    // Maximum Sum Increasing Subsequence
    public static int maxSumIS(int arr[], int n) {
        int[] msis = new int[n];

        for (int i = 0; i < n; i++)
            msis[i] = arr[i];

        for (int i = 1; i < n; i++)
            for (int j = 0; j < i; j++)
                if (arr[i] > arr[j] && msis[i] < msis[j] + arr[i])
                    msis[i] = msis[j] + arr[i];

        return Arrays.stream(msis).max().getAsInt();
    }

    // Optimal Strategy for a Game
    public static int optimalStrategyOfGame(int arr[], int n) {
        int[][] table = new int[n][n];

        for(int gap = 0; gap < n; gap++)  {
            for(int i = 0, j = gap; j < n; i++,j++) {
                if (gap == 0)
                    table[i][j] = arr[i];
                else if (gap == 1)
                    table[i][j] = Math.max(arr[i], arr[j]);
                else {
                    int val1 = arr[i] + Math.min(table[i+2][j],
                            table[i+1][j-1]);

                    int val2 = arr[j] + Math.min(table[i+1][j-1],
                            table[i][j-2]);
                    table[i][j] = Math.max(val1, val2);
                }
            }
        }
        return table[0][n-1];
    }

    // Job Scheduling to Maximize Profit
    public static int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        int[][] jobs = new int[n][3];

        for(int i=0; i<n; i++){
            jobs[i] = new int[]{startTime[i], endTime[i], profit[i]};
        }

        //sorting according to endTime -
        Arrays.sort(jobs, (a,b)-> a[1] - b[1]);

        //storing( endTime,  maxProfit till this endTime);
        TreeMap<Integer, Integer> dp = new TreeMap<>();
        dp.put(0,0);

        for(int[] job : jobs){

            //calculating profit from curr job startTime and adding with
            //max profit of that of prev valid time schedule using floorEntry:
            int cur = dp.floorEntry(job[0]).getValue() + job[2];

            //if curr ie. current profit is max then maxProfit(lastEntry().getValue()) till now
            //then put cur endTme and profit - else skip :)
            if(cur > dp.lastEntry().getValue())
                dp.put(job[1],cur);
        }

        //as a result we have max profit at end of our DP .')
        return dp.lastEntry().getValue();
    }

    // Partition Problem (Number of ways to partition set)
    public static int partitionProblem(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        if (n >= 2) {
            for(int i=2; i<=n; i++)
                for(int j=1;j<=i;j++)
                    dp[i] += dp[j-1] * dp[i-j];
        }
        return dp[n];
    }

    // Word Break Problem
    public static boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        int max_len = 0;
        for (String word : wordDict) {
            max_len = Math.max(max_len, word.length());
        }

        for (int i = 1; i <= n; i++) {
            for (int j = i - 1; j >= Math.max(i - max_len - 1, 0); j--) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }

    public int maximumChocolates(int n, int m, int[][] grid) {
        int[][] front = new int[m][m];
        int[][] cur = new int[m][m];
        for (int j1 = 0; j1 < m; j1++) {
            for (int j2 = 0; j2 < m; j2++) {
                if (j1 == j2)
                    front[j1][j2] = grid[n - 1][j1];
                else
                    front[j1][j2] = grid[n - 1][j1] + grid[n - 1][j2];
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j1 = 0; j1 < m; j1++) {
                for (int j2 = 0; j2 < m; j2++) {
                    int maxi = Integer.MIN_VALUE;
                    for (int di = -1; di <= 1; di++) {
                        for (int dj = -1; dj <= 1; dj++) {
                            int ans;

                            if (j1 == j2)
                                ans = grid[i][j1];
                            else
                                ans = grid[i][j1] + grid[i][j2];

                            if ((j1 + di < 0 || j1 + di >= m) || (j2 + dj < 0 || j2 + dj >= m))
                                ans += (int) Math.pow(-10, 9);
                            else
                                ans += front[j1 + di][j2 + dj];

                            maxi = Math.max(ans, maxi);
                        }
                    }
                    cur[j1][j2] = maxi;
                }
            }
            for (int a = 0; a < m; a++) {
                front[a] = cur[a].clone();
            }
        }
        return front[0][m - 1];
    }

    // Helper function to check if all characters from index 1 to i in S1 are '*'
    public boolean isAllStars(String S1, int i) {
        for (int j = 1; j <= i; j++) {
            if (S1.charAt(j - 1) != '*')
                return false;
        }
        return true;
    }

    public boolean wildcardMatching(String S1, String S2) {
        int n = S1.length();
        int m = S2.length();

        // Create two boolean arrays to store the matching results for the current and previous rows
        boolean[] prev = new boolean[m + 1];
        boolean[] cur = new boolean[m + 1];

        // Initialize the first element of prev as true
        prev[0] = true;

        // Iterate through S1 and S2 to fill the cur array
        for (int i = 1; i <= n; i++) {
            // Initialize the first element of cur based on whether S1 contains '*'
            cur[0] = isAllStars(S1, i);
            for (int j = 1; j <= m; j++) {
                if (S1.charAt(i - 1) == S2.charAt(j - 1) || S1.charAt(i - 1) == '?') {
                    cur[j] = prev[j - 1]; // Characters match or '?' is encountered.
                } else {
                    if (S1.charAt(i - 1) == '*') {
                        cur[j] = prev[j] || cur[j - 1]; // '*' matches one or more characters.
                    } else {
                        cur[j] = false; // Characters don't match, and S1[i-1] is not '*'.
                    }
                }
            }
            // Update prev array to store the current values
            prev = cur.clone();
        }

        return prev[m]; // The final result indicates whether S1 matches S2.
    }

    public int maxCoins(ArrayList<Integer> a) {
        int n = a.size();

        // Add 1 to the beginning and end of the array
        a.add(0, 1);
        a.add(1);

        // Create a 2D DP array
        int[][] dp = new int[n + 2][n + 2];

        // Iterate from the end to the beginning
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                if (i > j) continue;
                int maxi = Integer.MIN_VALUE;

                // Iterate through possible indices to split the array
                for (int ind = i; ind <= j; ind++) {
                    int cost = a.get(i - 1) * a.get(ind) * a.get(j + 1) +
                            dp[i][ind - 1] + dp[ind + 1][j];
                    maxi = Math.max(maxi, cost);
                }
                dp[i][j] = maxi;
            }
        }
        return dp[1][n];
    }

    public int maxSumAfterPartitioning(int[] num, int k) {
        int n = num.length;
        int[] dp = new int[n + 1];

        // Traverse the input array from right to left
        for (int ind = n - 1; ind >= 0; ind--) {
            int len = 0;
            int maxi = Integer.MIN_VALUE;
            int maxAns = Integer.MIN_VALUE;

            // Iterate through the next 'k' elements or remaining elements if less than 'k'.
            for (int j = ind; j < Math.min(ind + k, n); j++) {
                len++;
                maxi = Math.max(maxi, num[j]);
                int sum = len * maxi + dp[j + 1];
                maxAns = Math.max(maxAns, sum);
            }
            dp[ind] = maxAns;
        }
        return dp[0];
    }
}
