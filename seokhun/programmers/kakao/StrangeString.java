/*이상한 문자 만들기
문제 설명
문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수,
solution을 완성하세요.

제한 사항
문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
입출력 예
s	return
try hello world	TrY HeLlO WoRlD
입출력 예 설명
try hello world는 세 단어 try, hello, world로 구성되어 있습니다.
 각 단어의 짝수번째 문자를 대문자로,
 홀수번째 문자를 소문자로 바꾸면 TrY, HeLlO, WoRlD입니다.
 따라서 TrY HeLlO WoRlD 를 리턴합니다.


 공백 갯수까지 파악해서 해야하는 줄 알앗으나
 알고보니 공백은 상관이 없음 단순히 구분하는 용도*/
public class StrangeString {
    public String solution(String str) {
        String answer = "";
        int count = 0;
        int length = str.length();
        String[] arr = str.split("");
        answer = countSpace(answer, count, length, arr);
        return answer;
    }

    private String countSpace(String answer, int count, int length, String[] arr) {
        boolean judge = false;
        for (int i = 0; i < length; i++) {
            if (arr[i].equals(" ")) {
                judge = false;
                count = 0;
            } else {
                judge = true;
                count++;
                if (count % 2 != 0) {
                    arr[i] = arr[i].toUpperCase();
                } else {
                    arr[i] = arr[i].toLowerCase();
                }
            }
            answer = answer + arr[i];
        }
        return answer;
    }

   /* public static void main(String[] args) {
        StrangeString s = new StrangeString();
        String str = "  try hello world";
        System.out.println(s.solution(str));
    }*/
}
