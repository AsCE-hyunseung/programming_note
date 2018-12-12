package practice;

import java.util.Arrays;

public class Solution3 {
    // 나누어 떨어지는 숫자 배열

    /*
    array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
    divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

    arr	            divisor	        return
    [5, 9, 7, 10]	5	            [5, 10]
    [2, 36, 1, 3]	1	            [1, 2, 3, 36]
    [3,2,6]	        10	            [-1]

    */
    public int[] solution(int[] arr, int divisor){
        int j=0;

        for(int i=0;i<arr.length;i++){
            if (arr[i]%divisor==0){
                j=j+1;
            }
        }

        int[] answer = new int[j];

        // 나누어 떨어지는 경우가 없을때 -1 반환 예외처리
        // JUnit을 사용해서 테스트시에는 오류가 발생하지 않지만
        // 프로그래머스에선 오류가 발생하여 추가
        if(j==0){
            answer = new int[]{-1};
        }
        j=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]%divisor==0){
                answer[j]=arr[i];
                j++;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}