package programmers;

import java.util.*; // 이것도 생각 안나더라 ..

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] answer = new int[commands.length]; // 배열 생성하는거 .. new 자료형 [길이]
        
        for(int i = 0; i < commands.length; i++){ //commands.length() -> X
            
            int[] sliced = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            
            Arrays.sort(sliced);  //sort는 반환값이 없음 ...
            
            answer[i] = sliced[commands[i][2]-1];
        }
        
        return answer;
    }
}

// K번째 수
// 프로그래머스는 1-based 라는 점 기억하기
//  Arrays.copyOfRange 는 끝을 포함하지 않으니까 끝 값은 그대로 써도 됨
// V 아래처럼 변수에 넣으면 더 깔 - 끔
/* 
import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1; // 시작 index (1-based → 0-based)
            int end = commands[i][1];       // 끝 index는 copyOfRange에서 그대로 써도 됨
            int k = commands[i][2] - 1;     // k번째도 0-based로 변환

            int[] sliced = Arrays.copyOfRange(array, start, end);
            Arrays.sort(sliced);
            answer[i] = sliced[k];
        }

        return answer;
    }
}
*/