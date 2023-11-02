class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int x = 1;
        if(num_list.length>10){
            for(int i:num_list){
                answer +=i;
            }
        }else{
            for(int i:num_list){
                x *=i;
            }return x;
        }
        return answer;
    }
}