package org.mutation;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeIntervalsTest {

    @Test
    public void testMergeOverlappingIntervals() {
        // Test case 1: Regular intervals
        int[][] intervals1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        List<List<Integer>> expected1 = Arrays.asList(
                Arrays.asList(1, 6),
                Arrays.asList(8, 10),
                Arrays.asList(15, 18)
        );
        assertEquals(expected1, MergeIntervals.mergeOverlappingIntervals(intervals1));

        // Test case 2: Overlapping intervals
        int[][] intervals2 = {{1, 4}, {4, 5}};
        List<List<Integer>> expected2 = Arrays.asList(
                Arrays.asList(1, 5)
        );
        assertEquals(expected2, MergeIntervals.mergeOverlappingIntervals(intervals2));

        // Test case 3: Empty intervals
        int[][] intervals3 = {};
        List<List<Integer>> expected3 = Arrays.asList();
        assertEquals(expected3, MergeIntervals.mergeOverlappingIntervals(intervals3));

        // Test case 4: Single interval
        int[][] intervals4 = {{1, 3}};
        List<List<Integer>> expected4 = Arrays.asList(
                Arrays.asList(1, 3)
        );
        assertEquals(expected4, MergeIntervals.mergeOverlappingIntervals(intervals4));

        // Test case 5: No overlap in intervals
        int[][] intervals5 = {{1, 2}, {3, 4}, {5, 6}};
        List<List<Integer>> expected5 = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6)
        );
        assertEquals(expected5, MergeIntervals.mergeOverlappingIntervals(intervals5));
    }
}
