class Solution {
    public int[] solution(int start_num, int end_num) {
        int a = end_num - start_num + 1;
        int[] answer = new int[a];
        for(int i = 0; i < a; i++){
            answer[i] = start_num;
            start_num++;
        }
        return answer;
    }
}