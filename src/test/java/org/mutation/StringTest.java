package org.mutation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringTest {
    @Test
    public void anagramTests() {
        StringAlgo stringAlgo = new StringAlgo();
        Assertions.assertTrue(stringAlgo.isAnagram("abc", "abc"));
        Assertions.assertTrue(stringAlgo.isAnagram("", ""));
        Assertions.assertFalse(stringAlgo.isAnagram("abc", "abd"));
        Assertions.assertFalse(stringAlgo.isAnagram("abc", ""));
    }

    @Test
    public void stringMatchTests() {
        StringAlgo stringAlgo = new StringAlgo();
        Assertions.assertTrue(stringAlgo.stringSearch("ABDHBHNHDKSSD", "DKSS"));
        Assertions.assertTrue(stringAlgo.stringSearch("", ""));
        Assertions.assertFalse(stringAlgo.stringSearch("", "DKSS"));
        Assertions.assertTrue(stringAlgo.stringSearch("ABDHBHNHDKSSD", ""));
        Assertions.assertFalse(stringAlgo.stringSearch("ABDHBHNHDKSSD", "DKSSA"));
    }
}
