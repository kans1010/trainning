class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] arr = myString.toCharArray();
        for(int i=0; i<arr.length;i++){
            answer += (arr[i]>108)? String.valueOf(arr[i]):"l";
        }
        return answer;
    }
}