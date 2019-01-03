package practice;

import java.util.Arrays;

public class Solution4 {
    /*
    문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때,
    각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
    예를 들어 strings가 [sun, bed, car]이고 n이 1이면
    각 단어의 인덱스 1의 문자 u, e, a로 strings를 정렬합니다.

    < 제한 조건 >
    strings는 길이 1 이상, 50이하인 배열입니다.
    strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
    strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
    모든 strings의 원소의 길이는 n보다 큽니다.
    인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.

    입출력 예
    strings                 n	    return
    [sun, bed, car]         1	    [car, bed, sun]
    [abce, abcd, cdx]       2	    [abcd, abce, cdx]

    1. 각배열의 n추출
    2. 배열의 n추출한 것으로 단어 정렬법 생각
        2-1. n추출한것을 단어 앞에 가져다 붙여서 정렬하기
    3. 가져다 붙여서 정렬된 것들 앞에 붙인것 다시 떼주기
    */

    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        int len = strings.length;

        // length 코드리뷰 당한것 적용
        for(int i=0;i<len;i++){
            // substring 자르는 인덱스 관리에 주의 n,n쓰면 망한다
            // 배웠던 것 다시 생각
            answer[i] = strings[i].substring(n,n+1)+strings[i];
        }

        Arrays.sort(answer);

        for(int i=0;i<len;i++){
            // substring에 시작 인덱스만 정해줄 경우는 시작인덱스부터 뒤까지 모두 추출
            answer[i] = answer[i].substring(1);
        }

        return answer;   
    }
}