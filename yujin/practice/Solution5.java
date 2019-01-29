package practice;

public class Solution5 {

    /*
    
    대문자와 소문자가 섞여있는 문자열 s가 주어집니다.
    s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True,
    다르면 False를 return 하는 solution를 완성하세요.
    'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다.
    단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
    예를들어 s가 pPoooyY면 true를 return하고 Pyy라면 false를 return합니다.
    */
    boolean solution(String s) {
        boolean answer = true;
        int len = s.length();
        int p=0;
        int y=0;
        s=s.toUpperCase();

        answer = findAnswer(s, answer, len, p, y);
        return answer;
    }

    public boolean findAnswer(String s, boolean answer, int len, int p, int y) {
        for(int i=0;i<len;i++){
            if (s.charAt(i)=='P'){
                p++;
            }
            if (s.charAt(i)=='Y') {
                y++;
            }
        }
        if (p!=y){
            answer=false;
        }
        return answer;
    }
}

