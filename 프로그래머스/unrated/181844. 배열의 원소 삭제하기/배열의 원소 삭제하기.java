import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<arr.length; i++){
        int match = 0; 
            for(int j:delete_list){
                match += (arr[i]==j)? 1:0;
            }
            if(match == 0){
                list.add(arr[i]);
            }
        }
        int[] answer = list.stream().mapToInt(x ->x).toArray();
        return answer;
    }
}