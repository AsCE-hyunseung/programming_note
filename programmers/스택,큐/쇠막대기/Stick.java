import java.util.Stack;
 
public class Stick {
    public int solution(String arrangement) {
        int answer = 0;
        char []pipe=arrangement.toCharArray();
 
        Stack<Character>lazer=new Stack<>();
 
        return getPipeNumber(answer, pipe, lazer);
    }
 
    //잘려진 파이프 조각 갯수세는 메소드
    public int getPipeNumber(int answer, char[] pipe, Stack<Character> lazer) {
        for(int i=0;i<pipe.length;i++){
            if(pipe[i]=='('){//열린 괄호는 스택에 push
                lazer.push(pipe[i]);
            }
            else{
                lazer.pop();
                if(pipe[i-1]=='('){//레이저일 경우
                    answer+=lazer.size();
                }
                else{//파이프의 끝일경우
                    answer++;
                }
            }
        }
        return answer;
    }
}