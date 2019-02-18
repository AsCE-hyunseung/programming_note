package practice;

public class Solution10 {
    /*
    * 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
    * 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
    * 자연수 n을 입력받아 n이 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
    *
    *   arr	    return
        10	    true
        12	    true
        11	    false
        13	    false

        1. int 형을 string 문자열로 변환
        2. 각 자릿수의 합을 구하기
        3. 합으로 주어진 숫자를 나누어준다.
    */

    public boolean solution(int x) {
        int sum = 0;
        boolean answer = true;

        String num = String.valueOf(x);
        int len = num.length();

        sum = getSum(sum, num, len);

        return isAnswer(x, sum, answer);
    }

    private boolean isAnswer(int x, int sum, boolean answer) {
        if (x % sum == 0) {
            return answer;
        }
        else {
            answer = false;
            return answer;
        }
    }

    private int getSum(int sum, String num, int len) {
        for (int i = 0; i < len; i++) {
            sum += Integer.parseInt(num.substring(i,i+1));
        }
        return sum;
    }
}


