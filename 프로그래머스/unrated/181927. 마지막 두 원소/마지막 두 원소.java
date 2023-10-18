class Solution {
    public int[] solution(int[] num_list) {
        int[] answer =  new int[num_list.length+1];
        for(int i = 1; i <= num_list.length; i++){
            answer[i-1] = num_list[i-1];
            if(num_list.length - i == 0){
                answer[i]  = (num_list[i-1]>num_list[i-2])?
                    num_list[i-1]-num_list[i-2] : 2 * num_list[i-1];
            }
        }
        return answer;
    }
}