package practice;

import org.junit.Test;
import static org.junit.Assert.*;

public class Solution8Test {
    @Test
    public void Solution() {
        Solution8 s = new Solution8();
        assertTrue("true",s.solution("1234"));
        assertFalse("false",s.solution("a234"));
    }
}