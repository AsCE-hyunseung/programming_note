package practice;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution4Test {
    @Test
    public void 결과() {
        Solution8 s = new Solution8();
        assertTrue("true",s.solution("1234"));
        assertFalse("false",s.solution("a123"));
    }
}