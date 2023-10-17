class Solution {
    public int solution(int a, int d, boolean[] included) {
        int n = included.length;
        int answer = 0;
        for(int i = 0; i < n; i++){
            answer += (included[i] == true)? a + d * i : 0;
        }
        return answer;
    }
}