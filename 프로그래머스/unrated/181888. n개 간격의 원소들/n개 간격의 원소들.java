class Solution {
    public int[] solution(int[] num_list, int n) {
        int x = (int)Math.ceil(num_list.length*1.0/n);
        int[] answer = new int[x];
            int j = 0; 
        for(int i = 0; i < num_list.length; i+=n){
            answer[j] = num_list[i]; j++;
        }
        return answer;
    }
}