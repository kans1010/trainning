import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int[][] rankIdx = new int[rank.length][2];
        for(int i= 0; i<rank.length;i++){
            rankIdx[i][0] = rank[i];
            rankIdx[i][1] = i;
        }
        Arrays.sort(rankIdx,(a,b)-> a[0] - b[0]);
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i<attendance.length;i++){
            if(attendance[rankIdx[i][1]]){
                result.add(rankIdx[i][1]);
            }
        }
        answer = result.get(0)*10000+result.get(1)*100+result.get(2);
        return answer;
    }
}