import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer, -1);
        for(int i = 0; i < queries.length; i++){
            int x = queries[i][0];
            int y = queries[i][1];
            int z = queries[i][2];
            int min = Integer.MAX_VALUE;
            for(int j = x; j <= y; j++){
                if(arr[j] > z && arr[j] < min){
                    min = arr[j];
                }
            }
            if(min != Integer.MAX_VALUE){
                answer[i] = min;
            }
        }
        return answer;
    }
}