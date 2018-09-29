// 문제 설명
// Finn은 요즘 수학공부에 빠져 있습니다. 수학 공부를 하던 Finn은 자연수 n을 연속한 자연수들로 표현 하는 방법이 여러개라는 사실을 알게 되었습니다. 
//예를들어 15는 다음과 같이 4가지로 표현 할 수 있습니다.

// 1 + 2 + 3 + 4 + 5 = 15
// 4 + 5 + 6 = 15
// 7 + 8 = 15
// 15 = 15
// 자연수 n이 매개변수로 주어질 때, 연속된 자연수들로 n을 표현하는 방법의 수를 return하는 solution를 완성해주세요.

// 제한사항
// n은 10,000 이하의 자연수 입니다.

package qwer;

public class NumberExp {
    public int solution(int n) {
        int answer = 1;//자기 자신 표현
        int range=n/2+1;//n/2+1까지가 범위이다.ex)15=7+8
        int sum=0;

        for(int i=1;i<range;i++)
        {
            sum=i;
            for(int j=i+1;j<=range, sum+=j;j++)
            {
                if(sum>=n){//크거나 같으면 일단 반복문을 break한다.
                    break;
                }
            }
            if(sum==n){//만약 n과 더해진 sum이 같으면 answer을 카운트해준다.
                answer++;
            }
        }
        return answer;
    }
}