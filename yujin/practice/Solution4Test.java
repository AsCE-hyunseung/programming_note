package practice;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution4Test {
    @Test
    public void 결과() {
        Solution4 solution = new Solution4();

        String[] strings={"sun","bed","car"};
        int n=1;
        String[] answer={"car","bed","sun"};
        assertArrayEquals(answer,solution.solution(strings,n));
    }
}  