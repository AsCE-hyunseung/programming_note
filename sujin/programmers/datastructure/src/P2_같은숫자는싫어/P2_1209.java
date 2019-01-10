package P2_같은숫자는싫어;

import java.util.ArrayList;
import java.util.List;

public class P2_1209 {

    public static int[] solution(int[] arr){
        List<Integer> list = new ArrayList<>();
        int tmp = -1; // 0~9가 아닌 다른 수로 초기화

        for(int arryNum : arr){ // 중복값 제거
            if(tmp==arryNum) continue;
            else{
                list.add(arryNum); // 중복되지 않은 값 list에 추가
                tmp=arryNum; // 비교값 변경
            }
        }

        int[] answer= new int[list.size()];
        int length = answer.length;

        for(int i=0;i<length;i++){
            answer[i] = list.get(i);
        }

        return answer;
    }

}
