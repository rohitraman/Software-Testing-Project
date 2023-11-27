package org.mutation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringMatchTest {

    @Test
    public void testRepeatedStringMatchBasicCase() {
        StringMatch matcher = new StringMatch();
        String a = "abcd";
        String b = "cdabcdab";
        int expected = 3; // Expected result for a basic scenario

        int result = matcher.repeatedStringMatch(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void testRepeatedStringMatchEmptyStrings() {
        StringMatch matcher = new StringMatch();
        String a = "";
        String b = "";
        int expected = -1; // Expected result for both strings being empty

        int result = matcher.repeatedStringMatch(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void testRepeatedStringMatchOneEmptyString() {
        StringMatch matcher = new StringMatch();
        String a = "abc";
        String b = "";
        int expected = -1; // Expected result for one empty string

        int result = matcher.repeatedStringMatch(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void testRepeatedStringMatchNoMatch() {
        StringMatch matcher = new StringMatch();
        String a = "abcd";
        String b = "ef";
        int expected = -1; // Expected result when there's no match

        int result = matcher.repeatedStringMatch(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void testRepeatedStringMatchRepeated() {
        StringMatch matcher = new StringMatch();
        String a = "abc";
        String b = "abcabc";
        int expected = 2; // Expected result for repeated string

        int result = matcher.repeatedStringMatch(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void testRepeatedStringMatch_PositiveCase() {
        StringMatch matcher = new StringMatch();
        String a = "abc";
        String b = "abcabcabcabc";

        int expected = 4;
        int result = matcher.repeatedStringMatch(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void testRepeatedStringMatch_NegativeCase() {
        StringMatch matcher = new StringMatch();
        String a = "xyz";
        String b = "abcd";

        int expected = -1;
        int result = matcher.repeatedStringMatch(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void testRepeatedStringMatch_SameStrings() {
        StringMatch matcher = new StringMatch();
        String a = "hello";
        String b = "hello";

        int expected = 1;
        int result = matcher.repeatedStringMatch(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void testRepeatedStringMatch_EmptyString() {
        StringMatch matcher = new StringMatch();
        String a = "";
        String b = "test";

        int expected = -1;
        int result = matcher.repeatedStringMatch(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void testRepeatedStringMatch_BigStrings() {
        StringMatch matcher = new StringMatch();
        String a = "abc";
        String b = "abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabc";

        int expected = 19;
        int result = matcher.repeatedStringMatch(a, b);

        assertEquals(expected, result);
    }
}
