package practice;

import org.junit.Test;
import static org.junit.Assert.*;

public class Solution5Test {

    @Test
    public void solution() {
        Solution5 s = new Solution5();
        assertTrue("true",s.solution("pPoooyY"));
        assertFalse("false",s.solution("pPoooY"));
    }
}