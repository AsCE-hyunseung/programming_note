package practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution10Test {

    @Test
    public void solution() {
        Solution10 s = new Solution10();

        assertTrue("true",s.solution(10));
        assertTrue("true",s.solution(12));
        assertFalse("false",s.solution(11));
        assertFalse("false",s.solution(13));
    }
}
