import java.util.*;

public class Solution {
	public int[] solution(int[] arr) {
		int[] answer = {};
		int[] answer2 = {};
		for (int i = 0; i < answer.length; i++) {
			if (i==0) {
			answer2[i]=answer[i];
			}
			if (i > 0) {
				int j=0;
				if (answer[j] != answer[i]) {
					answer2[j]=answer[i];
					j++;
				}
				
			}
			
	
		}

		return answer2;
	}
	
	public static void main(String[] args) {
		Solution s=new Solution();
		int[] answer = {1, 1, 3, 3, 0, 1, 1};
		
		System.out.println(s.solution(answer));
		
	}
}