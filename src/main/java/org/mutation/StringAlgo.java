package org.mutation;

import java.util.Arrays;

public class StringAlgo {
    public boolean stringSearch(String s, String p) {
        int sLen = s.length();
        int pLen = p.length();
        boolean found = false;
        int i;
        for (i = 0; i < sLen - pLen + 1; i++) {
            int j = 0;
            for (; j < pLen; j++) {
                if (s.charAt(i + j) != p.charAt(j))
                    break;
            }
            if (j == pLen) {
                found = true;
                break;
            }
        }
        if (found) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);
        if (Arrays.equals(sChars, tChars)) {
            return true;
        }
        return false;
    }
}
