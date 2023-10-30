class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int x = (intervals[0][1]-intervals[0][0]+1)+
            (intervals[1][1]-intervals[1][0]+1);
        int[] answer = new int[x];
        int j = 0;
        for(int i = intervals[0][0]; i<=intervals[0][1];i++){
            answer[j] = arr[i]; j++;
        }for(int i = intervals[1][0]; i<=intervals[1][1];i++){
            answer[j] = arr[i]; j++;
        }
        
        return answer;
    }
}