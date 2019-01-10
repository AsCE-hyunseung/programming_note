package K번째수;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class P1208_Test {

    @Test
    public void main(){

        P1208 solution = new P1208();

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3},{4,4,1}};
        int[] result = {5,6};

        assertArrayEquals(result,solution.solution(array,commands));
    }

}
