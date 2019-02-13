package practice;


import org.junit.Test;

import static org.junit.Assert.*;

public class Solution10Test {

    @Test
    public void Test10() {
        Solution10 s = new Solution10();
        int[] ranks={3,4,3,0,2,2,3,0,0};
        int[] ranks2={4,4,3,3,1,0};
        int[] ranks3={4,2,0};
        int[] ranks4={5,4,3,2,2};

        assertEquals(5, s.solution(ranks));
        assertEquals(3, s.solution(ranks2));
        assertEquals(0, s.solution(ranks3));
        assertEquals(4, s.solution(ranks4));
    }


}
