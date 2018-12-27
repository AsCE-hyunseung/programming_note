// 문제

// - 한 문자열에 들어있는 단어의 순서를 뒤집는 함수를 작성하라. 예를 들어 "Do or do not. there is no try." 는 
//"try. no is there not. do or Do" 로 변환되어야 한다. 모든 단어는 스페이스로 구분되고 문장부호를 글자와 똑같은 것으로 간주한다.

public class ReverseWord {
    String solution(String str){
        String answer="";
        String []splitWord=str.split(" ");//공백 기준으로 단어 자르기
 
        answer = getAnswer(answer, splitWord);
 
        return answer.substring(0,answer.length()-1);//맨 뒤의 공백 제거
    }
    //자른 단어를 역순으로 이어붙이는 메소드
    private String getAnswer(String answer, String[] splitWord) {
        for(int i=splitWord.length-1;i>=0;i--){//역순
            answer=answer.concat(splitWord[i]+" ");
        }
        return answer;
    }
}
