package org.mutation;

public class BitManipulationAlgo {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & n - 1) == 0;
    }
    public int countSetBits(int n)
    {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    public boolean isKthBitSet(int n, int k)
    {
        return (n & (1 << k)) != 0;
    }

    public int findXOR(int n)
    {
        int mod = n % 4;

        if (mod == 0)
            return n;

        else if (mod == 1)
            return 1;

        else if (mod == 2)
            return n + 1;

        else if (mod == 3)
            return 0;
        return 0;
    }

    public int findXOR(int l, int r)
    {
        return (findXOR(l - 1) ^ findXOR(r));
    }
}
