package practice;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution3Test {

    @Test
    public void 결과() {
        Solution3 solution = new Solution3();

        int[] arr = {5,9,7,10};
        int divisor = 5;
        int[] answer = {5,10};

        int[] arr2 = {5,9,7,10};
        int divisor2 = 5;
        int[] answer2 = {5,10};

        int[] arr3 = {5,9,7,10};
        int divisor3 = 5;
        int[] answer3 = {5,10};

        assertArrayEquals(answer,solution.solution(arr,divisor));
        assertArrayEquals(answer2,solution.solution(arr2,divisor2));
        assertArrayEquals(answer3,solution.solution(arr3,divisor3));
    }
}
