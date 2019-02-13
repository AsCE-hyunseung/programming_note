package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution10 {
    /*[3,4,3,0,2,2,3,0,0]이면 4에게 보고할 수 있는 인원 5 리턴*/
    public int solution(int[] ranks) {
        // write your code in Java SE 8
        Arrays.sort(ranks);
        List<Integer> integerList = new ArrayList<>();
        int count = 0;

        for (int rank : ranks) {
            integerList.add(rank);
        }

        for (int rank : ranks) {
            if (integerList.contains(rank + 1)) {
                count = count + 1;
            }
        }
        return count;
    }
}


