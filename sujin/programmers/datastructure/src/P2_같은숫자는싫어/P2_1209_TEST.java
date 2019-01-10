package P2_같은숫자는싫어;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class P2_1209_TEST {

    @Test
    public void test(){
        P2_1209 solution = new P2_1209();

        int[] arr = {1,1,3,3,0,1,1};
        int[] answer = {1,3,0,1};

        assertArrayEquals(answer,solution.solution(arr));
    }
}
