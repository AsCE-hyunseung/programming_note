package practice;
import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.sort;

public class Solution8 {
    /*
    <문자열 다루기 기본>
    문자열 s의 길이가 4혹은 6이고, 숫자로만 구성되있는지 확인해주는 함수, solution을 완성하세요.
    예를들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.
   */
    class Solution {
        public boolean solution(String s) {
            boolean answer = true;
            answer = isAnswer(s, answer);
            return answer;
        }
    }

    private boolean isAnswer(String s, boolean answer) {
        if(s.length() == 4 || s.length()==6) {
            for (int i = 0; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i))==false) {
                    answer = false;
                    break;
                }else {
                    answer = true;
                }
            }
        }else{
            answer = false;
        }
        return answer;
    }
}
