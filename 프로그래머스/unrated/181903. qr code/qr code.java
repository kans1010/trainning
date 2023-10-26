class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        char[] arr = code.toCharArray();
        for(int i = r; i < arr.length; i+=q){
            answer += arr[i];
        }
        return answer;
    }
}