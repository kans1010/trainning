import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int s = Integer.MAX_VALUE; int e = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            if(arr[i] == 2){
                s = Math.min(s,i);
                e = Math.max(e,i);
            }
        }
        if(s<=e){
            answer = Arrays.copyOfRange(arr,s,e+1);
        }else{ return new int[] {-1};}
        return answer;
    }
}