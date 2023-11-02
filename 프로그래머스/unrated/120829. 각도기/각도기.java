class Solution {
    public int solution(int angle) {
        int answer = 0;
        if(angle >90){
            answer = (angle == 180)?4:3;
        }else{
            answer = (angle == 90)? 2:1;
        }
        return answer;
    }
}