class Solution {
    public int solution(String num_str) {
        int answer = 0;
        char[] numArr = num_str.toCharArray();
        for(char i:numArr){
            answer+=(i-48);
        }
        return answer;
    }
}