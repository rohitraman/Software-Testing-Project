package org.mutation;

import java.util.HashSet;
import java.util.Set;

public class SlidingWindowAlgo {
    public int longestSSWithNoRepeatingCharacters(String str) {
        if(str.isEmpty())
            return 0;
        int maxans = Integer.MIN_VALUE;
        for (int i = 0; i < str.length(); i++) // outer loop for traversing the string
        {
            Set<Character> se = new HashSet<>();
            for (int j = i; j < str.length(); j++)
            {
                if (se.contains(str.charAt(j)))
                {
                    maxans = Math.max(maxans, j - i);
                    break;
                }
                se.add(str.charAt(j));
            }
        }
        return maxans == Integer.MIN_VALUE ? str.length() : maxans;
    }

    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int largestCount = 0, beg = 0, maxlen = 0;
        for(int end = 0; end < s.length(); end ++){
            int i = arr[s.charAt(end) - 'A'];
            i++;
            largestCount = Math.max(largestCount, i);
            
            if(end - beg + 1 - largestCount > k) {
                arr[s.charAt(beg) - 'A']--;
                beg ++;
            }
            maxlen = Math.max(maxlen, end - beg + 1);
        }
        return maxlen;
    }

    public int numberOfSubstrings(String s) {
        if(s.length() <= 3){
            if(s.length() == 3 && s.contains("a") && s.contains("b") && s.contains("c")){
                return 1;
            }
            return 0;
        }
        int start = 0;
        int end = 2;
        int count = 0;
        while(end < s.length()){
            String temp = s.substring(start,end+1);
            while(start <= end && end - start >= 2 && temp.contains("a") && temp.contains("b") && temp.contains("c")){
                count += 1 + s.length() - (end+1);
                start++;
                temp = s.substring(start, end+1);
            }
            end++;
        }
        return count;
    }

    public int longestOnes(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int zeros = 0;

        while(end < nums.length){
            if(nums[end] == 0){
                zeros++;
            }
            end++;
            if(zeros > k){
                if(nums[start] == 0){
                    zeros--;
                }
                start++;
            }
        }
        return end - start;
    }
}
