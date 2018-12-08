package 프로그래머스.K번째수;
// k번째 수
//배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.

//예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
//array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
//1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
//2에서 나온 배열의 원하는 3번째 숫자는 5입니다.
//배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.

import java.util.Arrays;

public class P1208 {

    public int[] solution(int[] array, int[][] commands){
        int length = commands.length;
        int[] answer = new int[length];
        int[] tmp= {0};

        for(int i=0;i<length;i++){
            tmp = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]); //배열잘라서 저장
            Arrays.sort(tmp); //정렬
            answer[i]=tmp[commands[i][2]-1]; //인덱스는 0부터 시작하기 때문에 -1
        }
        return answer;
    }
}
