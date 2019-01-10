import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution8Test {
    Solution8 s = new Solution8();
    int[] arr = {1, 5, 2, 6, 3, 7, 4};
    int[][] com = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
    int[] result = {5, 6, 3};

    @Test
    public void solution() {
        assertArrayEquals(result, s.solution(arr, com));
    }
}