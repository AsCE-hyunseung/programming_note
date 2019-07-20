import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FunctionDev {
    public int[] solution(int[] progresses, int[] speeds) {
        int length = progresses.length;
        Queue<Integer> que = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();

        //남은 일 수 계산
        getWorkDay(progresses, speeds, length, que);

        //카운트 계산
        int cnt = getCnt(que, list);

        //카운트가 0이아닌 경우 추가
        if (cnt !=0){
            list.add(cnt);
        }
        int size = list.size();
        int answer[] = new int[size];

        for(int i=0; i<size; i++){
            answer[i] = list.get(i);
        }
        //System.out.println(Arrays.toString(answer));
        return answer;

    }

    private int getCnt(Queue<Integer> que, ArrayList<Integer> list) {
        int cnt=0;
        int target;

        //큐가 비어있지 않는동안
       while(!que.isEmpty()){
           //맨앞의 큐를 삭제 후 저장
            target = que.poll();
            cnt++;

            //그 다음 큐도 비어있으면 안되니깐
            while(!que.isEmpty()){
                //삭제 된 큐의 맨 앞 값 > 삭제 후 저장했던 큐 값
                if (que.peek() > target){
                    list.add(cnt);
                    cnt=0;
                    break;
                }else{
                    que.poll();
                    cnt++;
                }
            }
        }
        return cnt;
    }

    //남은 작업일 구하기
    private Queue getWorkDay(int[] progresses, int[] speeds, int length, Queue<Integer> que) {
        int date;
        int workDay;

        for (int i = 0; i<length; i++){
             date = 100 - progresses[i];
            if(date %speeds[i] != 0 ){
                workDay = date/speeds[i] + 1;

                System.out.println(workDay);
            }else {
                workDay = date/speeds[i];
                System.out.println(date/speeds[i]);
            }
            que.add(workDay);
        }
        return que;
    }

   /* public static void main(String[] args) {
        FunctionDev f = new FunctionDev();
        f.solution(new int[]{93,30,55}, new int[]{1,30,5});
    }*/
}
