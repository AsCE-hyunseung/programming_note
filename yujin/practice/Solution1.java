package practice;
public class Solution1 {
    // 가운데 글자 가져오기
    
    /*
    단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
    단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

    제한사항
    s는 길이가 1 이상, 100이하인 스트링입니다.
    입출력 예
    s	        return
    abcde	    c
    qwer	    we
    */

    // 1. 단어의 길이가 짝수인지 홀수인지 판별한다.
    // 2. 짝수라면 가운데 두글자를 return
    // 3. 홀수라면 가운데 한글자를 return

    // substring(start,end) - start인덱스에서 end인덱스 전까지


    public String solution(String s){

        if(s.length()%2==0)
            return s.substring(s.length()/2-1,s.length()/2+1);
        else
            return s.substring(s.length()/2,s.length()/2+1);

    }
}
