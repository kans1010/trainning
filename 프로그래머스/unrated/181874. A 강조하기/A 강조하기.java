class Solution {
    public String solution(String myString) {
        char[] arr = myString.toLowerCase().toCharArray();
        String answer = "";
        for(int i = 0; i<arr.length;i++){
            arr[i] = (arr[i]=='a')? 'A':arr[i];
            answer +=arr[i];
        }
        return answer;
    }
}