package practice;

public class Solution9 {
    /* <서울에서 김서방 찾기>
    String형 배열 seoul의 element중 Kim의 위치 x를 찾아, 김서방은 x에 있다는 String을 반환하는 함수, solution을 완성하세요.
    seoul에 Kim은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.

    seoul	        return
    [Jane, Kim]	    김서방은 1에 있다
    1. 배열에서 Kim이라는 값을 가진 것의 배열 순서를 센다.
    */
    public String solution(String[] seoul) {
        int len =seoul.length;
        int i;

        i = isAnswer(seoul, len);

        return "김서방은 "+i+"에 있다";
    }

    private int isAnswer(String[] seoul, int len) {
        int i;
        for (i=0; i<len; i++){
            if (seoul[i].equals("Kim")){
                break;
            }
        }
        return i;
    }

}
