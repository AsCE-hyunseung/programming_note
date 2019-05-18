package practice;

import org.junit.Test;
import static org.junit.Assert.*;

public class Solution11Test {
    @Test
    public void solution() {

        Solution11 solution11 = new Solution11();

        assertEquals(solution11.solution("01033334444"),"*******4444");
        assertEquals(solution11.solution("027778888"),"*****8888");
    }
}
