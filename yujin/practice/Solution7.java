package practice;
import java.util.Arrays;

public class Solution7 {
    /*
    <문자열 내림차순으로 배치하기>
    문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해
    새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
    s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

    s	        return
    Zbcdefg	    gfedcbZ

    1. 대문자와 소문자 분리
    2. 대문자와 소문자 각각 오름차순 정렬 -> sort이용
    3. reverse이용하여 뒤집은 후 대문자, 소문자 이어서 연결하기기

   */
    public String solution(String s) {
        String answer = "";
        int count=0;
        int count2=0;
        int len = s.length();


        for(int i=0;i<len;i++){
            if (s.charAt(i)<=132){
                count++;
            }
            else {
                count2++;
            }
        }
        char a[] = new char[count];
        char b[] = new char[count2];

        count=0;
        count2=0;

        for(int i=0;i<len;i++){
            if (s.charAt(i)<=132){
                a[count]=s.charAt(i);
                count++;
            }
            else {
                b[count2]=s.charAt(i);
                count2++;
            }
        }

        Arrays.sort(a);
        Arrays.sort(b);

        String str1 = String.valueOf(a);
        String str2 = String.valueOf(b);

        answer=str1+str2;
        return (new StringBuffer(answer)).reverse().toString();
    }
}