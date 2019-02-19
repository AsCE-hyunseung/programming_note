package P7_완주하지못한선수;

import java.util.HashMap;
import java.util.Map;

public class P7_0219 {

    private void insertPart(String[] participant, Map<String,Integer> runnerHash){
        for (String runner:participant) {
            if(runnerHash.get(runner)==null){
                runnerHash.put(runner,1);
            }else{ // 이름 중복일때
                runnerHash.put(runner,runnerHash.get(runner)+1);
            }
        }
    }

    private void findComplete(String[] completion, Map<String,Integer> runnerHash){
        for(String runner:completion){ // 완주한 선수 key 값 0 만들기
           runnerHash.put(runner,runnerHash.get(runner)-1);
        }
    }

    private String getAnswer(Map<String,Integer> runnerHash){
        for(String runner:runnerHash.keySet()){
            if(runnerHash.get(runner)==1){
                return runner;
            }
        }
        return  null;
    }

    public String solution(String[] participant, String[] completion) {
        Map<String,Integer> runnerHash = new HashMap<>();
        insertPart(participant,runnerHash); // 참여자 hashmap insert
        findComplete(completion,runnerHash); // 완주하지 못한 사람 찾기

        return getAnswer(runnerHash);
    }

}
