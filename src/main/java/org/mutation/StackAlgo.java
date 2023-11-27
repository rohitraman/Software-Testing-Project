package org.mutation;

import java.util.Stack;

public class StackAlgo {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack< >();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums[i]) {
                st.pop();
            }

            if (i < n) {
                if (!st.isEmpty()) nge[i] = st.peek();
                else nge[i] = -1;
            }

            st.push(nums[i]);
        }
        return nge;
    }
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> s = new Stack<>();
        for (int asteroid : asteroids) {
            if (asteroid > 0 || s.isEmpty()) {
                s.push(asteroid);
            } else {
                while (!s.isEmpty() && s.peek() > 0 && s.peek() < Math.abs(asteroid)) {
                    s.pop();
                }
                if (!s.isEmpty() && s.peek() == Math.abs(asteroid)) {
                    s.pop();
                } else {
                    if (s.isEmpty() || s.peek() < 0) {
                        s.push(asteroid);
                    }
                }
            }
        }
        int[] res = new int[s.size()];
        for (int i = s.size() - 1; i >= 0; i--) {
            res[i] = s.pop();
        }
        return res;
    }

    public long subArrayRanges(int[] A) {
        long res = 0;
        for (int i = 0; i < A.length; i++) {
            int max = A[i], min = A[i];
            for (int j = i; j < A.length; j++) {
                max = Math.max(max, A[j]);
                min = Math.min(min, A[j]);
                res += max - min;
            }
        }
        return res;
    }

    public String removeKDigits(String num, int k) {
        int len = num.length();
        if(k == len)
            return "0";

        Stack<Character> stack = new Stack<>();
        int i =0;
        while(i < num.length()){
            while(k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(i)){
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
            i++;
        }

        while(k > 0){
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty())
            sb.append(stack.pop());
        sb.reverse();

        while(sb.length() > 1 && sb.charAt(0) == '0')
            sb.deleteCharAt(0);
        return sb.toString();
    }

    public int largestRectangleArea(int[] heights) {
        if (heights.length == 0) {
            return 0;
        }
        int maxarea = Integer.MIN_VALUE;
        int[] nsl = new int[heights.length];
        int[] nsr = new int[heights.length];
        Stack<Integer> s = new Stack<>();
        for(int i = heights.length-1; i >= 0; i--){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if (s.isEmpty()){
                nsr[i] = heights.length;
            } else{
                nsr[i]= s.peek();
            }
            s.push(i);
        }
        s = new Stack<>();
        for(int i = 0; i < heights.length; i++){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if (s.isEmpty()){
                nsl[i]= -1;
            } else {
                nsl[i]= s.peek();
            }
            s.push(i);
        }

        for(int i=0; i < heights.length; i++){
            int height = heights[i];
            int width = nsr[i] - nsl[i] - 1;
            int currarea = height * width;
            maxarea = Math.max(currarea, maxarea);
        }
        return maxarea;
    }
}
