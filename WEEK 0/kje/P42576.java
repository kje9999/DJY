package programmers;
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        Map<String, Integer> map = new HashMap<>(); // Map 만들기
        
        for (String name : participant) { //참여자 이름별로 카운트
            map.put(name, map.getOrDefault(name,0) + 1);
        }
        
        for (String name : completion) { //완주자 처리
            map.put(name, map.get(name) - 1);
        }
       
        for(String name : map.keySet()) {
            if(map.get(name) > 0) { // 0이 아니면 완주하지 못한 사람
                return name;
            }
        }
        
    return ""; //모두 완주했을 경우에도 리턴 해줘야함

    }
}


//이렇게 하면 중복 처리가 안됨 !!! ㅜㅜ 멍청이
/*
class Solution {
    public String solution(String[] participant, String[] completion) {
        
        List<String> answer = new ArrayList<>();
        
        for(int i = 0; i < participant.length; i++){
            int count = 0;
            for(int j = 0; j < completion.length; j++){
                if(participant[i].equals(completion[j])){
                    count++;
                }
            }
            if(count == 0){
                answer.add(participant[i]);
            }
        }
        
        return answer.get(0);
    }
}
*/