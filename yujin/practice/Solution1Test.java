package practice;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution1Test {


    @Test
    public void 결과() {
        Solution1 solution = new Solution1();

        assertEquals("c", solution.solution("abcde"));
        assertEquals("we", solution.solution("qwer"));

    }

}