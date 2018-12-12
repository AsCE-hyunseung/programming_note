package practice;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution2Test {

    @Test
    public void 결과() {
        Solution2 solution = new Solution2();

        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        int[] Return = {5,6,3};
        assertArrayEquals(Return,solution.solution(array,commands));
    }
}
