import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> x = new ArrayList<>();
        for(int i = 0; i<arr.length;i++){
            if(flag[i]==true){
                for(int j = 0; j<arr[i]*2;j++){
                    x.add(arr[i]);
                }
            }else{
                for(int j = 0; j<arr[i];j++){
                    x.remove(x.size()-1);
                }
            }
        }
        int[] answer = new int[x.size()];
        for(int i = 0; i < x.size(); i++){
            answer[i] = x.get(i).intValue();
        }
        return answer;
    }
}