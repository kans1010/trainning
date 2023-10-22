import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>(); 
        for(int i = l; i <= r; i++){
            String str = i + "";
            int count = 0;
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) == '0' || str.charAt(j) == '5') {
                    count ++;
                }
            }if(count == str.length()){
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0 ; i < list.size() ; i++) {
        answer[i] = list.get(i).intValue();}
        int[] empty = {-1};
        return (answer.length == 0)? empty: answer;
    }
}