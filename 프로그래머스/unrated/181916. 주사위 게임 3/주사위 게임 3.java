import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] arr = {a,b,c,d};
        Arrays.sort(arr);
        if(arr[0] == arr[3]){
            answer = arr[0]*1111;
        }else if(arr[0] == arr[2]){
            answer = (int)Math.pow(10.00*arr[0]+arr[3],2);
        }
        else if((arr[1] == arr[3])){
            answer = (int)Math.pow(10.00*arr[1]+arr[0],2);            
        }
        else if(arr[0] == arr[1] && arr[2] ==arr[3]){
            answer = (arr[0]+arr[2])*Math.abs(arr[0]-arr[2]);
        }
        else if(arr[0] == arr[1]||arr[1] == arr[2]||arr[2] == arr[3]){
            if(arr[0] == arr[1]){
                answer = arr[2]*arr[3];
            }else if(arr[1] == arr[2]){
                answer = arr[0]*arr[3];
            }else if(arr[2] == arr[3]){
                answer = arr[0]*arr[1];
            }
        }
        else if(arr[0] != arr[1] && arr[1] != arr[2] && arr[2] !=arr[3]){
            answer = arr[0];
        }
        return answer;
    }
}