class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int hab = 0;
        for(int i:sides){
            hab += i;
        }
        for(int i: sides){
            if(hab - i > i) answer++;
        }
        if(answer == 3) answer = 1;
        return answer;
    }
}