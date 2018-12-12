package practice;
import java.util.*;
public class Solution2 {
  /*
    K번째 수 ( 하드코딩 버전 )
    배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.

    예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
    array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
    1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
    2에서 나온 배열의 3번째 숫자는 5입니다.

    배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때,
    commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록
    solution 함수를 작성해주세요.
*/
    public int[] solution(int[] array, int[][] commands){

        // 헤멘 이유 1 : substring 사용 안됨 String이 아니라서. 배열을 원하는 만큼 자르기 위해서는 copyOfRange 사용
        // 헤멘 이유 2 : copyOfRange의 마지막 인자는 포함하는거 아님

        // 0. answer의 배열 길이 설정해주기
        // 1.array를 자른다. 자르는 시작값 : commands[0][0]-1 종료값 : commands[0][1]
        // 2. 자른 array를 sort를 이용하여 정렬한다.
        // 3. 정렬된 array 중 commands[0][2]-1 값을 뽑아낸다
        // commands 시작값 에서 1 빼는 이유 : 배열의 인덱스는 0부터 시작하기 때문에

        int[] answer = new int[commands.length];
        int[] middle = {};

        for (int i=0; i<commands.length; i++){
            middle = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
            Arrays.sort(middle);
            answer[i] = middle[commands[i][2]-1];
        }
       return answer;
    }
}