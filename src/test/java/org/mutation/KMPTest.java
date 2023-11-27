package org.mutation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KMPTest {

    @Test
    public void testStrStr_WhenNeedleIsInHaystack_ReturnsCorrectIndex() {
        KMP kmp = new KMP();
        String haystack = "hello world";
        String needle = "world";
        int expectedIndex = 6;

        int result = kmp.strStr(haystack, needle);

        assertEquals(expectedIndex, result);
    }

    @Test
    public void testStrStr_WhenNeedleIsNotInHaystack_ReturnsMinusOne() {
        KMP kmp = new KMP();
        String haystack = "hello world";
        String needle = "universe";

        int result = kmp.strStr(haystack, needle);

        assertEquals(-1, result);
    }

    @Test
    public void testStrStr_WhenNeedleIsEmptyString_ReturnsZero() {

        KMP kmp = new KMP();
        String haystack = "hello world";
        String needle = "";

        int result = kmp.strStr(haystack, needle);

        assertEquals(0, result);
    }

    @Test
    public void testStrStr_WhenHaystackIsEmptyString_ReturnsMinusOne() {
        KMP kmp = new KMP();
        String haystack = "";
        String needle = "test";

        int result = kmp.strStr(haystack, needle);

        assertEquals(-1, result);
    }

    @Test
    public void testStrStr_WhenHaystackAndNeedleAreEmptyStrings_ReturnsZero() {
        KMP kmp = new KMP();
        String haystack = "";
        String needle = "";

        int result = kmp.strStr(haystack, needle);

        assertEquals(0, result);
    }
}
