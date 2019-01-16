package practice;
import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.sort;

public class Solution7 {
    /*
    <문자열 내림차순으로 배치하기>
    문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해
    새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
    s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

    s	        return
    Zbcdefg	    gfedcbZ
    1. 대문자와 소문자 분리 -> 분리할 필요 없음
    2. 대문자와 소문자 각각 오름차순 정렬 -> sort이용
    3. reverse이용하여 뒤집은 후 대문자, 소문자 이어서 연결하기기
   */
    public String solution(String s) {
        String answer = "";
        // String 형을 배열에 어떻게 집어넣을지 몰라서
        // 문제가 길어졌는데 split에 대해서 배웠다.

        String[] arr = s.split("");
        sort(arr);

        // reverse함수가 있다는것을 알았지만 list형 변환법을
        // 모르고 있어서 식이 길어졌지만 배우게 되었다.
        Collections.reverse(Arrays.asList(arr));

        answer = String.join("",arr);
        return answer;

    }
}
