package practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution7Test {

    @Test
    public void 결과() {
        Solution7 solution = new Solution7();
        String s="Zbcdefg";
        String answer = "gfedcbZ";

        assertEquals(answer,solution.solution(s));
    }
}
