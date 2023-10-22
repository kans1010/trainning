class Solution {
    public int solution(String number) {
        int answer = 0;        
        for(char x : number.toCharArray()){
            answer = answer + (int) x-48;
        }
        return answer % 9;
    }
}