package practice;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class Solution7Test {
    @Test
    public void 결과() {
        Solution7 solution = new Solution7();

        assertEquals("gfedcbZ", solution.solution("Zbcdefg"));

    }
}