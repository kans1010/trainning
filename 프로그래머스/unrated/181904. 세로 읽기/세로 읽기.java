class Solution {
    public String solution(String my_string, int m, int c) {
        char[] arr = my_string.toCharArray();
        String answer = "";
        for(int i = 0; i < arr.length; i++){
            if(i%m == c-1){
                answer +=arr[i];
            }
        }
        return answer;
    }
}