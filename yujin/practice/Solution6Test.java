package practice;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution6Test {
    @Test
    public void 결과() {
        Solution6 solution = new Solution6();
        int arr1[][]={{1,2},{2,3}};
        int arr2[][]={{3,4},{5,6}};
        int arr3[][]={{4,6},{7,9}};
        assertArrayEquals(arr3,solution.solution(arr1,arr2));

    }
}