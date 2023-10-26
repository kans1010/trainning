class Solution {
    public String solution(String my_string, int s, int e) {
        char[] answer = my_string.toCharArray();
        for(int i = s; i <=(s+e)/2; i++){
            char temp = answer[i];
            answer[i] = answer[s+e-i];
            answer[s+e-i] = temp;
        }
        return String.valueOf(answer);
    }
}