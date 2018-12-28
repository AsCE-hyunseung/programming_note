package practice;

public class Solution6 {
    /*
    <행렬의 덧셈>
    행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행,
    같은 열의 값을 서로 더한 결과가 됩니다.
    2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.

    1. 정답 배열의 길이 정해주기
    2. for문을 사용해서 각 수를 더해준다
    */

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        int len1=arr1.length;
        int len2=arr1[0].length;

        for(int i=0;i<len1;i++){
            for(int j=0;j<len2;j++){
                answer[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        return answer;
    }
}
