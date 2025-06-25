package Day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class K번째수 {
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
				
	} // main

	public int[] solution(int[] array, int[][] commands) {
        
		int idx = 0;
		int [] answer = new int [commands.length];
		
		for (int c = 0; c < commands.length; c++) {
			int i = commands[c][0]; // i행부터
			int j = commands[c][1]; // j까지
			int k = commands[c][2]; // k번째 뽑기
			
			int [] temp = new int [j-i+1];
			// 자르기
			for (int l = 0; l < temp.length; l++) {
				temp[l] = array[i-1+l];
			}
			
			Arrays.sort(temp);
			
			answer[idx] = temp[k-1];
			idx++;
		}
		
		
		
		return answer;
	} // solution
}
