class Solution {
    public int solution(int[][] arr) {
        int answer = 0;
        int len = arr.length;
        for(int i = 0; i<len; i++){
            for(int j = 0; j<len; j++){
                answer +=(arr[i][j]==arr[j][i])?1:0;
            }
        }
        return answer==len*len? 1:0;
    }
}