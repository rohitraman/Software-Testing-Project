package org.mutation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BitManipulationTest {
    @Test
    public void powerOf2Tests() {
        BitManipulationAlgo bitManipulationAlgo = new BitManipulationAlgo();
        Assertions.assertTrue(bitManipulationAlgo.isPowerOfTwo(16));
        Assertions.assertTrue(bitManipulationAlgo.isPowerOfTwo(1));
        Assertions.assertFalse(bitManipulationAlgo.isPowerOfTwo(0));
        Assertions.assertFalse(bitManipulationAlgo.isPowerOfTwo(10));
    }

    @Test
    public void countSetBitsTests() {
        BitManipulationAlgo bitManipulationAlgo = new BitManipulationAlgo();
        Assertions.assertEquals(bitManipulationAlgo.countSetBits(10), 2);
        Assertions.assertEquals(bitManipulationAlgo.countSetBits(15), 4);
        Assertions.assertEquals(bitManipulationAlgo.countSetBits(0), 0);
        Assertions.assertEquals(bitManipulationAlgo.countSetBits(63), 6);
    }

    @Test
    public void kthBitSetTests() {
        BitManipulationAlgo bitManipulationAlgo = new BitManipulationAlgo();
        Assertions.assertTrue(bitManipulationAlgo.isKthBitSet(10, 1));
        Assertions.assertFalse(bitManipulationAlgo.isKthBitSet(10, 0));
        Assertions.assertFalse(bitManipulationAlgo.isKthBitSet(1, 3));
        Assertions.assertFalse(bitManipulationAlgo.isKthBitSet(0, 3));
    }

    @Test
    public void xorFromLeftToRight() {
        BitManipulationAlgo bitManipulationAlgo = new BitManipulationAlgo();
        Assertions.assertEquals(bitManipulationAlgo.findXOR(3,6), 4);
        Assertions.assertEquals(bitManipulationAlgo.findXOR(5,7), 4);
        Assertions.assertEquals(bitManipulationAlgo.findXOR(4,9), 1);
        Assertions.assertEquals(bitManipulationAlgo.findXOR(1,9), 1);
    }
}
